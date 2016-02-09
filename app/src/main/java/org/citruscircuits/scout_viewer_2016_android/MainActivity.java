package org.citruscircuits.scout_viewer_2016_android;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.Toast;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import org.citruscircuits.scout_viewer_2016_android.drawer_fragments.CitrusScheduleFragment;
import org.citruscircuits.scout_viewer_2016_android.drawer_fragments.FirstPickAbilityFragment;
import org.citruscircuits.scout_viewer_2016_android.drawer_fragments.PredictedSeedingFragment;
import org.citruscircuits.scout_viewer_2016_android.drawer_fragments.RecentMatchesFragment;
import org.citruscircuits.scout_viewer_2016_android.drawer_fragments.ScheduleFragment;
import org.citruscircuits.scout_viewer_2016_android.drawer_fragments.SuperAbilityFragment;
import org.citruscircuits.scout_viewer_2016_android.drawer_fragments.second_pick.SecondPickAbilityFragment;
import org.citruscircuits.scout_viewer_2016_android.drawer_fragments.SeedingFragment;
import org.citruscircuits.scout_viewer_2016_android.drawer_fragments.UpcomingMatchesFragment;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        onSectionAttached(0);

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

        Log.e("test", "Logcat is up!");

        Firebase firebaseRef = new Firebase("https://1678-dev2-2016.firebaseio.com");

        Firebase.AuthResultHandler authResultHandler = new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) {
                // Do nothing if authenticated
            }

            @Override
            public void onAuthenticationError(FirebaseError firebaseError) {
                Context context = getApplicationContext();
                CharSequence text = "Invalid Permissions.";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        };

        firebaseRef.authWithPassword("1678programming@gmail.com", "Squeezecrush1", authResultHandler);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        Fragment fragment;
        FragmentManager fragmentManager = getSupportFragmentManager(); // For AppCompat use getSupportFragmentManager
        switch(position) {
            default:
            case 0:
                fragment = new RecentMatchesFragment();
                break;
            case 1:
                fragment = new UpcomingMatchesFragment();
                break;
            case 2:
                fragment = new CitrusScheduleFragment();
                break;
            case 3:
                fragment = new ScheduleFragment();
                break;
            case 4:
                fragment = new SeedingFragment();
                break;
            case 5:
                fragment = new PredictedSeedingFragment();
                break;
            case 6:
                fragment = new FirstPickAbilityFragment();
                break;
            case 7:
                fragment = new SecondPickAbilityFragment();
                break;
            case 8:
                fragment = new SuperAbilityFragment();
                break;
        }

        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
        onSectionAttached(position);
    }

    public void onSectionAttached(int number) {
        mTitle = Constants.DRAWER_TITLES[number];

    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


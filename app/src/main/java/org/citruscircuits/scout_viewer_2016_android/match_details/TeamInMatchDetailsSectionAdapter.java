package org.citruscircuits.scout_viewer_2016_android.match_details;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.widget.AdapterView;

import org.citruscircuits.scout_viewer_2016_android.Constants;
import org.citruscircuits.scout_viewer_2016_android.FirebaseLists;
import org.citruscircuits.scout_viewer_2016_android.MultitypeRankingsSectionAdapter;
import org.citruscircuits.scout_viewer_2016_android.RankingsActivity;
import org.citruscircuits.scout_viewer_2016_android.RankingsSectionAdapter;
import org.citruscircuits.scout_viewer_2016_android.Utils;
import org.citruscircuits.scout_viewer_2016_android.firebase_classes.Team;
import org.citruscircuits.scout_viewer_2016_android.firebase_classes.TeamInMatchData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by colinunger on 1/31/16.
 */
public class TeamInMatchDetailsSectionAdapter extends MultitypeRankingsSectionAdapter {
    private String[][] fieldsToDisplay = {{
            "numBallsKnockedOffMidlineAuto",
            "numHighShotsMadeAuto",
            "numHighShotsMissedAuto",
            "numLowShotsMadeAuto",
            "numLowShotsMissedAuto",
            "didReachAuto"
    }, {
            "numHighShotsMadeTele",
            "numHighShotsMissedTele",
            "numLowShotsMadeTele",
            "numLowShotsMissedTele",
            "numGroundIntakesTele",
            "numShotsBlockedTele",
    }, {
            "didChallengeTele",
            "didScaleTele"
    }, {
            "rankTorque",
            "rankSpeed",
            "rankEvasion",
            "rankDefense",
            "rankBallControl",
            "superNotes"
    }};

    private String[] sectionTitles = {"Auto", "Tele", "Siege", "Super"};

    private String[] shouldDisplayAsPercentage = {};

    private String[] displayAsUnranked = {"superNotes", "didChallengeTele", "didScaleTele"};

    private String[] shouldDisplayAsLongText = {"superNotes"};
    private Integer teamNumber;
    private Integer matchNumber;

    public TeamInMatchDetailsSectionAdapter(Context context, Integer teamNumber, Integer matchNumber) {
        super(context);
        this.teamNumber = teamNumber;
        this.matchNumber = matchNumber;
    }

    @Override
    public boolean isUnranked(int section, int row) {
        return false;
    }

    @Override
    public boolean isOtherTypeOfView(int section, int row) {
        return false;
    }

    @Override
    public View getOtherTypeOfView(int section, int row) {
        return null;
    }

    @Override
    public void onRowItemClick(AdapterView<?> parent, View view, int section, int row, long id) {
//        Intent rankingsActivityIntent = new Intent(context, RankingsActivity.class);
//        rankingsActivityIntent.putExtra("field", (String) getRowItem(section, row));

//        context.startActivity(rankingsActivityIntent);
    }

    @Override
    public String[][] getFieldsToDisplay() {
        return fieldsToDisplay;
    }

    @Override
    public String[] getSectionTitles() {
        return sectionTitles;
    }

    @Override
    public String[] getUnrankedFields() {
        return displayAsUnranked;
    }

    @Override
    public String[] getLongTextFields() {
        return shouldDisplayAsLongText;
    }

    @Override
    public String[] getPercentageFields() {
        return shouldDisplayAsPercentage;
    }

    @Override
    public String getUpdatedAction() {
        return Constants.TEAM_IN_MATCH_DATAS_UPDATED_ACTION;
    }

    @Override
    public Object getObject() {
        return FirebaseLists.teamInMatchDataList.getFirebaseObjectByKey(teamNumber.toString() + "Q" + matchNumber.toString());
    }

    @Override
    public List<Object> getObjectList() {
        List<Object> objects = new ArrayList<>();
        objects.addAll(FirebaseLists.teamInMatchDataList.getValues());
        return objects;
    }
}

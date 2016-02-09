package org.citruscircuits.scout_viewer_2016_android.drawer_fragments.abstract_classes;

import android.content.Context;

import org.citruscircuits.scout_viewer_2016_android.Constants;
import org.citruscircuits.scout_viewer_2016_android.FirebaseLists;
import org.citruscircuits.scout_viewer_2016_android.firebase_classes.Team;

import java.util.List;

/**
 * Created by colinunger on 1/31/16.
 */
public abstract class TeamRankingsAdapter extends RankingsAdapter<Team> {
    public TeamRankingsAdapter(Context context, String rankFieldName, String valueFieldName, boolean isNotReversed) {
        super(context, rankFieldName, valueFieldName, isNotReversed);
    }

    @Override
    public boolean filter(Team value, String scope) {
        String teamNumberString = value.number.toString();
        return teamNumberString.indexOf(searchString) == 0;
    }

    @Override
    public List<Team> getFirebaseList() {
        return FirebaseLists.teamsList.getValues();
    }

    @Override
    public String getBroadcastAction() {
        return Constants.TEAMS_UPDATED_ACTION;
    }

    @Override
    public String getRankCellText(Team value) {
        return value.number.toString();
    }
}

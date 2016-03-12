package org.citruscircuits.scout_viewer_2016_android;

import android.graphics.Color;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by citruscircuits on 1/16/16.
 */
public class Constants {
    public static final String ROOT_FIREBASE_PATH = "https://1678-scouting-2016.firebaseio.com/";
    public static final String[] DRAWER_TITLES = {"Recent Matches", "Upcoming Matches", "Our Schedule", "Starred Matches", "Schedule", "Seeding", "Predicted Seeding", "First Pick", "Second Pick", "Super Data"};
    public static final String MATCHES_PATH = ROOT_FIREBASE_PATH + "Matches";
    public static final String TEAMS_PATH = ROOT_FIREBASE_PATH + "Teams";
    public static final String TEAM_IN_MATCH_DATAS_PATH = ROOT_FIREBASE_PATH + "TeamInMatchDatas";
    public static final String TEAMS_UPDATED_ACTION = "org.citruscircuits.scout_viewer_2016_android.teamsupdated";
    public static final String MATCHES_UPDATED_ACTION = "org.citruscircuits.scout_viewer_2016_android.matchesupdated";
    public static final String TEAM_IN_MATCH_DATAS_UPDATED_ACTION = "org.citruscircuits.scout_viewer_2016_android.teaminmatchdatasupdated";
    public static final String NEW_TEAM_PHOTO_ACTION = "org.citruscircuits.scout_viewer_2016_android.newteamphoto";
    public static final String NEW_MATCH_PLAYED_ACTION = "org.citruscircuits.scout_viewer_2016_android.newmatchplayed";
    public static final String STARS_MODIFIED_ACTION = "org.citruscircuits.scout_viewer_2016_android.starsmodified";
    public static final String[] MATCH_SCOPES = {"Match", "Team"};
    public static final String[] TEAM_SCOPES = {"Team"};
    public static final int STAR_COLOR = Color.argb(255, 255, 255, 204);
    public static final int TEAM_NUMBER = 1678;
    public static final Map<String, String> KEYS_TO_TITLES = new HashMap<String, String> () {
        {
            put("calculatedData.avgHighShotsAuto", "Avg. Auto High Shots");
            put("calculatedData.avgLowShotsAuto", "Avg. Auto Low Shots");
            put("calculatedData.avgHighShotsTele", "Avg. Tele High Shots");
            put("calculatedData.avgLowShotsTele", "Avg. Tele Low Shots");
            put("pitFrontBumperWidth", "Bumper Width");
            put("pitLowBarCapability", "Can Low Bar?");
            put("pitPotentialLowBarCapability", "Could Low Bar?");
            put("pitPotentialMidlineBallCapability", "Could Midline?");
            put("pitDriveBaseWidth", "Base Width");
            put("pitDriveBaseLength", "Base Length");
            put("pitBumperHeight", "Bumper Height");
            put("pitPotentialShotBlockerCapability", "Could Block?");
            put("pitNotes", "Notes");
            put("pitOrganization", "Pit Organization");
            put("pitNumberOfWheels", "Num. Wheels");
            put("calculatedData.firstPickAbility", "First Pick Ability");
            put("calculatedData.secondPickAbility", "Second Pick Ability");
            put("calculatedData.driverAbility", "Driver Ability");
            put("calculatedData.highShotAccuracyAuto", "Auto High Shot Acc.");
            put("calculatedData.lowShotAccuracyAuto", "Auto Low Shot Acc.");
            put("calculatedData.highShotAccuracyTele", "Tele High Shot Acc.");
            put("calculatedData.lowShotAccuracyTele", "Tele Low Shot Acc.");
            put("calculatedData.avgGroundIntakes", "Avg. Ground Intakes");
            put("calculatedData.avgHighShotsTele", "Avg. Tele High");
            put("calculatedData.avgLowShotsTele", "Avg. Tele Low");
            put("calculatedData.avgShotsBlocked", "Avg. Shots Blocked");
            put("calculatedData.avgHighShotsAuto", "Avg. Auto High");
            put("calculatedData.avgLowShotsAuto", "Avg. Auto Low");
            put("calculatedData.avgMidlineBallsIntakedAuto", "Avg. Mid. Balls");
            put("calculatedData.avgBallsKnockedOffMidlineAuto", "Avg. Mid. Knocked");
            put("calculatedData.avgTorque", "Avg. Torque");
            put("calculatedData.avgSpeed", "Avg. Speed");
            put("calculatedData.avgEvasion", "Avg. Evasion");
            put("calculatedData.avgDefense", "Avg. Defense");
            put("calculatedData.avgBallControl", "Avg. Ball Control");
            put("calculatedData.RScoreTorque", "Torque");
            put("calculatedData.RScoreSpeed", "Speed");
            put("calculatedData.RScoreEvasion", "Evasion");
            put("calculatedData.RScoreDefense", "Defense");
            put("calculatedData.RScoreBallControl", "Ball Control");
            put("calculatedData.RScoreDrivingAbility", "Driving Ability");
            put("calculatedData.disfunctionalPercentage", "Disfunctional");
            put("calculatedData.reachPercentage", "Reach");
            put("calculatedData.disabledPercentage", "Disabled");
            put("calculatedData.incapacitatedPercentage", "Incapacitated");
            put("calculatedData.scalePercentage", "Scale");
            put("calculatedData.challengePercentage", "Challenge");
            put("calculatedData.siegePower", "Siege Power");
            put("calculatedData.siegeConsistency", "Siege Consistency");
            put("calculatedData.siegeAbility", "Siege Ability");
            put("calculatedData.predictedNumRPs", "Predicted RPs");
            put("calculatedData.numRPs", "Num. RPs");
            put("calculatedData.numAutoPoints", "Num. Auto Pts.");
            put("calculatedData.numScaleAndChallengePoints", "Num. S&C Pts.");
            put("calculatedData.predictedSeed", "Predicted Seed");
            put("calculatedData.actualSeed", "Seed");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.pc", "Avg. Auto PC Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.cdf", "Avg. Auto CDF Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.mt", "Avg. Auto MT Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.rp", "Avg. Auto RP Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.db", "Avg. Auto DB Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.sp", "Avg. Auto SP Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.rw", "Avg. Auto RW Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.rt", "Avg. Auto RT Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.lb", "Avg. Auto LB Cross");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.pc", "Avg. Auto PC Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.cdf", "Avg. Auto CDF Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.mt", "Avg. Auto MT Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.rp", "Avg. Auto RP Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.db", "Avg. Auto DB Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.sp", "Avg. Auto SP Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.rw", "Avg. Auto RW Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.rt", "Avg. Auto RT Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.lb", "Avg. Auto LB Fails");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.pc", "Avg. Tele PC Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.cdf", "Avg. Tele CDF Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.mt", "Avg. Tele MT Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.rp", "Avg. Tele RP Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.db", "Avg. Tele DB Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.sp", "Avg. Tele SP Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.rw", "Avg. Tele RW Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.rt", "Avg. Tele RT Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.lb", "Avg. Tele LB Cross");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.pc", "Avg. Tele PC Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.cdf", "Avg. Tele CDF Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.mt", "Avg. Tele MT Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.rp", "Avg. Tele RP Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.db", "Avg. Tele DB Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.sp", "Avg. Tele SP Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.rw", "Avg. Tele RW Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.rt", "Avg. Tele RT Fails");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.lb", "Avg. Tele LB Fails");
            put("calculatedData.twoBallAutoAccuracy", "Two Ball Auto Accuracy");
            put("calculatedData.twoBallAutoAttemptedPercentage", "Two Ball Auto Attempted");
            put("didGetIncapacitated", "Incapacitated?");
            put("didGetDisabled", "Disabled?");
            put("rankTorque", "Torque");
            put("rankSpeed", "Speed");
            put("rankEvasion", "Evasion");
            put("rankDefense", "Defense");
            put("rankBallControl", "Ball Control");
            put("ballsIntakedAuto", "Mid. Balls Int.");
            put("numHighShotsMadeAuto", "Auto High Shots");
            put("numLowShotsMadeAuto", "Auto Low Shots");
            put("numHighShotsMissedAuto", "Auto High Misses");
            put("numLowShotsMissedAuto", "Auto Low Misses");
            put("didReachAuto", "Reach?");
            put("numHighShotsMadeTele", "Tele High Shots");
            put("numLowShotsMadeTele", "Tele Low Shots");
            put("numHighShotsMissedTele", "Tele High Misses");
            put("numLowShotsMissedTele", "Tele Low Misses");
            put("numGroundIntakesTele", "Tele Ground Intakes");
            put("numShotsBlockedTele", "Shots Blocked");
            put("didScaleTele", "Scale?");
            put("didChallengeTele", "Challenge?");
            put("timesSuccessfulCrossedDefensesTele.pc", "Tele PC Cross");
            put("timesSuccessfulCrossedDefensesTele.cdf", "Tele CDF Cross");
            put("timesSuccessfulCrossedDefensesTele.mt", "Tele MT Cross");
            put("timesSuccessfulCrossedDefensesTele.rp", "Tele RP Cross");
            put("timesSuccessfulCrossedDefensesTele.db", "Tele DB Cross");
            put("timesSuccessfulCrossedDefensesTele.sp", "Tele SP Cross");
            put("timesSuccessfulCrossedDefensesTele.rw", "Tele RW Cross");
            put("timesSuccessfulCrossedDefensesTele.rt", "Tele RT Cross");
            put("timesSuccessfulCrossedDefensesTele.lb", "Tele LB Cross");
            put("timesFailedCrossedDefensesTele.pc", "Tele PC Fail");
            put("timesFailedCrossedDefensesTele.cdf", "Tele CDF Fail");
            put("timesFailedCrossedDefensesTele.mt", "Tele MT Fail");
            put("timesFailedCrossedDefensesTele.rp", "Tele RP Fail");
            put("timesFailedCrossedDefensesTele.db", "Tele DB Fail");
            put("timesFailedCrossedDefensesTele.sp", "Tele SP Fail");
            put("timesFailedCrossedDefensesTele.rw", "Tele RW Fail");
            put("timesFailedCrossedDefensesTele.rt", "Tele RT Fail");
            put("timesFailedCrossedDefensesTele.lb", "Tele LB Fail");
            put("timesSuccessfulCrossedDefensesAuto.pc", "Auto PC Cross");
            put("timesSuccessfulCrossedDefensesAuto.cdf", "Auto CDF Cross");
            put("timesSuccessfulCrossedDefensesAuto.mt", "Auto MT Cross");
            put("timesSuccessfulCrossedDefensesAuto.rp", "Auto RP Cross");
            put("timesSuccessfulCrossedDefensesAuto.db", "Auto DB Cross");
            put("timesSuccessfulCrossedDefensesAuto.sp", "Auto SP Cross");
            put("timesSuccessfulCrossedDefensesAuto.rw", "Auto RW Cross");
            put("timesSuccessfulCrossedDefensesAuto.rt", "Auto RT Cross");
            put("timesSuccessfulCrossedDefensesAuto.lb", "Auto LB Cross");
            put("timesFailedCrossedDefensesAuto.pc", "Auto PC Fail");
            put("timesFailedCrossedDefensesAuto.cdf", "Auto CDF Fail");
            put("timesFailedCrossedDefensesAuto.mt", "Auto MT Fail");
            put("timesFailedCrossedDefensesAuto.rp", "Auto RP Fail");
            put("timesFailedCrossedDefensesAuto.db", "Auto DB Fail");
            put("timesFailedCrossedDefensesAuto.sp", "Auto SP Fail");
            put("timesFailedCrossedDefensesAuto.rw", "Auto RW Fail");
            put("timesFailedCrossedDefensesAuto.rt", "Auto RT Fail");
            put("timesFailedCrossedDefensesAuto.lb", "Auto LB Fail");
            put("superNotes", "Notes");
            put("numBallsKnockedOffMidlineAuto", "Knocked Off Mid.");
            put("numBallsKnockedOffMidlineAuto", "Knocked Off Mid.");
            put("calculatedData.citrusDPR", "Citrus DPR");
            put("calculatedData.overallSecondPickAbility", "Overall Second Pick Ability");
            put("cdf", "Cheval de Frise");
            put("pc", "Portcullis");
            put("mt", "Moat");
            put("rp", "Ramparts");
            put("db", "Drawbridge");
            put("sp", "Sally Port");
            put("rt", "Rough Terrain");
            put("rw", "Rock Wall");
            put("lb", "Low Bar");
            put("calculatedData.avgSuccessfulTimesCrossedDefenses.pc", "Avg. PC Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefenses.cdf", "Avg. CDF Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefenses.mt", "Avg. MT Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefenses.rp", "Avg. RP Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefenses.db", "Avg. DB Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefenses.sp", "Avg. SP Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefenses.rw", "Avg. RW Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefenses.rt", "Avg. RT Cross");
            put("calculatedData.avgSuccessfulTimesCrossedDefenses.lb", "Avg. LB Cross");
            put("calculatedData.avgTimeForDefenseCrossAuto.pc", "Avg. Time PC Auto");
            put("calculatedData.avgTimeForDefenseCrossAuto.cdf", "Avg. Time CDF Auto");
            put("calculatedData.avgTimeForDefenseCrossAuto.mt", "Avg. Time MT Auto");
            put("calculatedData.avgTimeForDefenseCrossAuto.rp", "Avg. Time RP Auto");
            put("calculatedData.avgTimeForDefenseCrossAuto.db", "Avg. Time DB Auto");
            put("calculatedData.avgTimeForDefenseCrossAuto.sp", "Avg. Time SP Auto");
            put("calculatedData.avgTimeForDefenseCrossAuto.rw", "Avg. Time RW Auto");
            put("calculatedData.avgTimeForDefenseCrossAuto.rt", "Avg. Time RT Auto");
            put("calculatedData.avgTimeForDefenseCrossAuto.lb", "Avg. Time LB Auto");

            put("calculatedData.avgTimeForDefenseCrossTele.pc", "Avg. Time PC Tele");
            put("calculatedData.avgTimeForDefenseCrossTele.cdf", "Avg. Time CDF Tele");
            put("calculatedData.avgTimeForDefenseCrossTele.mt", "Avg. Time MT Tele");
            put("calculatedData.avgTimeForDefenseCrossTele.rp", "Avg. Time RP Tele");
            put("calculatedData.avgTimeForDefenseCrossTele.db", "Avg. Time DB Tele");
            put("calculatedData.avgTimeForDefenseCrossTele.sp", "Avg. Time SP Tele");
            put("calculatedData.avgTimeForDefenseCrossTele.rw", "Avg. Time RW Tele");
            put("calculatedData.avgTimeForDefenseCrossTele.rt", "Avg. Time RT Tele");
            put("calculatedData.avgTimeForDefenseCrossTele.lb", "Avg. Time LB Tele");

            put("calculatedData.predictedSuccessfulCrossingsForDefenseTele.pc", "Predicted Cross PC Tele");
            put("calculatedData.predictedSuccessfulCrossingsForDefenseTele.cdf", "Predicted Cross CDF Tele");
            put("calculatedData.predictedSuccessfulCrossingsForDefenseTele.mt", "Predicted Cross MT Tele");
            put("calculatedData.predictedSuccessfulCrossingsForDefenseTele.rp", "Predicted Cross RP Tele");
            put("calculatedData.predictedSuccessfulCrossingsForDefenseTele.db", "Predicted Cross DB Tele");
            put("calculatedData.predictedSuccessfulCrossingsForDefenseTele.sp", "Predicted Cross SP Tele");
            put("calculatedData.predictedSuccessfulCrossingsForDefenseTele.rw", "Predicted Cross RW Tele");
            put("calculatedData.predictedSuccessfulCrossingsForDefenseTele.rt", "Predicted Cross RT Tele");
            put("calculatedData.predictedSuccessfulCrossingsForDefenseTele.lb", "Predicted Cross LB Tele");

            put("calculatedData.crossingsSuccessRateForDefenseAuto.pc", "Success Rate PC Auto");
            put("calculatedData.crossingsSuccessRateForDefenseAuto.cdf", "Success Rate CDF Auto");
            put("calculatedData.crossingsSuccessRateForDefenseAuto.mt", "Success Rate MT Auto");
            put("calculatedData.crossingsSuccessRateForDefenseAuto.rp", "Success Rate RP Auto");
            put("calculatedData.crossingsSuccessRateForDefenseAuto.db", "Success Rate DB Auto");
            put("calculatedData.crossingsSuccessRateForDefenseAuto.sp", "Success Rate SP Auto");
            put("calculatedData.crossingsSuccessRateForDefenseAuto.rw", "Success Rate RW Auto");
            put("calculatedData.crossingsSuccessRateForDefenseAuto.rt", "Success Rate RT Auto");
            put("calculatedData.crossingsSuccessRateForDefenseAuto.lb", "Success Rate LB Auto");

            put("calculatedData.crossingsSuccessRateForDefenseTele.pc", "Success Rate PC Tele");
            put("calculatedData.crossingsSuccessRateForDefenseTele.cdf", "Success Rate CDF Tele");
            put("calculatedData.crossingsSuccessRateForDefenseTele.mt", "Success Rate MT TelRPe");
            put("calculatedData.crossingsSuccessRateForDefenseTele.rp", "Success Rate RP Tele");
            put("calculatedData.crossingsSuccessRateForDefenseTele.db", "Success Rate DB Tele");
            put("calculatedData.crossingsSuccessRateForDefenseTele.sp", "Success Rate SP Tele");
            put("calculatedData.crossingsSuccessRateForDefenseTele.rw", "Success Rate RW Tele");
            put("calculatedData.crossingsSuccessRateForDefenseTele.rt", "Success Rate RT Tele");
            put("calculatedData.crossingsSuccessRateForDefenseTele.lb", "Success Rate LB Tele");

            put("calculatedData.sdSuccessfulDefenseCrossesAuto.pc", "Successes PC Auto");
            put("calculatedData.sdSuccessfulDefenseCrossesAuto.cdf", "Successes CDF Auto");
            put("calculatedData.sdSuccessfulDefenseCrossesAuto.mt", "Successes MT Auto");
            put("calculatedData.sdSuccessfulDefenseCrossesAuto.rp", "Successes RP Auto");
            put("calculatedData.sdSuccessfulDefenseCrossesAuto.db", "Successes DB Auto");
            put("calculatedData.sdSuccessfulDefenseCrossesAuto.sp", "Successes SP Auto");
            put("calculatedData.sdSuccessfulDefenseCrossesAuto.rw", "Successes RW Auto");
            put("calculatedData.sdSuccessfulDefenseCrossesAuto.rt", "Successes RT Auto");
            put("calculatedData.sdSuccessfulDefenseCrossesAuto.lb", "Successes LB Auto");

            put("calculatedData.sdSuccessfulDefenseCrossesTele.pc", "Successes PC Tele");
            put("calculatedData.sdSuccessfulDefenseCrossesTele.cdf", "Successes CDF Tele");
            put("calculatedData.sdSuccessfulDefenseCrossesTele.mt", "Successes MT Tele");
            put("calculatedData.sdSuccessfulDefenseCrossesTele.rp", "Successes RP Tele");
            put("calculatedData.sdSuccessfulDefenseCrossesTele.db", "Successes DB Tele");
            put("calculatedData.sdSuccessfulDefenseCrossesTele.sp", "Successes SP Tele");
            put("calculatedData.sdSuccessfulDefenseCrossesTele.rw", "Successes RW Tele");
            put("calculatedData.sdSuccessfulDefenseCrossesTele.rt", "Successes RT Tele");
            put("calculatedData.sdSuccessfulDefenseCrossesTele.lb", "Successes LB Tele");

            put("calculatedData.sdFailedDefenseCrossesAuto.pc", "Fails PC Auto");
            put("calculatedData.sdFailedDefenseCrossesAuto.cdf", "Fails CDF Auto");
            put("calculatedData.sdFailedDefenseCrossesAuto.mt", "Fails MT Auto");
            put("calculatedData.sdFailedDefenseCrossesAuto.rp", "Fails RP Auto");
            put("calculatedData.sdFailedDefenseCrossesAuto.db", "Fails DB Auto");
            put("calculatedData.sdFailedDefenseCrossesAuto.sp", "Fails SP Auto");
            put("calculatedData.sdFailedDefenseCrossesAuto.rw", "Fails RW Auto");
            put("calculatedData.sdFailedDefenseCrossesAuto.rt", "Fails RT Auto");
            put("calculatedData.sdFailedDefenseCrossesAuto.lb", "Fails LB Auto");

            put("calculatedData.sdFailedDefenseCrossesTele.pc", "Fails PC Tele");
            put("calculatedData.sdFailedDefenseCrossesTele.cdf", "Fails CDF Tele");
            put("calculatedData.sdFailedDefenseCrossesTele.mt", "Fails MT Tele");
            put("calculatedData.sdFailedDefenseCrossesTele.rp", "Fails RP Tele");
            put("calculatedData.sdFailedDefenseCrossesTele.db", "Fails DB Tele");
            put("calculatedData.sdFailedDefenseCrossesTele.sp", "Fails SP Tele");
            put("calculatedData.sdFailedDefenseCrossesTele.rw", "Fails RW Tele");
            put("calculatedData.sdFailedDefenseCrossesTele.rt", "Fails RT Tele");
            put("calculatedData.sdFailedDefenseCrossesTele.lb", "Fails LB Tele");
            put("teamNumber", "Team Number");
            put("matchNumber", "Match Number");
            put("matches", "Matches");
        }
    };

    public static final Map<String, String> DATA_TO_GRAPH = new HashMap<String, String> () {
        {
            put("calculatedData.avgHighShotsAuto", "numHighShotsMadeAuto");
            put("calculatedData.avgLowShotsAuto", "numLowShotsMadeAuto");
            put("calculatedData.avgHighShotsTele", "numHighShotsMadeTele");
            put("calculatedData.avgLowShotsTele", "numLowShotsMadeTele");
            put("calculatedData.firstPickAbility", "calculatedData.firstPickAbility");
            put("calculatedData.highShotAccuracyAuto", "calculatedData.highShotAccuracyAuto");
            put("calculatedData.lowShotAccuracyAuto", "calculatedData.lowShotAccuracyAuto");
            put("calculatedData.highShotAccuracyTele", "calculatedData.highShotAccuracyTele");
            put("calculatedData.lowShotAccuracyTele", "calculatedData.lowShotAccuracyTele");
            put("calculatedData.avgGroundIntakes", "numGroundIntakesTele");
            put("calculatedData.avgHighShotsTele", "numHighShotsMadeTele");
            put("calculatedData.avgLowShotsTele", "numLowShotsMadeTele");
            put("calculatedData.avgShotsBlocked", "numShotsBlockedTele");
            put("calculatedData.avgHighShotsAuto", "numHighShotsMadeAuto");
            put("calculatedData.avgLowShotsAuto", "numLowShotsAuto");
            put("calculatedData.avgMidlineBallsIntakedAuto", "calculatedData.numBallsIntakedOffMidlineAuto");
            put("calculatedData.avgBallsKnockedOffMidlineAuto", "numBallsKnockedOffMidlineAuto");
            put("calculatedData.avgTorque", "rankTorque");
            put("calculatedData.avgSpeed", "rankSpeed");
            put("calculatedData.avgEvasion", "rankEvasion");
            put("calculatedData.avgDefense", "rankDefense");
            put("calculatedData.avgBallControl", "rankBallControl");
            put("calculatedData.RScoreTorque", "calculatedData.RScoreTorque");
            put("calculatedData.RScoreSpeed", "calculatedData.RScoreSpeed");
            put("calculatedData.RScoreEvasion", "calculatedData.RScoreEvasion");
            put("calculatedData.RScoreDefense", "calculatedData.RScoreDefense");
            put("calculatedData.RScoreBallControl", "calculatedData.RScoreBallControl");
            put("calculatedData.RScoreDrivingAbility", "calculatedData.RScoreDrivingAbility");
            put("calculatedData.reachPercentage", "didReachAuto");
            put("calculatedData.disabledPercentage", "didGetDisabled");
            put("calculatedData.incapacitatedPercentage", "didGetIncapacitated");
            put("calculatedData.scalePercentage", "didScaleTele");
            put("calculatedData.challengePercentage", "didChallengeTele");
            put("calculatedData.siegePower", "calculatedData.siegePower");
            put("calculatedData.siegeConsistency", "calculatedData.siegeConsistency");
            put("calculatedData.siegeAbility", "calculatedData.siegeAbility");
            put("calculatedData.numAutoPoints", "calculatedData.numAutoPoints");
            put("calculatedData.numScaleAndChallengePoints", "calculatedData.numScaleAndChallengePoints");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.pc", "timesSuccessfulCrossedDefensesAuto.pc");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.cdf", "timesSuccessfulCrossedDefensesAuto.cdf");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.mt", "timesSuccessfulCrossedDefensesAuto.mt");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.rp", "timesSuccessfulCrossedDefensesAuto.rp");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.db", "timesSuccessfulCrossedDefensesAuto.db");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.sp", "timesSuccessfulCrossedDefensesAuto.sp");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.rw", "timesSuccessfulCrossedDefensesAuto.rw");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.rt", "timesSuccessfulCrossedDefensesAuto.rt");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesAuto.lb", "timesSuccessfulCrossedDefensesAuto.lb");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.pc", "timesFailedCrossedDefensesAuto.pc");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.cdf", "timesFailedCrossedDefensesAuto.cdf");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.mt", "timesFailedCrossedDefensesAuto.mt");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.rp", "timesFailedCrossedDefensesAuto.rp");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.db", "timesFailedCrossedDefensesAuto.db");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.sp", "timesFailedCrossedDefensesAuto.sp");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.rw", "timesFailedCrossedDefensesAuto.rw");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.rt", "timesFailedCrossedDefensesAuto.rt");
            put("calculatedData.avgFailedTimesCrossedDefensesAuto.lb", "timesFailedCrossedDefensesAuto.lb");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.pc", "timesSuccessfulCrossedDefensesTele.pc");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.cdf", "timesSuccessfulCrossedDefensesTele.cdf");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.mt", "timesSuccessfulCrossedDefensesTele.mt");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.rp", "timesSuccessfulCrossedDefensesTele.rp");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.db", "timesSuccessfulCrossedDefensesTele.db");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.sp", "timesSuccessfulCrossedDefensesTele.sp");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.rw", "timesSuccessfulCrossedDefensesTele.rw");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.rt", "timesSuccessfulCrossedDefensesTele.rt");
            put("calculatedData.avgSuccessfulTimesCrossedDefensesTele.lb", "timesSuccessfulCrossedDefensesTele.lb");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.pc", "timesFailedCrossedDefensesTele.pc");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.cdf", "timesFailedCrossedDefensesTele.cdf");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.mt", "timesFailedCrossedDefensesTele.mt");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.rp", "timesFailedCrossedDefensesTele.rp");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.db", "timesFailedCrossedDefensesTele.db");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.sp", "timesFailedCrossedDefensesTele.sp");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.rw", "timesFailedCrossedDefensesTele.rw");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.rt", "timesFailedCrossedDefensesTele.rt");
            put("calculatedData.avgFailedTimesCrossedDefensesTele.lb", "timesFailedCrossedDefensesTele.lb");
            put("calculatedData.overallSecondPickAbility", "calculatedData.overallSecondPickAbility");
        }
    };
}

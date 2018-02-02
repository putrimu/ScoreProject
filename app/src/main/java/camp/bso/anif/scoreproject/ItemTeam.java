package camp.bso.anif.scoreproject;

/**
 * Created by MUL-09 on 2/02/2018.
 */

public class ItemTeam {
    private int mId;
    private String teamHome;
    private String teamAway;

    public ItemTeam() {}


    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(String teamHome) {
        this.teamHome = teamHome;
    }

    public String getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(String teamAway) {
        this.teamAway = teamAway;
    }
}
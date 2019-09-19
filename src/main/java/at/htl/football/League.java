package at.htl.football;

import java.util.ArrayList;
import java.util.List;

public class League {

   private List<Team> teams;
   int pos = 0;

    public void addTeams(Team team) {

        teams.add(pos, team);
        pos++;

    }

    public void addMatchResult(Match match) {

        for (int i = 0; i < teams.size(); i++) {

            System.out.println(teams.get(i));

        }

    }

    private Team findOrCreateTeam(String name) {
        return null;
    }

    public List<Team> getTable() {
        return null;
    }

}

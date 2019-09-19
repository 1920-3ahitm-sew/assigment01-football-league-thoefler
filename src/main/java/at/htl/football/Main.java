package at.htl.football;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String fileName = "bundesliga-1819.csv";
        String homeTeam;
        String guestTeam;
        int homeGoals;
        int guestGoals;

        List<String> lines = new ArrayList<>();

        League league = new League();

        try {

            lines = Files.readAllLines(Paths.get(fileName));

        } catch (IOException e) {
            e.printStackTrace();
        }


        for (int i = 1; i < lines.size(); i++) {

            if (i < 2) {
                for (int j = 1; j < lines.size(); j++) {
                    String[] matchInfo = lines.get(j).split(";");
                    homeTeam = matchInfo[1];
                    guestTeam = matchInfo[2];

                    league.addTeams(new Team(homeTeam));
                    league.addTeams(new Team(guestTeam));

                }
            }

            String[] matchInfo = lines.get(i).split(";");

            homeTeam = matchInfo[1];
            guestTeam = matchInfo[2];
            homeGoals = Integer.parseInt(matchInfo[3]);
            guestGoals = Integer.parseInt(matchInfo[4]);

            league.addMatchResult(new Match(homeTeam, guestTeam, homeGoals,guestGoals));

        }







    }

}

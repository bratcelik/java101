package FixtureBuilder;

import java.util.*;

public class FixtureBuilder {
    private ArrayList<String> teamList = new ArrayList<>();
    private int teamCount;

    public FixtureBuilder(String[] teamList) {
        this.teamCount = 0;
        for (String team : teamList){
            addTeam(team);
        }
    }

    public FixtureBuilder(){
        this.teamCount = 0;
    }

    public void getFixture(){
        if (this.teamCount %2 == 1){
            this.addTeam("Bay");
        }
        ArrayList<String> matchList2 = new ArrayList<>();
        Map<String,ArrayList<String>> sign = new HashMap<>();

        for (String team : this.teamList){
            sign.put(team,new ArrayList<String>());
            sign.get(team).add(team);
        }

        Random rand = new Random();
        int round = 1;
        while (round < this.teamCount){
            ArrayList<String> teams = new ArrayList<>();
            for (String team : this.teamList){
                teams.add(team);
            }

            String rand1,rand2;
            HashSet<String> roundList = new HashSet<>();

            System.out.println("\n\nRound "+round);
            matchList2.add("\n\nRound " + (round + this.teamCount -1));

            for (int i = 0; i < this.teamCount/2; i++){

                while (!roundList.add(rand1 = teams.get(rand.nextInt(teams.size()))));
                teams.remove(rand1);
                while (true) {
                    rand2 = teams.get(rand.nextInt(teams.size()));
                    if (!sign.get(rand1).contains(rand2) && !roundList.contains(rand2)){
                        break;
                    }
                }
                teams.remove(rand2);

                System.out.println(rand1 + " vs " + rand2);

                roundList.add(rand1);
                roundList.add(rand2);
                sign.get(rand1).add(rand2);
                sign.get(rand2).add(rand1);
                matchList2.add(rand2 + " vs " + rand1);

            }
            round++;
        }
        for (String match : matchList2){
            System.out.println(match);
        }
    }

    private String getRandTeam(int n){
        Random rand = new Random();
        return this.teamList.get(rand.nextInt(n));
    }

    public void addTeam(String team){
        if (isHas(team))
            return;
        teamCount++;
        this.teamList.add(team);
    }

    private boolean isHas(String team){
        return this.teamList.contains(team);
    }

    public ArrayList<String> getTeamList() {
        return teamList;
    }

    public int getTeamCount() {
        return teamCount;
    }
}

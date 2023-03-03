class Main1 {
    public static void main(String[] args) {
        // create a team and set its rank
        Team1 team1 = new Team1("Team 1");
        team1.setRank(1);

        // print the team's name and rank
        System.out.println(team1);

        // create 5 more teams and print them
        Team1 team2 = new Team1("Team 2");
        team2.setRank(3);
        System.out.println(team2);

        Team1 team3 = new Team1("Team 3");
        team3.setRank(5);
        System.out.println(team3);

        Team1 team4 = new Team1("Team 4");
        team4.setRank(5);
        System.out.println(team4);

        Team1 team5 = new Team1("Team 5");
        team5.setRank(7);
        System.out.println(team5);

        Team1 team6 = new Team1("Team 6");
        team6.setRank(2);
        System.out.println(team6);
    }
}


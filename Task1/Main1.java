class Main1 {
    public static void main(String[] args) {
        // create a team and set its rank
        Team1 team1 = new Team1("Example Team 1");
        team1.setRank(1);

        // print the team's name and rank
        System.out.println(team1);

        // create 5 more teams and print them
        Team1 team2 = new Team1("Example Team 2");
        System.out.println(team2);

        Team1 team3 = new Team1("Example Team 3");
        System.out.println(team3);

        Team1 team4 = new Team1("Example Team 4");
        System.out.println(team4);

        Team1 team5 = new Team1("Example Team 5");
        System.out.println(team5);

        Team1 team6 = new Team1("Example Team 6");
        System.out.println(team6);
    }
}


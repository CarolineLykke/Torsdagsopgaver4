class Team1 {
    private String name;
    private int rank;
    private String[] players;

    // Step 1.f
    public Team1(String name) {
        this.name = name;
    }

    // Step 1.h
    public void setRank(int rank) {
        this.rank = rank;
    }

    // Step 1.j
    @Override
    public String toString() {
        //skriver super. så jeg kan nedavle hvor den er blevet placeret
        return super.toString() + "Team Name: " + this.name + " Rank: " + this.rank;
    }
}


/*class Team1 {
    private String name;
    private int rank;
    private String[] players;

    public Team1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }

}
*/
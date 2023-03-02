class Team1 {
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
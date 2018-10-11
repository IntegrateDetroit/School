public enum Majors {
    ELECTRICAL_ENGINEERING("Electrical Engineering", 42),
    UNDECIDED("Undecided", 0), COMPUTER_SCIENCE("Computer Science", 44), HISTORY("History", 30), ALL("All", 0 );

    private String name;
    private int creditsRequired;

    Majors(String name, int creditsRequired){

        this.name = name;
        this.creditsRequired = creditsRequired;
    }

    public String getName() {
        return this.name;
    }

    public int getCreditsRequired() {
        return this.creditsRequired;
    }
}

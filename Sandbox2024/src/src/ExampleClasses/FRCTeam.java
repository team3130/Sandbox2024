package ExampleClasses;

public class FRCTeam {
    // INSTANCE VARIABLES
    int teamNumber;
    String teamName;
    int numOfMembers;
    boolean qualifiedToWorlds;
    double avgMatchScore;

    // CONSTRUCTOR
    public FRCTeam(int teamId, String name, int memberNum) {
        this.teamNumber = teamId;
        this.teamName = name;
        this.numOfMembers = memberNum;
    }

    // METHODS
    public int getTeamNumber() {
        return teamNumber;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public boolean isQualifiedToWorlds() {
        return qualifiedToWorlds;
    }
}
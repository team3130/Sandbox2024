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

    // MAIN
    public static void main(String[] args) {
        FRCTeam ERROR3130 = new FRCTeam(3130, "ERROR", 36);
        FRCTeam FightingCalculators2175 = new FRCTeam(2175, "Fighting Calculators", 20);
        System.out.println(ERROR3130.getNumOfMembers());
        System.out.println(FightingCalculators2175.getTeamNumber());
    }
}
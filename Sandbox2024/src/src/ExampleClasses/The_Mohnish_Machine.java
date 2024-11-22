package ExampleClasses;

public class The_Mohnish_Machine {
    public static void main(String[] args) {
        Baby_Mohnish normalMohnish = new Baby_Mohnish("Attention! bruh.", "INDIA", 18, 6.1, true, true, 1.5, "sly dog", true, 75, "caprisun", true);
        Baby_Mohnish babyMohnish = new Baby_Mohnish("Bruh", "mixed", 3, 3.5, false, false, 0.7, "good boy", false, 10, "aquarium", false);
        Baby_Mohnish superMohnish = new Baby_Mohnish("Super hero sized bite! For a super hero sized Appetite!", "obviously white", 20, 7.2, true, true, 5, "Monster Mohnish", true, 100, "tourist", false);
        Baby_Mohnish middleAgeMohnish = new Baby_Mohnish("Bone digadone!", "blasian", 34, 5.3, false, true, 1, "", true, 90, "hot",  true);

        System.out.println(
        "Normal Mohnish"
        );


        normalMohnish.isCoolOnlyIfUsesDotPom();
        normalMohnish.isHeAKeeper();
        normalMohnish.isCatchPhraseCool();

        System.out.println();
        System.out.println(
        "Baby Mohnish"
        );


        babyMohnish.isCoolOnlyIfUsesDotPom();
        babyMohnish.isHeAKeeper();


        System.out.println();
        System.out.println(
        "Super Mohnish"
        );


        superMohnish.isCoolOnlyIfUsesDotPom();
        superMohnish.isHeAKeeper();


        System.out.println();
        System.out.println(
        "Middle Aged Mohnish"
        );


        middleAgeMohnish.isCoolOnlyIfUsesDotPom();

        middleAgeMohnish.isHeAKeeper();




    }

}


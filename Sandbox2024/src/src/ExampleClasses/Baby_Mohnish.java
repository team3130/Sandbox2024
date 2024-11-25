package ExampleClasses;

public class Baby_Mohnish {
    public double height;
    public int age;
    public String catch_Phrase;
    public boolean good_At_Basketball;
    public boolean cool;
    public String ethnicity;
    public double width;
    public String nick_Name;
    public boolean uses_DotPom;
    public double dangerLevel;
    public String zodiacSign;
    public boolean isKeeper;

    public Baby_Mohnish(String catch_Phrase, String ethnicity, int age, double height, boolean good_At_Basketball, boolean cool, double width, String nick_Name, boolean uses_DotPom, double dangerLevel, String zodiacSign, boolean isKeeper) {
        this.catch_Phrase = catch_Phrase;
        this.ethnicity = ethnicity;
        this.height = height;
        this.good_At_Basketball = good_At_Basketball;
        this.cool = cool;
        this.width = width;
        this.nick_Name = nick_Name;
        this.uses_DotPom = uses_DotPom;
        this.dangerLevel = dangerLevel;
        this.age = age;
        this.zodiacSign = zodiacSign;
        this.isKeeper = isKeeper;
    }



    public boolean getDotPom() {
        return uses_DotPom;
    }

    public void isCoolOnlyIfUsesDotPom() {
        if (uses_DotPom) {
            System.out.println("He uses .pom! Awesome Sauce!");
        } else {
            System.out.println("He doesn't use .pom. uncool dude.");
        }
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void isHeAKeeper() {
        if (zodiacSign == "caprisun") {
            System.out.println("Caprisun! That's a keeper!");
        } else {
            System.out.println(isCompatible());
        }
    }

    public boolean isCompatible(){
    if (zodiacSign == "hot") {
        System.out.println("Hot! That's a keeper!");
        return isKeeper = true;
        } else {
        System.out.println("Not compatible, sorry!");
        return isKeeper = false;
        }
    }

    public void isCatchPhraseCool(){
        if (catch_Phrase == "bruh") {
            System.out.println("Catch Phrase Analysis = stupid catch phrase, death penalty");
        } else {
            System.out.println("Catch Prase Analysis = tippity top!");
        }
    }

    public void isDangerous(){
        if (dangerLevel >= 50) {
            System.out.println("Danger level: Danger Alert!");
        } else {
            System.out.println("Danger level: Pip squeek!");
        }
    }
}




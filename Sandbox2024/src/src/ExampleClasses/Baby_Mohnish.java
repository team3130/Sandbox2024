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

    public Baby_Mohnish(String catch_Phrase, String ethnicity, int age, double height, boolean good_At_Basketball, boolean cool, double width, String nick_Name, boolean uses_DotPom, double dangerLevel, String zodiacSign) {
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
    }

    public boolean setDotPom(boolean usesDotPom) {
        this.uses_DotPom = usesDotPom;
        return uses_DotPom;
    }

    public boolean getDotPom() {
        return uses_DotPom;
    }

    public boolean isCoolOnlyIfUsesDotPom() {
        if (uses_DotPom) {
            System.out.println("Cool!");
            return cool = true;
        } else {
            System.out.println("uncool dude");
            return cool = false;
        }
    }
}



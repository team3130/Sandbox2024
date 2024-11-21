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
    public double addHeight(int num) {
        return height + num; // note this doesn't actually modify the population, only returns the modified value
    }
    public String getCatch_Phrase() {
        System.out.println(this.catch_Phrase);
        return this.catch_Phrase;
    }



zz
}

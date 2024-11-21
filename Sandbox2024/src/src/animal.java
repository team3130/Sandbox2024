public class animal {

    public int length;
    public String name;
    public Double height;
    public int width;
    public double volume;
    public boolean wins;

    public animal(int length, String name,Double height, int width ) {
        this.length = length;
        this.name = name;
        this.height = height;
        this.width = width;

    }
    public boolean getWins()
    {return wins;}
    public String getName()

    {return name + " wins";}

    public Double getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getVolume(int length, Double height, int width) {
        double volume =  length * height * width;
        return volume;
    }

    public static void main(String[] args) {
        animal dog = new animal(10, "Gus", 12.9, 15 );
        animal cat = new animal(14, "tiger", 30.4, 13 );
        animal fish = new animal(3, "bubbles", 1.7, 4 );
        animal penguin = new animal(23, "Fuzzy", 2.3, 7 );
        animal dinosaur = new animal(90, "dino", 20.5, 10);

        System.out.println("dinosaur vs penguin");
                if (dinosaur.getVolume(dinosaur.getLength(),dinosaur.getHeight(),dinosaur.getWidth()) > penguin.getVolume(penguin.getLength(),penguin.getHeight(),penguin.getWidth()))
                    System.out.println(dinosaur.getName());

                else System.out.println(penguin.getName());

        System.out.println("fish vs cat");
            if (fish.getVolume(fish.getLength(),fish.getHeight(),fish.getWidth()) > cat.getVolume(cat.getLength(),cat.getHeight(),cat.getWidth()))
                System.out.println(fish.getName());

            else System.out.println(cat.getName());


    }
    }



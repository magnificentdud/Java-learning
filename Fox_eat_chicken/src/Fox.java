public class Fox {
    //first declare the class properties

    private int chickenCount;

    private String[] words;

//constructor method

    public Fox(){

        this.chickenCount = 0;

        this.words = new String[5];

        this.words[0] = "tasty";

        this.words[1] = "oishi";

        this.words[2] = "yummy";

        this.words[3] = "scrummy";

        this.words[4] = "bombastic";

    }

    public int getChickenCount(){

        return this.chickenCount;

    }

    public void eat(Chicken c){

        if(c.getTender()){

            this.chickenCount = this.chickenCount + 1;

            speak();

        }

    }

    public void speak(){

        int x = (int)(Math.random()*this.words.length);

        System.out.println("That was a "+this.words[x]+" chicken!!");

    }

    public String toString(){

        return "Chicken Count: "+this.chickenCount;

    }
}

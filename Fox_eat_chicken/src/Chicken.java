public class Chicken {
    //first declare the class properties

    private boolean tender;

//constructor method

    public Chicken(){

        int x = (int)(Math.random()*5);

        if(x%2==0){

            this.tender = true;

        }else{

            this.tender = false;

        }

    }

    public boolean getTender(){

        return this.tender;

    }


}

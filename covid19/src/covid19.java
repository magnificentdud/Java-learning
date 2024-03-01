// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class covid19 {
    static int totaltemp = 0;
    static int fine = 0;
    static int boutadie = 0;
    public static void main(String[] args) {
        gettemp();
    }
    public static void gettemp(){
        int temp;
        for (int i=0;i<100;i++) {
            temp = (int) (Math.random() * 22)+25;
            totaltemp = totaltemp + temp;
            tempdetermine(temp);
        }
        roomsneeded(boutadie);
        avgtmp();
        pandemic();

    }
    public static void tempdetermine(int t){
        if (t<37){
            fine = fine +1;
        }else{
            boutadie = boutadie+1;
        }

    }
    public static void roomsneeded(int patients){
        int rooms;

        if (patients%4 == 0){
            rooms = (int)(patients / 4);
        } else{
            rooms = (int)(patients / 4)+(patients%4);
        }

        System.out.println("There are "+rooms+" number of rooms needed");
        totalcost(rooms,patients%4);
    }
    public static void totalcost(int numrooms, int leftpatient){
        // one room has a fixed fee of 6$ and charges 120$ for every patient
        int cost1;
        cost1 = numrooms*6 + 4*120*numrooms;
        int cost2;
        cost2 = 6+120*leftpatient;
        int tcost;
        tcost = cost1+cost2;
        costperperson(tcost);
    }
    public static void costperperson(int cost){
        int cpp;
        cpp = (int)(cost/boutadie);
        System.out.println("each patient has to pay "+cpp);
    }
    public static void avgtmp(){
        int avgtemp;
        avgtemp = (int)(totaltemp/100);
        System.out.println("The average temperature is"+avgtemp);

    }
    public static void pandemic(){
        if(boutadie>50){
            System.out.println("there is a pandemic!");
            System.out.println("There are "+boutadie+" infections!");
        } else{
            System.out.println("its not a pandemic, so chill");
        }
    }
}
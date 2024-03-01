public class pirateship {
    public static void main(String[] args){
        collectmoney();

    }
    public static void collectmoney(){
        int ship1, ship2, ship3, ship4, ship5;
        ship1 = (int)(Math.random()*375);
        ship2 = (int)(Math.random()*375);
        ship3 = (int)(Math.random()*375);
        ship4 = (int)(Math.random()*375);
        ship5 = (int)(Math.random()*375);

        int totalmoney;
        totalmoney = ship1+ship2+ship3+ship4+ship5;
        determineParty(totalmoney);
    }
    public static void determineParty(int money){
        if (money < 1000){
            attackonemore(money);

        } else{
            goparty(money);
        }

    }
    public static void attackonemore(int monn){
        int ship6;
        ship6 = (int)(Math.random()*375);

        int totmon;
        totmon = ship6+monn;

        if (totmon < 1000){
            System.out.println("We earned "+totmon);
            System.out.println("Go home you're broke");
        } else{
            goparty(totmon);
        }


    }
    public static void goparty(int muni){

        for (int i=0; i<muni; i++){

            System.out.println("Gimme more RUM!");
        }
        System.out.println("We earned "+muni);
    }
}

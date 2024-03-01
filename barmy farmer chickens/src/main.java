public class main {
    public static void main(String[] args){
        Chicken one = new Chicken("MS08",5,7);
        Chicken two = new Chicken("ZQ72",6,3);

        for (int i=0;i<25;i++){
            int random1 = (int)(Math.random()*100);
            if (random1>50){
                one.laid+=1;
            }
            int random2 = (int)(Math.random()*100);
            if(random2>50){
                two.laid += 1;
            }

        }
        if(one.laid>two.laid){
            System.out.println(one.laid+two.laid);
            System.out.println(one.ID+" laid more eggs");
        }else if(one.laid<two.laid){
            System.out.println(one.laid+two.laid);
            System.out.println(two.ID+" laid more eggs");
        }
    }
}

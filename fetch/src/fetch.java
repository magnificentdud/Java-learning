// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class fetch {
    public static void main(String[] args) {

        fetch();
    }
    public static void fetch(){
        String[] instructionAddresses = getInstructionAddresses();
        String MDR;
        for(int i=0;i<instructionAddresses.length;i++){

            MDR = visitRAM(instructionAddresses[i]);

            if (MDR!= null){
                ControlUnit(MDR);
                ALU();
            }else{
                System.out.println("Possible Error!");
            }


        }

    }
    public static String[] getInstructionAddresses(){
        String[] addresses = {"#0","#1","#2","#3","#4","#5"};

        return addresses;
    }
    public static String visitRAM(String s){

        String[][] RAM = {
                {"#0","Load #3"},
                {"#1","Add 3"},
                {"#2", "Store #12"},
                {"#3","Load #15"},
                {"#4","Add -1"},
                {"#5", "Store #24"},


        };
        for(int i=0;i<RAM.length;i++){
            if(RAM[i][0].equals(s)){
                return RAM[i][1];
            }

        }
        return null;

    }
    public static void ControlUnit(String x){

        System.out.println("Current Instruction Being Decoded: "+x);
    }
    public static void ALU(){
        System.out.println("Executing in ALU!");
    }
}
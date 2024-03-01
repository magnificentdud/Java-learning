// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class count3s {
    public static void main(String[] args) {
        int[][] dataSet = {{3,2,2},{1,2,3},{1,5,6},{4,3,3}};
        int result = count3s(dataSet);
        System.out.println(result);
    }
    public static int count3s(int[][] dataset){
        int cnt = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(dataset[i][j]==3){
                    cnt+= 1;
                }
            }
        }
        return cnt;
    }
}
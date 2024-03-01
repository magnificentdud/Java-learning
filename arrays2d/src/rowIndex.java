public class rowIndex {
    public static void main(String[] args) {
        int[][] dataSet = {{3,2,2},{1,2,3},{1,5,6},{4,3,3}};
        int result = rowIndex(dataSet);
        System.out.println(result);
    }
    public static int rowIndex(int[][] nums){
        int maxsum = 0;
        int index = 4;
        for(int i=0;i<4;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                sum = sum + nums[i][j];
                if(sum>maxsum){
                    maxsum = sum;
                    index = i;
                }
            }

        }
        return index;
    }
}

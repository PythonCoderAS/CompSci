public class isMagicNumberTest {
    public static void main(String[] args) {
        System.out.println();
    }

    static boolean isMagicSquare(int[][] arr){
        int sum = 0, checkSum1, checkSum2, checkSum3 = 0;
        for (int i=0; i < arr.length; i++){
            if (arr[i].length != arr.length){
                return false;
            }
        }
        if (arr.length <= 1){
            return true;
        }
        for (int j=0; j < arr[0].length; j++){
            sum += arr[0][j];
        }
        for (int i=0; i < arr.length; i++){
            checkSum1 = 0;
            checkSum2 = 0;
            for (int j=0; j < arr[i].length; j++){
                checkSum1 += arr[i][j];
                checkSum2 += arr[j][i];
            }
            if (checkSum1 != sum || checkSum2 != sum){
                return false;
            }
            checkSum3 += arr[i][i];
        }
        return checkSum3 == sum;
    }
}

import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Long> arr = new ArrayList<>(5);
        for(int i=0;i<5;i++){
            long num = input.nextInt();
            arr.add(num);
        }
        Resultof2.miniMaxSum(arr);

    }
}
class Resultof2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Long> arr) {
        // Write your code here
        long array[] = new long[5];
        for(int i=0;i<5;i++){
            long  sum=0L;
            for(int j=0;j<5;j++){
                if(i==j){
                    sum+=0;
                }
                else{
                    sum+=arr.get(j);
                }
            }
            array[i]=sum;
        }

        Arrays.sort(array);



        System.out.println(array[0]+" "+array[4]);




    }

}
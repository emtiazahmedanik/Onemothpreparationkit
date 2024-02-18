import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        double ps=0,ng=0,zr=0;
        for(int i=0;i<size;i++){
            int num = arr.get(i);
            if(num!=0 && num>=1){
                ps++;
            }
            else if(num!=0&& num<=1){
                ng++;
            }
            else if(num==0){
                zr++;
            }
        }
        double rps = ps/size;
        double rng = ng/size;
        double rzr = zr/size;
        System.out.println(rps);
        System.out.println(rng);
        System.out.println(rzr);

    }

}

public class Day1 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(input.nextInt());
        }
//        for(int i =0 ; i<n;i++){
//            System.out.println(arr.get(i)+" ");
//        }

        Result.plusMinus(arr);


    }
}

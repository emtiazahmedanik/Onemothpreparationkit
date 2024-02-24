import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> query = new ArrayList<>();
        List<String> qstring = new ArrayList<>();



        //System.out.println("Input size of string:");
        int sofs = input.nextInt();
        //System.out.println("Input  string:");
        for(int i=0;i<sofs;i++){
            String str = input.next();
            qstring.add(str);
        }


        //System.out.println("Input size of query:");
        int sofq = input.nextInt();
        //System.out.println("Input query string:");
        for(int i=0;i<sofq;i++){
            String str = input.next();
            query.add(str);
        }



        List<Integer> list = new ArrayList<>();
        list = Resultof4.Matching(query,qstring);
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }


    }

}
class Resultof4{
    public static List<Integer> Matching(List<String> query, List<String> qString){
        int sofq = query.size();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<sofq;i++){
            int count =0;
            for(int j=0;j<qString.size();j++){
                if(query.get(i).matches(qString.get(j))){
                    count++;
                }
            }
            list.add(count);

        }
        return list;


    }

}

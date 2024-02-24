import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String res = Resultof3.timeConversion(s);
        System.out.println(res);
    }
}

class Resultof3 {
    public static String timeConversion(String s) {
        String[] s1 = s.split(":");
        int hour = Integer.parseInt(s1[0]);
        String amPm = s1[2].substring(2);

        if (amPm.equals("PM") && hour != 12) {
            hour += 12;
        } else if (amPm.equals("AM") && hour == 12) {
            hour = 0;
        }


        String militaryHour = String.format("%02d", hour);
        System.out.println(militaryHour);
        return militaryHour + ":" + s1[1] + ":" + s1[2].substring(0, 2);
    }
}

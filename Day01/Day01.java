import java.util.Scanner;
import java.io.File;

public class Day01 {

    private final static String DATA_FILE = "SampleInput.txt";

    public static void part1() {
        Scanner in;
        try {
            in = new Scanner(new File(DATA_FILE));
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        int mostCal = 0;
        while (in.hasNext()) {
            String line = in.nextLine();
            int cal = 0;

            // get total calories not seperated by space
            while (!line.equals("") && in.hasNext()) {
                cal += Integer.parseInt(line);
                line = in.nextLine();
            }
            if (cal > mostCal) {
                mostCal = cal;

            }
        }
        System.out.println(mostCal);

    }

    public static void part2() {
        Scanner in;
        try {
            in = new Scanner(new File(DATA_FILE));
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        
        int mostCal = 0;
        while (in.hasNext()) {
            String line = in.nextLine();
            int cal = 0;

            // get total calories not seperated by space
            while (!line.equals("") && in.hasNext()) {
                cal += Integer.parseInt(line);
                line = in.nextLine();
            }
            if (cal > mostCal) {
                mostCal = cal;

            }
        }
        System.out.println(mostCal);

    }

    public static void main(String[] args) {
        part2();
    }

}
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Day03{

    public static int decode(String c) {
        if(c.compareTo("a") >=0){
            return c.compareTo("a") + 1;
        }else{
            return c.compareTo("A") + 27;
        }
    }


    public static void part1() throws IOException {
        int total = 0;
        Scanner in = new Scanner(new File("input.txt"));
        while(in.hasNext()){
            String line = in.nextLine();
            int half = line.length()/2;
            String firstHalf = line.substring(0, half);
            String secondHalf = line.substring(half);
            for(int i = 0; i < half; i++){
                String c = firstHalf.substring(i, i+1);
                if(secondHalf.indexOf(c) != -1) {
                    total += decode(c);
                    break;
                }

            }
        }
        System.out.println(total);
    }

    public static void part2() throws IOException {
        int total = 0;
        Scanner in = new Scanner(new File("input.txt"));
        while(in.hasNext()){
            String lineOne = in.nextLine();
            //String nextLines = in.nextLine() + in.nextLine();
            String lineTwo = in.nextLine();
            String lineThree = in.nextLine();
            //int half = line.length()/2;
            //String firstHalf = line.substring(0, half);
            //String secondHalf = line.substring(half);

            for(int i = 0; i < lineOne.length(); i++){
                String c = lineOne.substring(i, i+1);
                if(lineTwo.indexOf(c) != -1 && lineThree.indexOf(c) != -1) {
                    total += decode(c);
                    break;
                }

            }
        }
        System.out.println(total);

    
    }

    public static void main(String[] args) {
        try {
            part2();
        } catch (Exception e){
            System.out.println(e);
        }
    }



}
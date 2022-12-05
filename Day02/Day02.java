import java.util.Scanner;
import java.io.IOException;
import java.io.File;



public class Day02 {

    public static int eval(String strat) {
        int score = 0;
        String[] choices = strat.split(" ");
        int otherChoice = choices[0].compareTo("A");
        int myChoice = choices[1].compareTo("X");
        int diffMod3 = Math.floorMod((otherChoice -myChoice),3);

        switch(diffMod3) {
            case 0: score += 3; break;
            case 1: break;
            case 2: score +=6; break;
        }
        score+= myChoice + 1;
        return score;   
        
    }
    public static int eval2(String strat) {
        int score = 0;
        String[] choices = strat.split(" ");
        int otherChoice = choices[0].compareTo("A");
        int result = choices[1].compareTo("X");

        switch(result) {
            case 0: score += Math.floorMod(otherChoice-1,3)+ 1; break;
            case 1: score += (otherChoice+1)+3 ;break;
            case 2: score += Math.floorMod(otherChoice+1 , 3)+6+1 ; break;
        }
        
        return score;   
        
    }


    public static void part1() throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        int total = 0;

        while(in.hasNext()) {
            String line = in.nextLine();

            total += eval(line);
        }

        System.out.print(total);


    }

    public static void part2() throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        int total = 0;

        while(in.hasNext()) {
            String line = in.nextLine();

            total += eval2(line);
        }

        System.out.print(total);


    }


    public static void main(String...args){
        try{
            part2();
        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
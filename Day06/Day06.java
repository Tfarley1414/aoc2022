import java.util.Scanner;
import java.io.*;

public class Day06{

    


    public static void part1() throws IOException {
        Scanner in = new Scanner( new File("input.txt"));

        String input = in.next();

        outerLoop:
        for(int i =0; i < input.length()-3; i++){
            String checkingFour = input.substring(i,i+4);
            char[] chars = checkingFour.toCharArray();
            for(int p = 0; p<chars.length; p++){
                for(int q = p+1; q < chars.length; q++){
                    if(chars[p]==chars[q]) {
                        continue outerLoop;
                    }
                }
            }
            System.out.println(i+4);
            break;
        }

       


    }

    public static void part2() throws IOException {
        Scanner in = new Scanner( new File("sampleInput.txt"));

        String input = in.next();

        outerLoop:
        for(int i =0; i < input.length()-3; i++){
            String checkingFour = input.substring(i,i+4);
            char[] chars = checkingFour.toCharArray();
            for(int p = 0; p<chars.length; p++){
                for(int q = p+1; q < chars.length; q++){
                    if(chars[p]==chars[q]) {
                        continue outerLoop;
                    }
                }
            }
            System.out.println(i+4);
            break;
        }

    
    }

    public static void main(String...args){
        try{
            part2();
        } catch (Exception e) {
            System.out.println(e);
        }


    }



}
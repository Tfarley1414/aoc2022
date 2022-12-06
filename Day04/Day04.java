import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Day04{

    
    


    public static void part1() throws IOException {
        Scanner in = new Scanner( new File("input.txt"));
        int total = 0;
        
        in.useDelimiter(",|\\-|\\n");

        while(in.hasNext()) {
            int num1 = Integer.parseInt(in.next().strip());
            int num2 = Integer.parseInt(in.next().strip());
            int num3 = Integer.parseInt(in.next().strip());
            int num4 = Integer.parseInt(in.next().strip());

            if((num4>= num2 && num3<=num1) || (num2>= num4 && num1<=num3)){
                total +=1;
            }
        }

        System.out.print(total);
        
        



    }

    public static void part2() throws IOException {
        Scanner in = new Scanner( new File("sampleInput.txt"));
        int total = 0;
        
        in.useDelimiter(",|\\-|\\n");

        while(in.hasNext()) {
            int num1 = Integer.parseInt(in.next().strip());
            int num2 = Integer.parseInt(in.next().strip());
            int num3 = Integer.parseInt(in.next().strip());
            int num4 = Integer.parseInt(in.next().strip());

            if((num2>=num3 && num2 <= num4)|| (num3>=num1 && num3 <= num2)){
                total +=1;
            }
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
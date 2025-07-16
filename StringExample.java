import java.util.Scanner;
import java.util.Arrays;
public class StringExample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.nextLine();
        int count=0;
        for(char ch: s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                count++;
            }
        }
        System.out.println(count);
     }

    
}
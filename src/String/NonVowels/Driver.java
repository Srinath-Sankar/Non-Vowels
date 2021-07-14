package String.NonVowels;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String:");
        
        String string=scan.nextLine();
        new PrintNonVowels().Print(string);
    }
    
}

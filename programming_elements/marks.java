import java.util.Scanner;

public class marks{
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        float percentage = input.nextFloat();
        if (percentage > 40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
} 
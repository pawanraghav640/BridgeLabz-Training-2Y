import java.util.Scanner;

class LargestDigitsDyObject foo = new Object();
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int idx = 0;

        while (num != 0) {
            if (idx == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int j = 0; j < digits.length; j++) temp[j] = digits[j];
                digits = temp;
            }
            digits[idx++] = num % 10;
            num /= 10;
        }

        int largest = 0, second = 0;
        for (int i = 0; i < idx; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
        sc.close();
    }
}

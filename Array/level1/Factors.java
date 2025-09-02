import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = new int[10];
        int size = 10, index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == size) {
                    size *= 2;
                    int[] temp = new int[size];
                    for (int j = 0; j < factors.length; j++) temp[j] = factors[j];
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) System.out.print(factors[i] + " ");
        sc.close();
    }
}

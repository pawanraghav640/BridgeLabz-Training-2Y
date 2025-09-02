import java.util.Scanner;

class StoreNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter number: ");
            double n = sc.nextDouble();
            if (n <= 0 || index == 10) break;
            arr[index++] = n;
        }
        for (int i = 0; i < index; i++) total += arr[i];
        System.out.println("Sum = " + total);
        sc.close();
    }
}

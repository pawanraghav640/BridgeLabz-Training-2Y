import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        String[] name = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + name[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + name[i] + ": ");
            height[i] = sc.nextInt();
        }

        int minAgeIndex = 0, maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) minAgeIndex = i;
            if (height[i] > height[maxHeightIndex]) maxHeightIndex = i;
        }

        System.out.println("Youngest = " + name[minAgeIndex]);
        System.out.println("Tallest = " + name[maxHeightIndex]);
        sc.close();
    }
}

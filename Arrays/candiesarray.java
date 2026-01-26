import java.util.Scanner;

public class candiesarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter number of kids: ");
        int n = sc.nextInt();

        int[] candies = new int[n];

        // input candies
        System.out.println("Enter candies for each kid:");
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        // input extraCandies
        System.out.print("Enter extra candies: ");
        int extraCandies = sc.nextInt();

        // Step 1: find max
        int max = candies[0];
        for (int i = 1; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Step 2: result
        System.out.print("Result: ");
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) {
                System.out.print("true ");
            } else {
                System.out.print("false ");
            }
        }
    }
}

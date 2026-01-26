import java.util.Scanner;
public class shufflearray {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input n
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // array size = 2n
        int[] nums = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[2 * n];

        // core logic
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];       // xi
            ans[2 * i + 1] = nums[i + n]; // yi
        }

        // output
        System.out.print("Shuffled Array: ");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

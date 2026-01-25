import java.util.Scanner;

public class bankacc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input rows and columns
        System.out.print("Enter number of customers and banks:");
        int m = sc.nextInt(); // number of customers (rows)
        int n = sc.nextInt(); // number of banks (columns)

        int[][] accounts = new int[m][n];

        // input matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        int maxWealth = 0;

        // logic
        for (int i = 0; i < m; i++) {
            int currentWealth = 0;

            for (int j = 0; j < n; j++) {
                currentWealth += accounts[i][j];
            }

            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        // output
        System.out.println(maxWealth);

        sc.close();
    }
}

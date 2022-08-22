import java.util.Scanner;

public class B_Explore  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long T = scanner.nextLong();
        long[] A = new long[N];
        int[] X = new int[M];
        long[] Y = new long[M];

        for (int i = 1; i < N; i++) {
            A[i] = scanner.nextLong();
        }

        for (int i = 0; i < M; i++) {
            X[i] = scanner.nextInt();
            Y[i] = scanner.nextLong();
        }
        int m = 0;

        scanner.close();

        String ans = "Yes";

        for (int i = 1; i < N; i++) {
            if (M >= m+1) {
                if (i == X[m]) {
                    T += Y[m];
                    m++;
                }
            }
            T -= A[i];
            if (T <= 0) {
                ans = "No";
                break;
            }
        }

        System.out.println(ans);
    }
}

import java.util.Scanner;
 
public class A_Apple  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int N = scanner.nextInt();
        int ans = 0;
        scanner.close();
 
        if(N <= 2) {
            ans = N*X;
        } else if ((Y < 3*X) && (N%3 == 0)) {
            ans = N/3*Y;
        } else if(Y < 3*X){
            ans = N/3*Y + N%3*X;
        } else {
            ans = N*X;
        }
       
        System.out.println(ans);
    }
}
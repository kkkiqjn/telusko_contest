import java.util.Scanner;

public class pascalsTriangle{
    public static void main(String[] args) {
        int n ;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        pascalstriangle(n);

    }

    public static void pascalstriangle(int n) {
        int[][] arr = new int[n][n];

        for (int r = 0; r < n; r++) {

            
            for (int i = 0; i <= r; i++) {
                if (r == i || i == 0)
                    arr[r][i] = 1;
                else
                    arr[r][i] = arr[r - 1][i - 1] + arr[r - 1][i];
                
                
                    System.out.print(arr[r][i]+" ");
            }
            System.out.println(" ");
        }
    }
}

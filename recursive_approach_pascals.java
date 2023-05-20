import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static List<List<Integer>> ptriangle(int nrows) {
        List<List<Integer>> triangle = new ArrayList<>();
        pascalRecursive(nrows, triangle);
        return triangle;
    }

    private static void pascalRecursive(int nrows, List<List<Integer>> triangle) {
        if (nrows == 0) {
            return;
        }

        pascalRecursive(nrows - 1, triangle);

        List<Integer> row = new ArrayList<>();
        boolean flag = true;
        if (!triangle.isEmpty()) {
            List<Integer> prevrow = triangle.get(nrows - 2);
            row.add(1);
            if (flag) {
                for (int i = 1; i < nrows - 1; i++) {
                    int sum = prevrow.get(i - 1) + prevrow.get(i);
                    row.add(sum);
                }
            }
            row.add(1);
        } else {
            row.add(1);
        }

        triangle.add(row);
    }

    public static void main(String[] args) {
        int nrows;
        Scanner sc = new Scanner(System.in);
        nrows = sc.nextInt();
        List<List<Integer>> pascalsTriangle = ptriangle(nrows);

        for (List<Integer> row : pascalsTriangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

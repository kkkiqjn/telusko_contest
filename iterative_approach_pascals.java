import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int nrows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nrows == 1) {
            ans.add(List.of(1));
        } else if (nrows == 2) {
            ans.add(List.of(1));
            ans.add(List.of(1, 1));
        } else {
            List<Integer> one = new ArrayList<>();
            one.add(1);
            ans.add(one);
            List<Integer> two = new ArrayList<>();
            two.add(1);
            two.add(1);
            ans.add(two);
            int j = 1;
            for (int i = 2; i < nrows; i++) {
                List<Integer> aux = new ArrayList<>();
                aux.add(1);
                for (int k = 0; j < ans.size() && k < ans.get(j).size() - 1; k++) {
                    aux.add(ans.get(j).get(k) + ans.get(j).get(k + 1));
                }
                aux.add(1);
                j++;
                ans.add(aux);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nrows = 5;
        List<List<Integer>> pascalTriangle = generate(nrows);
        for (List<Integer> row : pascalTriangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

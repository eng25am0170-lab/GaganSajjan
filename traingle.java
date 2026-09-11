import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // Start from the second last row and move upward
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int belowLeft = triangle.get(i + 1).get(j);
                int belowRight = triangle.get(i + 1).get(j + 1);
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(belowLeft, belowRight));
            }
        }
        return triangle.get(0).get(0);
    }
}

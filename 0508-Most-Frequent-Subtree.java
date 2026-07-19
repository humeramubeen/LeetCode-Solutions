import java.util.*;

class Solution {
    int maxCount = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        dfs(root, map);
        
        List<Integer> res = new ArrayList<>();
        for (int sum : map.keySet()) {
            if (map.get(sum) == maxCount) {
                res.add(sum);
            }
        }
        
        return res.stream().mapToInt(i -> i).toArray();
    }

    private int dfs(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) return 0;
        
        int sum = root.val + dfs(root.left, map) + dfs(root.right, map);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        maxCount = Math.max(maxCount, map.get(sum));
        
        return sum;
    }
}
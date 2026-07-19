class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            result[2*i]=nums[i];      // x_i goes to even index
            result[2*i+1]=nums[i+n];// y_i goes to odd index
        }
        
        return result;
    }
}
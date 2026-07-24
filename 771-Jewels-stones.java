import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // Store all jewel types in a HashSet for O(1) lookup
        HashSet<Character> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }

        int count = 0;
        // Count how many stones are in the jewelSet
        for (char c : stones.toCharArray()) {
            if (jewelSet.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
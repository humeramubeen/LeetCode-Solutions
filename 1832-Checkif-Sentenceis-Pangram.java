class Solution {
    public boolean checkIfPangram(String sentence) {
        // A pangram must contain at least 26 characters
        if (sentence.length() < 26) {
            return false;
        }

        int seen = 0;
        for (int i = 0; i < sentence.length(); i++) {
            seen |= (1 << (sentence.charAt(i) - 'a'));
        }

        // 26 ones in binary equals (1 << 26) - 1 or 0x03FFFFFF
        return seen == (1 << 26) - 1;
    }
}
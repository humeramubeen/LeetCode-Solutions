import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
       
        int[] charToRow = {
            1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 
            2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2
        };
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            int targetRow = charToRow[lowerWord.charAt(0) - 'a'];
            boolean isValid = true;
            
            for (int i = 1; i < lowerWord.length(); i++) {
                if (charToRow[lowerWord.charAt(i) - 'a'] != targetRow) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
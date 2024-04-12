public class Solution {
    public int solution(String[] babbling) {
        String[] sounds = {"aya", "ye", "woo", "ma"};
        int validCount = 0;
        
        for (String word : babbling) {
            String tempWord = word;
            boolean valid = true;
            int[] count = new int[sounds.length];

            while (tempWord.length() > 0 && valid) {
                boolean matched = false;
                
                for (int i = 0; i < sounds.length; i++) {
                    if (tempWord.startsWith(sounds[i])) {
                        if (count[i] == 0) {
                            count[i]++;
                            tempWord = tempWord.substring(sounds[i].length());
                            matched = true;
                            break;
                        } else {
                            valid = false;
                            break;
                        }
                    }
                }
                
                if (!matched) {
                    valid = false;
                }
            }
            
           
            if (valid && tempWord.isEmpty()) {
                validCount++;
            }
        }
        
        return validCount;
    }
}
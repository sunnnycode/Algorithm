class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder result = new StringBuilder(); 
        
        for (char ch : my_string.toCharArray()) {
            if (ch != letter.charAt(0)) {
                result.append(ch);
            }
        }
        
        return result.toString(); 
    }
}


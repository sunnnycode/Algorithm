class Solution {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : my_string.toCharArray()){
            for(int i = 0; i < n; i++) {
                result.append(ch);
            }
        }
       
        return result.toString();
    }
}

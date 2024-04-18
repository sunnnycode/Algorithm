public class Solution {
    public static int solution(String my_string) {
        int total = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {  
                total += Character.getNumericValue(ch);  
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));  
        System.out.println(solution("1a2b3c4d123"));  
    }
}

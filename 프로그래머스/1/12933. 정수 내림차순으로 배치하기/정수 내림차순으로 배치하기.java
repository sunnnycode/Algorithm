import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public long solution(long n) {
     
        String s = Long.toString(n);
        
      
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        
      
        Arrays.sort(arr, Collections.reverseOrder());
        
        
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        
        
        return Long.parseLong(sb.toString());
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        long n = 118372;
        System.out.println(sol.solution(n));  
    }
}

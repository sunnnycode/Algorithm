class Solution {
    public String solution(String cipher, int code) {
         StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i < cipher.length(); i++){
           if ((i+1) % code == 0){
               char c = cipher.charAt(i);
               strBuilder.append(c);
           } 
        }
        return strBuilder.toString();
    }
}
class Solution {
    public int solution(double num1, double num2) {
        int answer = 0;
        double result = 0;
        
        result = (num1/num2)*1000;
        answer = (int)result;
        
        return answer;
    }
}
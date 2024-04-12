class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int freejuice = 0;
        
        freejuice = n / 10;

        answer = (n*12000)+((k - freejuice)*2000);    

        return answer;
    }
}
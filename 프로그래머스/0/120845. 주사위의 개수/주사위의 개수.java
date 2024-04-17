public class Solution {
    public int solution(int[] box, int n) {
      
        int maxDicePerDirectionX = box[0] / n;
        int maxDicePerDirectionY = box[1] / n;
        int maxDicePerDirectionZ = box[2] / n;
        
        int totalMaxDice = maxDicePerDirectionX * maxDicePerDirectionY * maxDicePerDirectionZ;
        
        return totalMaxDice;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 테스트 케이스
        int[] box1 = {1, 1, 1};
        int n1 = 1;
        System.out.println(sol.solution(box1, n1));  // 결과: 1

        int[] box2 = {10, 8, 6};
        int n2 = 3;
        System.out.println(sol.solution(box2, n2));  // 결과: 12
    }
}

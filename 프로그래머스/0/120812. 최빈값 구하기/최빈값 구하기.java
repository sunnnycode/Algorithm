import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> count = new HashMap<>();

        // 배열 내 각 숫자의 등장 횟수를 세는 과정
        for (int num : array) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mode = -1;

        // 최빈값 탐색
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxCount) {
                maxCount = freq;
                mode = num;
            } else if (freq == maxCount) {
                // 최빈값이 여러 개인 경우
                mode = -1;
            }
        }

        return mode;
    }
}

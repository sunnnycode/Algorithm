class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < rsp.length(); i++) {
            char move = rsp.charAt(i);
            if (move == '2') { // 가위(2)에게 이기는 경우는 보(5)를 선택합니다.
                result.append('0');
            } else if (move == '0') { // 바위(0)에게 이기는 경우는 보(5)를 선택합니다.
                result.append('5');
            } else { // 보(5)에게 이기는 경우는 바위(0)를 선택합니다.
                result.append('2');
            }
        }
        
        return result.toString();
    }
}

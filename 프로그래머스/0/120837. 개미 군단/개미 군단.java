class Solution {
    public int solution(int hp) {
        int generals = hp / 5; // 장군개미의 수 계산
        hp %= 5; // 남은 체력 계산
        
        int soldiers = hp / 3; // 병정개미의 수 계산
        hp %= 3; // 남은 체력 계산
        
        int ants = hp; // 일개미의 수 계산
        
        return generals + soldiers + ants; // 전체 개미의 수 반환
    }
}

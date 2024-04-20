import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                arrayList.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }

        // 숫자를 오름차순으로 정렬
        Collections.sort(arrayList);

        // ArrayList를 배열로 변환하여 반환
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}

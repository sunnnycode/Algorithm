class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] myArray = my_string.toCharArray();
        char temp = myArray[num1];
        myArray[num1] = myArray[num2];
        myArray[num2] = temp;
        return new String(myArray);
    }
}
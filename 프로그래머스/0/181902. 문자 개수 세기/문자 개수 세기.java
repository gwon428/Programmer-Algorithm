class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (int i = 0; i < my_string.length(); i++) {
            char result = my_string.charAt(i);

            if (result >= 'A' && result <= 'Z') {
                answer[result - 'A']++;
            } else if (result >= 'a' && result <= 'z') {
                answer[26 + result - 'a']++;
            }
        }
        return answer;
    }
}
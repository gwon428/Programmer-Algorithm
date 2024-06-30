class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        
        //2. indices를 돌면서 지워야 할 값들을 비워둔다.
        for (int i = 0; i < indices.length; i++) {
            str[indices[i]] = "";
        }

        //3. 문자열을 하나로 합친다(빈 공간은 붙어도 어짜피 포함X, 단순 "")
        for (String x : str) {
            answer += x;
        }
        
        return answer;
    }
}
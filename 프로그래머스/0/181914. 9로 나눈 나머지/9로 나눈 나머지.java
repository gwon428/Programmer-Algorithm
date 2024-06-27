class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] num = number.split("");
        for(int i = 0; i<num.length; i++){
            sum+=Integer.parseInt(num[i]);
        }
        answer = sum%9;
        return answer;
    }
}
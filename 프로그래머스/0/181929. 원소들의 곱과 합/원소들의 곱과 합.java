class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int abs = 1;
        int add = 0;
        for(int i=0; i<num_list.length; i++){
            abs *= num_list[i];
            add += num_list[i];
        }

        if(abs < add*add){
            answer = 1;
        } else answer = 0;
        return answer;
    }
}
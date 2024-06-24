class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int [num_list.length + 1];
        int num = 0;
        
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
            if(num_list[num_list.length - 2] < num_list[num_list.length - 1]){
                num = num_list[num_list.length -1] - num_list[num_list.length -2];
            } else {
                num = num_list[num_list.length -1] * 2;
            }
            answer [num_list.length] = num;
        }
        
        
        
        
        
        return answer;
    }   
}
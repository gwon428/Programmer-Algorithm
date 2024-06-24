class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        String even = "";
        String odd = "";
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even += Integer.toString(num_list[i]);
            } else {
                odd += Integer.toString(num_list[i]);
            }
            

        }
            System.out.println(even);
            System.out.println(odd);
        
                    int a = Integer.parseInt(even);
            int b = Integer.parseInt(odd);
            
            answer = a + b;
        return answer;
    }
}
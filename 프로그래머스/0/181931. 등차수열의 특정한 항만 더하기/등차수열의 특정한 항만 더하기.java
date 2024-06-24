class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] arr = new int[included.length];
        
        for (int i = 0; i < included.length; i++) {
            int num = a + d*(i);
            System.out.println(num);
            arr[i] = num;
            
            if (included[i]) {
                answer += num;
            }
        }
        return answer;
        
    }
}
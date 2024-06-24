class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i=0; i < control.length(); i++){
            System.out.println(control.charAt(i));
            if(control.charAt(i) == 'a'){
                n -= 10;
            } else if(control.charAt(i) == 'd'){
                n += 10;
            } else if(control.charAt(i) == 's'){
                n -= 1;
            } else {
                n += 1;
            }
        }
        
        answer = n;
        
        
        return answer;
    }
}
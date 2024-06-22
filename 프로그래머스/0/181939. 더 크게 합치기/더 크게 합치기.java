class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String asol = String.valueOf(a) + String.valueOf(b);
        String bsol = String.valueOf(b) + String.valueOf(a);
        
        if (Integer.parseInt(asol) >= Integer.parseInt(bsol)) {
            return Integer.parseInt(asol);
        } else {
            return Integer.parseInt(bsol);
        }
        
    }
}
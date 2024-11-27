class Solution {
    public int solution(int[][] sizes) {
        
        int answer = 0;
        
        // 명함의 가로 세로 변수 생성
        int w = 0;
        int h = 0;
        

        for(int i=0;i<sizes.length;i++){
            // [][0], [][1] 에서 각각 최댓값, 최솟값 뽑아내기
            int width = Math.max(sizes[i][0],sizes[i][1]);
            int height = Math.min(sizes[i][0],sizes[i][1]);
            
            w = Math.max(w, width);
            h = Math.max(h, height);
        }
        answer = w*h;
        
        return answer;
    }
}
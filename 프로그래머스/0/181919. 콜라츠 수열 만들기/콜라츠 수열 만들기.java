import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        // int[] answer = {};
        // int count = 0;

        // answer[0] = n;
        
//         while(n != 1){
//             if(n % 2 == 0){
//                 n = n/2;
//                 answer[count] = n;
//                 count++;
//         } else {
//                 n = 3*n+1;
//                 answer[count] = n;
//                 count++;
//         }
//         }
        
        
        return answer;
    }
}
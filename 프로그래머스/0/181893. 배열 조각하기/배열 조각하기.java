import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i =0; i<query.length; i++) {
            if(i % 2 == 0) {
                // 짝수인 경우 배열 시작부터 배열의 인덱스까지
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else {
                // 홀수인 경우 인덱스부터 끝까지
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}
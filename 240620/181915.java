class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i=0; i<index_list.length; i++){
            answer += my_string.charAt(index_list[i]);
        }
        
        return answer;
    }
}

// 다른 사람들의 풀이
/*

    - 1. StringBuilder와 향상된 for문을 통해 출력

        StringBuilder sb = new StringBuilder();

        for (int idx : index_list)
            sb.append(my_string.charAt(idx));

        return sb.toString();


    - 2. stream : 원본 데이터 소스를 변경하지 않고 데이터를 읽는 함수
        - mapToObj : 스트림을 객체 스트림(Stream<T>)으로 변환
        return Arrays.stream(indexList).mapToObj(operand -> String.valueOf(myString.charAt(operand))).collect(Collectors.joining());


    - 3. StringBuffer와 향상된 for문을 통해 출력
        StringBuffer answer = new StringBuffer();

        for(int idx: index_list) {
            answer.append(my_string.charAt(idx));
        }
        return answer.toString();

 */
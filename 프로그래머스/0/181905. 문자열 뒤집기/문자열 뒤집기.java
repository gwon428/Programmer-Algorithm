class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String sub = my_string.substring(s,e+1);
        System.out.println(sub);
    	String sub2= "";
    	for ( int j = sub.length()-1 ; j>=0; j--) {
    		sub2 += sub.charAt(j);
    	}
    	answer = my_string.replace(sub,sub2);
        return answer;
    }
}
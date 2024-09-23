#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int i,j;

        for(i = 2; i <= n; i++){
        	for(j = 2; j < i ; j++) {
        		if(i % j == 0) {
			        answer++;
			        break;
		        }
        	}
        }
    return answer;
}
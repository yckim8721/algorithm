class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 1) {
            for(int i=0; i<=(n-1)/2; i++) {
                answer += (2*i)+1;
            } 
        }else {
            for(int j=0; j<=(n/2);j++){
                answer += (2*j)*(2*j);
            }
        }
        
        return answer;
    }
}
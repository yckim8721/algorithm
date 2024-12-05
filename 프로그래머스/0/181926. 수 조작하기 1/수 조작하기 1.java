class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] control_list = control.split("");
        
        for(int i=0; i<control_list.length; i++) {
            if(control_list[i].equals("w")) {
                n = n + 1;
            } else if(control_list[i].equals("s")) {
                n = n - 1;
            } else if(control_list[i].equals("d")) {
                n = n + 10;
            } else if(control_list[i].equals("a")) {
                n = n - 10;
            }
        }
        answer = n;
        
        return answer;
    }
}
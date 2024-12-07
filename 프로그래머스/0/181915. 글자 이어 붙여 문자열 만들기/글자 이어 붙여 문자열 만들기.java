class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] array_my_string = my_string.split("");
        String answer = "";
        
        for(int i=0; i < index_list.length; i++) {
            answer += (array_my_string[index_list[i]]);
        }
        return answer;
    }
}
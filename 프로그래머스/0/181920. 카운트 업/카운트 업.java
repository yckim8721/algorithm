class Solution {
    public int[] solution(int start_num, int end_num) {
        int ans_length = end_num - start_num + 1;
        int[] answer = new int[ans_length];
        for(int i = 0; i < ans_length; i++) {
            answer[i] = start_num + i;
        }
        return answer;
    }
}
class Solution {
    public int solution(String number) {
        String[] number_split = number.split("");
        int sum = 0;
        int answer = 0;
        
        for(int i = 0; i < number_split.length; i++) {
            sum += Integer.parseInt(number_split[i]);
        }
        answer = sum % 9;
        return answer;
    }
}
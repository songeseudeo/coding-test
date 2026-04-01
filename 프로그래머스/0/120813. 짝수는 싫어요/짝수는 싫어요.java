class Solution {
    public int[] solution(int n) {
        //홀수가 몇 개 들어갈지 계산해 배열 크기를 정함
        int count = (n+1)/2;
        int[] answer = new int[count];
        
        int index = 0;
        
        //1부터 n까지 숫자를 검사
        for(int i=1; i<=n; i++) {
            //2로 나눈 나머지가 0이 아니면 홀수
            if(i % 2 != 0) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}
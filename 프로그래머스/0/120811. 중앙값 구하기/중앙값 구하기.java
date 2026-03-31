import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        //배열 정렬
        Arrays.sort(array);
        //배열 길이를 2로 나누면 가운데 인덱스 번호
        int middleIndex = array.length/2;
        
        return array[middleIndex];
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //정답을 담을 빈 문자열
        String answer = "";
        
        //문자열의 길이만큼 한 글자씩 반복
        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i); //i번째 글자를 꺼냄
            
            //대문자 -> 소문자
            if(Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }
        System.out.println(answer);    
    }
}
//판별하는 도구
//Character.isUpperCase(c) -> c가 대문자면 true
//Character.isLowerCase(c) -> c가 소문자면 true
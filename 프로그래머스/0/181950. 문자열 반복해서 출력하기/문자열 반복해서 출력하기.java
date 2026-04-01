import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            //옆으로 나란히 나오게 하려면 print
            System.out.print(str);
        }
    }
}
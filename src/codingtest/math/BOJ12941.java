package codingtest.math;
import java.util.*;
public class BOJ12941 {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(solution(A,B));
    }
    private static int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++){
            answer+=A[i]*B[A.length-1-i];
        }
        return answer;
    }
}

package main.java.beakjoon.dp;
import java.util.Scanner;

/** 백준 문제 1463번
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * X가 2로 나누어 떨어지면, 2로 나눈다.
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
 * 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 * 예제 입력 2 -> 예제 출력 1
 * 예제 입력 10 -> 예제 출력 3
 * 10의 경우에 10 → 9 → 3 → 1 로 3번 만에 만들 수 있다.
 */

public class No1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1 || n >= 106) {
            System.out.println("1보다 크거나 같고, 106보다 작거나 같은 정수만 입력하세요");
            return;
        }

        int[] dp = new int[n+1];
        dp[1] = 0; // 1은 연산에서 제외 해야함으로

        //i가 2부터 진행하는 이유는 -> 0과, 1 을제외하고 시작하기 때문에
        for(int i=2; i<=n; i++){
            dp[i] = dp[i - 1] + 1; // dp[1] 은 어차피 0 이기 때문에 2번째 자리부터 계산을 하기위해 증감

            if(i%2 ==0){
                dp[i] = Math.min(dp[i], dp[i/2] +1); // 해당 연산을 하는 이유는 연산중 자리수중 최소값을 가져오기 위함
            }
            if(i%3 ==0){
                dp[i] = Math.min(dp[i], dp[i/3] +1); // 해당 연산을 하는 이유는 연산중 자리수중 최소값을 가져오기 위함
            }
        }
        System.out.println(dp[n]);
    }
}
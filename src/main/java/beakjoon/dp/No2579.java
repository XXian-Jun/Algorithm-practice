package main.java.beakjoon.dp;
import java.util.Scanner;

/** 백준 문제 2579
 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
 마지막 도착 계단은 반드시 밟아야 한다.
 계단 카운팅 10 , 20 , 15, 25, 10 , 20
 */

public class No2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floorCnt = sc.nextInt();         // 계단 층 개수
        int []dp = new int[floorCnt+1]; // 비교할 첫번째 점수
        int []score = new int[floorCnt+1]; // 비교할 두번째 점수

        for (int i = 1; i <= floorCnt; i++) {
            score[i] = sc.nextInt();
        } //계단별로 점수 받고

        dp[1] = score[1]; // 첫 번째 계단 점수 초기화
        if (floorCnt >= 2) dp[2] = score[1] + score[2]; // 두 번째 계단까지 최대 점수는 1번 계단과 2번 계단 점수 합

        /* 3번째 게단부터는 점화식을 이용하여 계단 2칸 -> 최대값 3칸일경우 2칸계단 오른걸로 정의 처리 */
        for (int i = 3; i <=floorCnt; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i];
        }

        System.out.println(dp[floorCnt]); // 마지막 계단은 반드시 밟아야 하니까

    }
}
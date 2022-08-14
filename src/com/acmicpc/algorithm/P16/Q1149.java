package com.acmicpc.algorithm.P16;

import java.io.*;
import java.util.StringTokenizer;

/**
 * RGB거리
 */
public class Q1149 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int T = stringToInt(br.readLine());
        int[][] dp = new int[T + 1][3];

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + r;
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + g;
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + b;
        }

        System.out.println(Math.min(Math.min(dp[T][0], dp[T][1]), dp[T][2]));

    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }

}
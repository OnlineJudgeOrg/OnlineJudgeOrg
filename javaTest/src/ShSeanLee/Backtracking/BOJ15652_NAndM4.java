package Backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 1~N 범위에서 중복없이 M개를 고르는 것. 단, 뒤에 나온수는 앞에 나온수보다 크거나 같아야 함

public class BOJ15652_NAndM4 {
    public static StringTokenizer st;
    public static int N, M;
    public static int[] numbers;
    public static StringBuilder sb;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        numbers = new int[M];
        DFS(0, 0);
        System.out.println(sb);
    }

    public static void DFS(int n, int depth) {

        if (depth == M) {
            for (int v : numbers) {
                sb.append(v).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = n; i < N; i++) {
//            if (depth == 0) {
//                numbers[depth] = i + 1;
//            } else {
//                if (numbers[depth - 1] <= i + 1) {
//                    numbers[depth] = i + 1;
//                    DFS(n + 1,depth + 1);
//                }
//            }
            numbers[depth] = i + 1; // 여기에서 +1을 해주기 때문에
            DFS(i,depth + 1); // 여기에서 그대로 넣어주면 해결 됨
        }

    }
}

package ShSeanLee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class BOJ2587_Median {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] numbers = new Integer[5];
        int sum = 0;
        for (int i = 0; i < 5; i++){
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }
        Arrays.sort(numbers);
        int avg = sum/5;
        bw.write(avg + "\n");
        bw.write(numbers[2] + "\n");
        bw.flush();
        bw.close();

    }

}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//import java.util.TreeMap;
//import java.util.Arrays;
import java.util.TreeSet;
import java.util.HashMap;

public class BOJ18870_CoordinateCompression {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
//        TreeMap<Integer, Integer> map = new TreeMap<>();
        TreeSet<Integer> set = new TreeSet<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
//            map.put(Integer.parseInt(st.nextToken()), i); // key:입력값, value:인덱스(자리) {
            int tmp = Integer.parseInt(st.nextToken());
            arr[i] = tmp;
            set.add(tmp);
        }
        int idx = 0;
        for (int s : set){ // set을 돌면서 그 해당 인덱스 값을 해시맵에 넣기
            map.put(s, idx);
            idx++;
        }
        // output은 0,1,2,3 순서대로 나온다. 0,1,4 이런식으로 띄엄띄엄 나오지는 않음(중요!!) 그냥 인덱스가 해당 결과값임!
        StringBuilder sb = new StringBuilder();
        for (int n : arr){
            sb.append(map.get(n)).append(" ");
        }
        System.out.println(sb);



    }
}

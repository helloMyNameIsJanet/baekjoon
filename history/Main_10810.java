import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.stream.Stream;

// history [site] [problem number] [url]
// history baeckjoon 10810 https://www.acmicpc.net/problem/10810
public class Main_10810 {
    public static void main(String[] args) throws IOException {
        // 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
        // 도현이는 앞으로 M번 공을 넣으려고 한다. 도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다. 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
        // 공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
        //--> 바구니수 N개 , 공을 던질 횟수 M번, / i j k -> i번부터 j번 바구니까지 k번 공을 던진다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int basketCount = Integer.parseInt(st.nextToken()); // 바구니 수
        int[] basket = new int[basketCount];
        int playCount = Integer.parseInt(st.nextToken());   // 공 던지기 수

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < playCount; i++) {
            String numbers = bf.readLine();
            StringTokenizer st2 = new StringTokenizer(numbers);

            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());
            int K = Integer.parseInt(st2.nextToken());

            for(int j=I-1;j<J;j++){
                basket[j] = K;
            }
        }

        for(int i = 0; i < basket.length; i++) {
            bw.write(basket[i] +" ");
        }

        bw.flush();
        bw.close();
    }
}
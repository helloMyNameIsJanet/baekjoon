import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.stream.Stream;

// last problem solving
public class Main_10813 {
    public static void main(String[] args) throws IOException {
        // 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
        // 도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
        // 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
        //--> 바구니수 N개 , 공을 던질 횟수 M번, / i j -> 공 바꿔치기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int basketCount = Integer.parseInt(st.nextToken()); // 바구니 수
        int[] basket = new int[basketCount];
        for(int i=0;i<basketCount;i++){
            basket[i] = i+1;
        }

        int playCount = Integer.parseInt(st.nextToken());   // 공 던지기 수

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < playCount; i++) {
            String numbers = bf.readLine();
            StringTokenizer st2 = new StringTokenizer(numbers);

            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());
            int K = basket[I-1];
            basket[I-1] = basket[J-1];
            basket[J-1] = K;
        }

        for(int i = 0; i < basket.length; i++) {
            bw.write(basket[i] +" ");
        }
        
        bw.flush();
        bw.close();
    }
}
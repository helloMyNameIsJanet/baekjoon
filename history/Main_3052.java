import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// history [site] [problem number] [url]
// history baeckjoon 3052 https://www.acmicpc.net/problem/3052
public class Main_3052 {
    public static void main(String[] args) throws IOException {
        // 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
        // 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(bf.readLine()) % 42;
        }

        // https://futurecreator.github.io/2018/08/26/java-8-streams/#google_vignette
        // 결과 만들기 > Calculating 항목 참조
        long count = IntStream.of(arr).count();
        long sum = IntStream.of(arr).sum();

        OptionalInt min = IntStream.of(arr).min();
        OptionalInt max = IntStream.of(arr).max();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(min.getAsInt()+"\n");
        bw.write(max.getAsInt()+"\n");
        bw.flush();
        bw.close();
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        // test commit
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(bf.readLine());  // 5

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < cnt; i++) {
            String numbers = bf.readLine();
            StringTokenizer st = new StringTokenizer(numbers);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            //System.out.println(A+B);
            bw.write(A+B+"\n");
            bw.flush();
        }
        bw.close();
    }
}

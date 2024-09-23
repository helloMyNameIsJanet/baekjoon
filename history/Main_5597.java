import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// history [site] [problem number] [url]
// history baeckjoon 5597 https://www.acmicpc.net/problem/5597
public class Main_5597 {
    public static void main(String[] args) throws IOException {
        // X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
        // 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
        // 1~30까지 배열을 채운 다음, 입력받은 번호 idx의 값을 0으로 초기화처리 한 후 => 값이 0이 아닐 때에만 출력함. 
        // --> list로 전환해서 제거하는 쪽으로 다시 생각해보기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[30];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1; // arr[2] = 3, arr[0] = 1
        }

        for(int i=0;i<28;i++){
            int tmp = Integer.parseInt(bf.readLine());
            for(int j=0;j<arr.length;j++){
                if(arr[tmp-1] == tmp){
                    arr[tmp-1] = 0;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<30;i++){
            if(arr[i] != 0) {
                bw.write(arr[i] +"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

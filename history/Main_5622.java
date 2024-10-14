import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// history [site] [problem number] [url]
// history baeckjoon 5622 https://www.acmicpc.net/problem/5622
public class Main_5622 {
    public static void main(String[] args) throws IOException {
        // 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
        // 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
        // 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
        String[] dials = "-,ABC,DEF,GHI,JKL,MNO,PQRS,TUV,WXYZ,-".split(",");

        // 입력 : 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] inputs = bf.readLine().toCharArray();
        int result = 0;
        for(int i = 0; i<inputs.length;i++){
            for(int j = 0;j<dials.length;j++){
                if(dials[j].indexOf(String.valueOf(inputs[i])) > -1){
                    //System.out.println("i:"+i + "," + "j:"+j+ "="+dials[j]+","+inputs[i]); // 1 + j + 2
                    result += 2 + j;
                    break;
                }
            }
        };
        
        // 출력 : 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
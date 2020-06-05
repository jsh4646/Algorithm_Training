import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 두수비교하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ab = br.readLine();
        StringTokenizer st =  new StringTokenizer(ab);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a > b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }   
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        //) 가 왔을 때, 직전 괄호가 ( 인 경우 > stack에서 (를 pop하고 stack size만큼 증가 , pipe 사이즈 끝이면 +1 하고 종료
        //) 가 왔을 때, 직전 괄호가 ( 이 아닌 경우 stack에서 pop은 하지만 ans는 1개만 증가 
        int len = input.length();
        int ans = 0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<len;i++){
            char c=input.charAt(i);
            //System.out.println("현재 탐색어 = "+c+", size = "+stack.size()+", ans = "+ans);
            if(c=='('){
                stack.push('(');
            } else if (c==')') {
                if(input.charAt(i-1)=='('){
                    stack.pop();
                    ans+=stack.size();
                }else{
                    stack.pop();
                    ans++;
                }
            }
        }
        System.out.println(ans);

        br.close();
    }
}

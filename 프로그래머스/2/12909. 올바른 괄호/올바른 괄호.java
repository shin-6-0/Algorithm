import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char chkS=s.charAt(i);
            if(chkS=='('){
                stack.push(String.valueOf(chkS));
            } else if(chkS==')') {
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            answer=true;
        }

        return answer;
    }
}
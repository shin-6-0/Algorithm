import java.util.*;
class Solution {
    public int solution(String s) {
                //괄호가 잘 닫겨야함! stack을 사용해서 풀어보자
        int answer = 0;
        Queue<String> queue = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i,i+1);
            queue.add(str);
        }
        for(int i=0;i<s.length();i++) {
            String firstS = queue.poll();
            queue.add(firstS);
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                String otherS = queue.poll();//맨앞거 빼고 나머지애들을 빼냄
                queue.add(otherS);
                if (stack.isEmpty()) {
                    stack.push(otherS);
                } else if (otherS.equals(")") && stack.peek().equals("(")) {
                    //남은 것이 stack에 짝과 맞을 경우
                    stack.pop();
                } else if (otherS.equals("]") && stack.peek().equals("[")) {
                    //남은 것이 stack에 짝과 맞을 경우
                    stack.pop();
                } else if (otherS.equals("}") && stack.peek().equals("{")) {
                    //남은 것이 stack에 짝과 맞을 경우
                    stack.pop();
                }else{
                    stack.push(otherS);
                }
            }
            if(stack.isEmpty()){
                answer++;
            }
        }

        return answer;
    }
}
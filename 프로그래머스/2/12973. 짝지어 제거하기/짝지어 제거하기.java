import java.util.*;
class Solution
{
    public int solution(String input)
    {
        int ans=0;
        Stack<Character> stInput = new Stack<Character>();
        for(char c:input.toCharArray()){
            if(!stInput.isEmpty()&& stInput.peek()==c){
                stInput.pop();
            }else{
                stInput.push(c);
            }
        }

        if(stInput.isEmpty()){
            ans=1;
        }
        return ans;
    }
}
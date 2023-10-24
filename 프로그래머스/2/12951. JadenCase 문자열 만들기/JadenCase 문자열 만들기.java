import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str=s.toLowerCase().split("");
        // 이전 값이 공백인지 체크한다.
        boolean space=true;
        
        for(String ss:str){
            //space가 true면 대문자로, 아니면 그냥 그대로 사용하기
            answer+=space ? ss.toUpperCase():ss;
            //공백이 오면 space를 true로, 아니면 false
            space=ss.equals(" ")? true : false;
        }
        return answer;
    }
}
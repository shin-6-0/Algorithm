import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr=s.split(" ");
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(ans);
        answer+=ans[0]+" ";
        answer+=ans[arr.length-1];
        return answer;
    }
}
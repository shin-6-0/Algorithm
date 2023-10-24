import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
         int[] answer = {0,0};
        int findN=0,findCount=0;
        HashSet<String> wordlist=new HashSet<>();
        wordlist.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!wordlist.contains(words[i])&&words[i-1].substring(words[i-1].length()-1,words[i-1].length()).equals(words[i].substring(0,1))){
                wordlist.add(words[i]);
            }else{
                findN=(i+1)%n;
                findCount=(int)Math.round((i)/n+1);
                answer[0]=findN;
                answer[1]=findCount;
                break;
            }
        }
        if(findN==0&&findCount!=0){
            answer[0]=n;
        }
        System.out.println(answer[0]+", "+answer[1]);
        return answer;
    }
}
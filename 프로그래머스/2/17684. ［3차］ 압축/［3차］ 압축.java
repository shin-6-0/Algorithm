import java.util.*;


class Solution {
    public static ArrayList<Integer> solution(String msg) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int index = 1;
        int w=0,c=1;
        HashMap<String, Integer> dictionary = new HashMap<String,Integer>();
        for(char i='A';i<='Z';i++){
            dictionary.put(String.valueOf(i),index++);
        }
        while(true){
            if(c==msg.length()){
                String word=msg.substring(w,c);
                int value=dictionary.get(word);
                ans.add(value);//사전 색인 번호 등록
                break;
            } else{
                //System.out.print(w+":"+c);
                String wWord=msg.substring(w,c);
                String cWord=msg.substring(c,c+1);
                int wValue=dictionary.get(msg.substring(w,c));
                int cValue=dictionary.get(msg.substring(c,c+1));
                //System.out.println("        |w인덱스 = "+wValue+", w단어 =  "+wWord+", c인덱스 = "+cValue+" c단어 = "+cWord);
                String chkWord=msg.substring(w,c+1);
                if(dictionary.containsKey(chkWord)){//현재글자+다음글자가 사전에 있음
                    c++;
                }else{//현재글자+다음글자가 사전에 없음
                    //System.out.println("["+chkWord+":"+index+"] << 사전에 등록");
                    dictionary.put(chkWord,index);
                    ans.add(wValue);//사전 색인 번호 등록
                    w=c;
                    c++;
                    index++;
                }
            }
        }
        return ans;
    }
}
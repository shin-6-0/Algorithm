import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
         //J(a,b) 자카드 유사도 = 교집합 크기를 합집합 크기로 나눈 것
        int answer = 0;
        double jaccard = 0.0;
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        List<String> intersection=new ArrayList<>();
        List<String> union=new ArrayList<>();
        List<String> newStr1= new ArrayList<>();
        List<String> newStr2= new ArrayList<>();
        for(int i=1;i<str1.length();i++){
            if((str1.charAt(i)>=65&&str1.charAt(i)<=90)&&(str1.charAt(i-1)>=65&&str1.charAt(i-1)<=90)){
                String input= String.valueOf(str1.charAt(i-1))+String.valueOf(str1.charAt(i));
                newStr1.add(input);
            }
        }
        for(int i=1;i<str2.length();i++){
            if((str2.charAt(i)>=65&&str2.charAt(i)<=90)&&(str2.charAt(i-1)>=65&&str2.charAt(i-1)<=90)){
                String input= String.valueOf(str2.charAt(i-1))+String.valueOf(str2.charAt(i));
                newStr2.add(input);
            }
        }
        Collections.sort(newStr1);
        Collections.sort(newStr2);
        for(String s:newStr1){
            if(newStr2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }
        for(String s:newStr2){
            union.add(s);
        }

        jaccard= (double) intersection.size() /union.size();
        if(intersection.size()==0&&union.size()==0){
            jaccard=1;
        }
        answer= (int) (jaccard*65536);
        return answer;
    }
}
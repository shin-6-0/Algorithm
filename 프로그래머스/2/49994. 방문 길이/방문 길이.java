import java.util.*;

class Solution {
    public static int solution(String dirs) {
        /*
        U:위 D:아래 R:오른쪽 L:왼쪽
        key point : 1. 처음 걸은 길을 기록 & check 2. 좌표평면을 넘어가는 경우 무시
         */
        int answer = 0;
        List<String> list = new ArrayList<>();
        int row=0,col=0;
        for(int i=0;i<dirs.length();i++){
            char c=dirs.charAt(i);
            //System.out.print(c+" ");
            String now=c+":"+row+","+col;

            if(c=='U'){
                String reverse="D:"+row+","+(col+1);
                if(!list.contains(now)&&!list.contains(reverse)&&col!=5){
                    list.add(now);
                    list.add(reverse);
                    answer++;
                }
                if(col!=5){
                    col++;
                }
            } else if (c=='D') {
                String reverse="U:"+row+","+(col-1);
                if(!list.contains(now)&&!list.contains(reverse)&&col!=-5){
                    list.add(now);
                    list.add(reverse);
                    answer++;
                }
                if(col!=-5){
                    col--;
                }
            }else if (c=='R') {
                String reverse="L:"+(row+1)+","+col;
                if(!list.contains(now)&&!list.contains(reverse)&&row!=5){
                    list.add(now);
                    list.add(reverse);
                    answer++;
                }
                if(row!=5){
                    row++;
                }
            }else if (c=='L') {
                String reverse="R:"+(row-1)+","+col;
                if(!list.contains(now)&&!list.contains(reverse)&&row!=-5){
                    list.add(now);
                    list.add(reverse);
                    answer++;
                }
                if(row!=-5){
                    row--;
                }
            }
//            System.out.println("현재 row = "+row+", 현재 col = "+col+", 현재 ans = "+answer);
        }
        return answer;
    }
}
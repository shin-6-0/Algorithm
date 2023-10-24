import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
                int answer = 1;
        List<Map<String,Integer>> list=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        //의상종류별로 (종류+1)*(종류+1)*(종류+1)-1
        for(int i=0;i<clothes.length;i++){
            if(map.containsKey(clothes[i][1])){
                int n=map.get(clothes[i][1]);
                map.put(clothes[i][1],n+1);
            }else{
                map.put(clothes[i][1],1);
            }
            list.add(map);
        }

        // 방법2
        for( Map.Entry<String, Integer> e : map.entrySet() ){
            //System.out.println( String.format("키 : %s, 값 : %s", e.getKey(), e.getValue()) );
            answer*=(e.getValue()+1);
        }
        return answer-1;
    }
}
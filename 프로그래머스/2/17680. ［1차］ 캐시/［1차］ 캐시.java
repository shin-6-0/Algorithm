import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize==0){
            return cities.length*5;
        }
        LinkedList<String> cache = new LinkedList<>();
        for(int i=0;i<cities.length;i++){
            String s=cities[i].toUpperCase(); //대소문자 구분을 하지 않아 전부다 upperCase로 대문자처리
            if(cache.remove(s)){ //s값이 존재할 경우 이 값을 지우고 true를 반환
                answer++;
                cache.add(s);
            }else{
                answer+=5;
                if(cache.size()>=cacheSize){
                    cache.remove(0);//0번째 리스트 삭제
                }
                cache.add(s);
            }
        }

        return answer;
    }
}
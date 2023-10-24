import java.util.*;

class Solution {
    public List<Integer> solution(String s) {
        int[] answer = {};
        List<Integer> tuple=new ArrayList<>();
        s=s.substring(2,s.length()-2).replace("},{","!"); //맨앞 {{, 맨뒤 }} 삭제 후 {,} 형태를 전부 !로 변경
        String[] arr=s.split("!");//!를 기준으로 나누면, },{ 를 기준으로 나눠지기 때문에 바로 분리해서 넣기가 가능.
        Arrays.sort(arr, new Comparator<String>() { //arr내의 string길이에 따라 재정렬
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        for(String d:arr){
            String[] temp=d.split(",");
            for(int i=0;i<temp.length;i++){
                int n=Integer.parseInt(temp[i]);
                if(!tuple.contains(n)){
                    tuple.add(n);
                }
            }
        }

        return tuple;
    }
}
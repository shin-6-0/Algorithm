import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        //System.out.println("n = "+n+", k = "+k);
        int[] arr=new int[n];
        // 1 2 3 4
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i<=n){
                list.add(i);
            }
        }
        int index=k-1;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(list.size()>=1){
            if(index>=list.size()){
                while(index>=list.size()){
                    index-=list.size();
                }
                sb.append(list.get(index)).append(", ");
                list.remove(index);
            }else{
                sb.append(list.get(index)).append(", ");
                list.remove(index);
            }
            index+=(k-1);
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}

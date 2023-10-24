import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr=new char[5][15];
        int lenX=1;
        for(int i=0;i<5;i++){
            String str=br.readLine();
            for(int j=0;j<str.length();j++){
                arr[i][j]=str.charAt(j);
            }
            if(arr[i].length>lenX){
                lenX=arr[i].length;
            }
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<lenX;i++){
            for(int j=0;j<5;j++){
                if(arr[j][i]=='\0')continue ;
                else sb.append(arr[j][i]);
            }
        }

        System.out.print(sb);
    }
}

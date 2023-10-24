import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String input=sc.next();
		String arr[]= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0;i<arr.length;i++) {
			if(input.contains(arr[i])) {
				input=input.replace(arr[i],"&");
			}
		}
		System.out.println(input.length());

	}

}
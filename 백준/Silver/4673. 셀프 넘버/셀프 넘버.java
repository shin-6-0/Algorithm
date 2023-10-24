
public class Main {

	public static void main(String[] args) {
		int[] arr=new int[10001];
		for(int i=1;i<=10000;i++) {
			if(selfnumber(i)<=10000) {
			int j=selfnumber(i);
			arr[j]=j;
			}
		}
		for(int j=1;j<10000;j++) {
			if(arr[j]==0) {
				System.out.println(j);
			}
		}
	}
	
	public static int selfnumber(int num) {
		if(num<10 && num>0) {
			return(num*2);
		}
		else if(num>=10 && num<100) {
			return (num+num%10+num/10);
		}
		else if(num>=100 && num<1000) {
			return (num+num/100+num%100/10+num%10);
		}
		else if(num>=1000 && num<10000) {
			return(num+num/1000+num%1000/100+num%100/10+num%10);
		}
		else return 0;
		
	}

}
/*
 *1의자리 a) 짝수
 *10의자리 ab) a*10+b+a+b = 11a+2b   
 *100 abc)a*100+b*10+c+a+b+c = 101a+11b+2c
 *1000 abcd) 1001a+101b+11c+2c
 *10000 )
 */
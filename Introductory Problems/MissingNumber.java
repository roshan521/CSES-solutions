import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
		long s= 0;
		for(int i=0;i<n-1;i++){

		    s=s + sc.nextLong();

		}
		System.out.println(n*(n+1)/2-s);
        
        sc.close();
    }
}
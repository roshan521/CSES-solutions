import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      long max,last;
      max= last=0;
      for(int i=1;i<=n;i++){
         long x =scan.nextLong();
          if(x<last){
            max=max+last-x;
            last = x+(last-x);
          }else
         last=x;
 
       }
   System.out.println(max);
   scan.close();
 
    }
}

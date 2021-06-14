import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      StringBuilder sb = new StringBuilder();
      if( n==2||n==3){
         System.out.println("NO SOLUTION");
      }else if(n==1){
         System.out.println("1");
      }else{
          for(int i=2;i<=n;i+=2){//for even numbers
          sb.append(i+" ");
          }
          for(int i=1;i<=n;i+=2){//for odd numbers
          sb.append(i+" ");
          }
        }
     System.out.println(sb);
     scan.close();
 
    }
}

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String DNA = sc.nextLine();
      int count, best;
      count=best=1;
      for(int i=1;i<DNA.length();i++){
          if(DNA.substring(i, i+1).equals(DNA.substring(i-1, i))){
              count++;
          }else{
              count=1;
          }
          if(best<count)
           best=count;
      }
      System.out.println(best);
      sc.close();     
    }
}

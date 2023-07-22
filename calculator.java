import java.util.Scanner;

public class calculator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("plese enter the operator");
    String x = sc.next();
    System.out.println("plese enter the number");
    int m = sc.nextInt();
    int s = sc.nextInt();
    if (x.equals("+")){
      System.out.println(m+s);
    } 
    else if (x.equals("-")){
      System.out.println(m-s);
    } 
    else if (x.equals("*")){
      System.out.println(m*s);
    } 
    else if (x.equals("/")){
      System.out.println(m/s);
    } 
    else {
      System.out.println("坂本の口臭すぎ//");
      System.out.println("坂本のちんこちっちゃ//加えちゃお//");
      System.out.println("erro//");
      System.out.println("坂本走り射ちきもちよすぎ//");  
      System.out.println("坂本の脳真っピンク//");
      System.out.println("藤原名前ダサｗｗ");
    }
  }
}
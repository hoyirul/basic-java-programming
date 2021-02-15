import java.util.Scanner;
public class Fibonacci {
  static int rekursif(int n){
    if(n == 0 || n == 1){
      return n;
    } else {
      return (rekursif(n-1) + rekursif(n-2));
    }
  }

  static void println(String data){
      System.out.println(data);
  }

  static void print(String data){
      System.out.print(data);
  }

  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int i, j = 0;
    
    print("Masukkan jumlah deret bilangan fibonacci: ");
    int n = scan.nextInt();
    
    System.out.print("Nilai n " + n + " Hasil bilangan fibonacci : ");
    for (i = 0; i < n; i++){
      print(rekursif(j)+", ");
      j++;
    }
    
    println("");
  }
}
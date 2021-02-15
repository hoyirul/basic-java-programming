import java.util.Scanner;
class FibonacciLoop{  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, t1 = 0, t2 = 1;
        System.out.print("Masukkan jumlah deret bilangan fibonacci : ");
        n = sc.nextInt();
        System.out.print("Nilai n " + n + " Hasil bilangan fibonacci : ");

        for (int i = 1; i <= n; ++i){
            System.out.print(t1 + ", ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}  
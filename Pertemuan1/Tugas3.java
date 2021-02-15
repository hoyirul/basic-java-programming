import java.util.Scanner;
class Tugas3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		print("Masukkan Nilai N : ");
		int y = in.nextInt();

		bilGenap(y);
	}

	static void bilGenap(int y){
		int x = 0, i = 0 , z = 0;
		do{
			z += 2;
			if (z % 2 == 0) {
				if (z % 4 == 0) {
					continue;
				}
				print(z + ",");
			}
			i++;
		}while(i < y);
	}

	static void println(String str){
		System.out.println(str);
	}

	static void print(String str){
		System.out.print(str);
	}
}
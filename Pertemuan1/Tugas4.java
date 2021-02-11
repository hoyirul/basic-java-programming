import java.util.Scanner;
class Tugas4{
	static Scanner sc = new Scanner(System.in);

	static void println(String str){
		System.out.println(str);
	}

	static void print(String str){
		System.out.print(str);
	}

	public static void main(String[] args) {
		menu();
	}

	static void menu(){
		println("-----------------------------------------");
		double luas = 0, a, t, p, l, r;
		println("PILIH MENU MENGHITUNG LUAS");
		println("1. SEGITIGA");
		println("2. PERSEGI PANJANG");
		println("3. LINGKARAN");
		println("0. EXIT");
		print("o> ");
		int option = sc.nextInt();

		println("");
		println("-----------------------------------");
		switch(option){
			case 1:
				println("MENGHITUNG LUAS SEGITIGA");
				print("Masukkan alas   : ");
				a = sc.nextDouble();
				print("Masukkan tinggi : ");
				t = sc.nextDouble();
				luas = luasSegitiga(a, t);
				println("-----------------------------------");
				println("LUAS = " + luas);
				menu();
				break;
			case 2:
				println("MENGHITUNG LUAS PERSEGI PANJANG");
				print("Masukkan panjang : ");
				p = sc.nextDouble();
				print("Masukkan lebar   : ");
				l = sc.nextDouble();
				luas = luasPersegiPanjang(p, l);
				println("-----------------------------------");
				println("LUAS = " + luas);
				menu();
				break;
			case 3:
				println("MENGHITUNG LUAS LINGKARAN");
				print("Masukkan jari-jari(r) : ");
				r = sc.nextDouble();
				luas = luasLingkaran(r);
				println("-----------------------------------");
				println("LUAS = " + luas);
				menu();
				break;
			default:
				println("EXIT BERHASIL");
		}
		println("-----------------------------------------");
		println("");
	}



	static double luasSegitiga(double a, double t){
		double hasil = 0;
		if (a == 0 || t == 0) {
			println("Alas/Tinggi tidak boleh 0");
		}else{
			hasil = 0.5 * a * t;
		}

		return hasil;
	}

	static double luasPersegiPanjang(double p, double l){
		double hasil = 0;
		if (p == 0 || l == 0) {
			println("Panjang/Lebar tidak boleh 0");
		}else{
			hasil = p * l;
		}

		return hasil;	
	}

	static double luasLingkaran(double r){
		double hasil = 0;
		if (r == 0) {
			println("Jari-jari tidak boleh 0");
		}else{
			if(r % 7 == 0){
				hasil = r * (22/7);
			}else{
				hasil = r * 3.14;
			}
		}

		return hasil;
	}
}
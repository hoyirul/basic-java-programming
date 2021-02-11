import java.util.Scanner;
class Perulangan{

	static void line(int n){
		for(int i=0;i<n;i++){
			System.out.print("-");
		}
		System.out.println();
	}

	static void println(String data){
		System.out.println(data);
	}

	static void print(String data){
		System.out.print(data);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nim, str = "";
		int parseNim;

		print("Masukkan NIM anda : ");
		nim = sc.nextLine();
		
		if(nim.length() > 2) {
		    str = nim.substring(nim.length() -2);
		}else{
		    str = nim;
		}

		parseNim = Integer.parseInt(str);
		if(parseNim < 10){
			parseNim += 10;
			loop(parseNim);
		}else{
			loop(parseNim);
		}
	}

	static void loop(int nim){
		line(80);
		println("Nilai N : " + nim);
		line(30);
		for (int i=0;i<nim;i++) { // perulangan
            // % (modulus)
            int day = i % 7; // kenapa 7 karena jumlah hari dalam 1 minggu ada 7
            days(day);
        }
        println("");
		line(80);
	}

	static void days(int day){
		switch(day){
			case 0:
				print("senin ");
				break; 
			case 1:
				print("selasa ");
				break; 
			case 2:
				print("rabu ");
				break; 
			case 3:
				print("kamis ");
				break; 
			case 4:
				print("jumat ");
				break; 
			case 5:
				print("sabtu ");
				break; 
			case 6:
				print("minggu ");
				break;
			default:
				print("day not found ");
				break; 
		}
	}
}
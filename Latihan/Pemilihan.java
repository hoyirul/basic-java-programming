import java.util.Scanner;
class Pemilihan{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String scoreAlpha = "", passingGrade = "";
		double tugas, uts, uas, calTugas, calUTS, calUAS, finalScore = 0;

		line(40);
		System.out.println("PROGRAM MENGHITUNGAN NILAI AKHIR");
		line(40);

		System.out.print("Masukkan Nilai Tugas : ");
		tugas = sc.nextDouble();
		System.out.print("Masukkan Nilai UTS   : ");
		uts = sc.nextDouble();
		System.out.print("Masukkan Nilai UAS   : ");
		uas = sc.nextDouble();

		calTugas = nilTugas(tugas);
		calUTS = nilUTS(uts);
		calUAS = nilUAS(uas);
		finalScore = calTugas + calUTS + calUAS;

		line(40);
		System.out.println("NILAI AKHIR MAHASISWA");
		line(40);
		System.out.printf("NILAI AKHIR	: %.2f \n", finalScore);
		scoreAlpha = letterGrades(finalScore);
		passingGrade = passingGrades(finalScore);
		System.out.printf("NILAI HURUF	: %s \n", scoreAlpha);
		System.out.printf("STATUS 		: %s \n", passingGrade);
		line(40);

	}

	static double nilTugas(double tugas){
		// 20%
		double x = tugas * 0.20;
		return x;
	}

	static double nilUTS(double uts){
		// 35%
		double x = uts * 0.35;
		return x;
	}

	static double nilUAS(double uas){
		// 45%
		double x = uas * 0.45;
		return x;
	}

	static void line(int n){
		for(int i=0;i<n;i++){
			System.out.print("-");
		}
		System.out.println();
	}

	static String letterGrades(double finalScore){
		String grade = "";
		
		if(finalScore <= 39){
			grade = "E";
		}else if(finalScore <= 50){
			grade = "D";
		}else if(finalScore <= 60){
			grade = "C";
		}else if(finalScore <= 65){
			grade = "C+";
		}else if(finalScore <= 73){
			grade = "B";
		}else if(finalScore <= 80){
			grade = "B+";
		}else{
			grade = "A";
		}

		return grade;
	}

	static String passingGrades(double finalScore){
		String grade = "";
		if(finalScore <= 100 && finalScore > 50){
			grade = "SELAMAT ANDA LULUS";
		}else{
			grade = "MAAF ANDA TIDAK LULUS";
		}

		return grade;
	}
}

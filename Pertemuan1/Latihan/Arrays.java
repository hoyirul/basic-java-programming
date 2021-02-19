import java.util.Scanner;
class Arrays{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int calFlow[][] = {
			{10-1, 5-2, 15-0, 7-5},
			{6, 11, 9, 12},
			{2, 10, 10, 5},
			{5, 7, 12, 9}
		};

		int sumBasedFlower[] = {0,0,0,0};
		int sumBasedStore[] = {0,0,0,0};
		double price[] = {75000, 50000, 60000, 10000};

		String flowerName[] = {"Aglonema  ", "Keladi    ", "Alocasia  ", "Mawar     "};
		String storeName[] = {"Store1", "Store2", "Store3", "Store4"};

		System.out.print("         ");
		for (int i=0;i<flowerName.length;i++) {
			System.out.print(flowerName[i]);
		}

		System.out.println();
		System.out.println("----------------------------------------------------");
		for (int i=0;i<calFlow.length;i++) {
			System.out.print(storeName[i] + " | ");
			for (int j=0;j<calFlow[0].length;j++) {
				System.out.print("   " + calFlow[i][j] + "     ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// sum based on flowerName
		for (int i=0;i<calFlow[0].length;i++) {
			for (int j=0;j<calFlow.length;j++) {
				// System.out.print(calFlow[i][j] + " ");
				sumBasedFlower[i] += calFlow[j][i];
			}
			// System.out.println();
		}

		// sum based on storeName
		for (int i=0;i<calFlow.length;i++) {
			for (int j=0;j<calFlow[0].length;j++) {
				// System.out.print(calFlow[i][j] + " ");
				sumBasedStore[i] += calFlow[i][j];
			}
			// System.out.println();
		}

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("JUMLAH BERDASARKAN JENIS BUNGA DAN TOKO CABANG");
		System.out.println("----------------------------------------------------");
		for (int i=0;i<4;i++) {
			System.out.println(flowerName[i] + " : " + sumBasedFlower[i] + " | " + storeName[i] + " : " + sumBasedStore[i]);
		}

		System.out.println("----------------------------------------------------");

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("DETAIL SUBTOTAL PER JENIS BUNGA");
		System.out.println("----------------------------------------------------");

		for (int i=0;i<sumBasedFlower.length;i++) {
			System.out.println(flowerName[i] + " : " + sumBasedFlower[i] + " x " + price[i] + " = " + (sumBasedFlower[i] * price[i]));
		}

		System.out.println("----------------------------------------------------");

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("DETAIL SUBTOTAL PER TOKO BUNGA");
		System.out.println("----------------------------------------------------");
		
		for (int i=0;i<sumBasedStore.length;i++) {
			System.out.println(storeName[i] + " : " + sumBasedStore[i] + " x " + price[i] + " = " + (sumBasedStore[i] * price[i]));
		}

		double total = 0;
		for (int i=0;i<sumBasedFlower.length;i++) {
			total += (sumBasedFlower[i] * price[i]);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("TOTAL : Rp. " + total);
		System.out.println("----------------------------------------------------");

	}
}
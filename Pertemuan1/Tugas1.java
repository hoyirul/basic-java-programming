import java.util.Scanner;
class Tugas1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double price = 4500, total = 0, diskon = 0, subtotal = 0;
		int clothes[] = {4, 15, 6, 11};
		String customers[] = {"ANI ", "BUDI", "BINA", "CITA"};

		System.out.println("------------------------------------------------------");
		System.out.println("                   SMILE LAUNDRY ");
		System.out.println("------------------------------------------------------");
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println("SUBTOTAL");
		System.out.println("----------");
		for(int i=0;i<4;i++) {
			if (clothes[i] > 10) {
				diskon = clothes[i] * (price * 0.05);
				subtotal = (clothes[i] * price) - diskon;
				total += subtotal;
				System.out.println(customers[i] + " : " + clothes[i] + "kg x " + price + " = Rp. " + subtotal);
			}else{
				subtotal = clothes[i] * price;
				total += subtotal;
				System.out.println(customers[i] + " : " + clothes[i] + "kg  x " + price + " = Rp. " + subtotal);
			}
		}
		System.out.println("------------------------------------------------------");

		System.out.println("TOTAL PENDAPATAN     = Rp. " + total);
		System.out.println("------------------------------------------------------");
	}
}

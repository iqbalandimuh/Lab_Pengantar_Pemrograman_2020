import java.util.Scanner;
public class praktik2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan detik");
		int d = input.nextInt();
		int jam;
		int detik;
		int menit;
		jam = d/3600;
		menit = (d % 3600)/60;
		detik = (d % 3600) %60;

		System.out.printf("%02d : %02d : %02d", jam, menit, detik);
	}
}
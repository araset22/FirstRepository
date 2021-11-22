import java.util.Scanner;

public class Ex_105 {

	public static void main(String[] args) {
		String[] days = { "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" };
		
		System.out.println("Hola, Sóc Albert Raset Hernándezf fdsg");
		Scanner teclat = new Scanner(System.in);
		double d = 0;
		while ((d = teclat.nextDouble()) != -1) {
			double mayor;
			double menor;
			double s;
			mayor = menor = s = d;
			int indiceMayor;
			int indiceMenor;
			indiceMayor = indiceMenor = 0;
			boolean esMayor;
			boolean esMenor;
			esMayor = esMenor = false;

			for (int i = 1; i <= 5; i++) {
				d = teclat.nextDouble();
				s += d;
				if (d == mayor) {
					esMayor = true;
				} else if (d > mayor) {
					mayor = d;
					indiceMayor = i;
					esMayor = false;
				} else if (d == menor) {
					esMenor = true;
				} else if (d < menor) {
					menor = d;
					indiceMenor = i;
					esMenor = false;
				}
			}

			if (esMayor || esMenor) {
				System.out.print("EMPATE\n");

			} else {
				System.out.print(days[indiceMayor] + " " + days[indiceMenor] + " " + (s / 6 < d ? "SI" : "NO") + "\n");
			}

		}
		teclat.close();
	}
}

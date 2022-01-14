import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Rectangulo;
import entidades.enums.Color;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Forma> list = new ArrayList<>();
		System.out.print("Digite o número de formas: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da forma #"+i+":");
			System.out.print("Rectángulo ou círculo (r/c)? ");
			char f = sc.next().charAt(0);
			System.out.print("Color (Preto/Azul/Vermelho): ");
			sc.nextLine();
			Color color = Color.valueOf(sc.nextLine());
			if (f == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				Forma forma = new Rectangulo(color , largura, altura);
				list.add(forma);
			} else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				Forma forma = new Circulo(color, raio);
				list.add(forma);
			}
		}
		
		for (Forma forma : list) {
			System.out.println(forma);
		}
		
		sc.close();

	}

}

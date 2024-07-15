package application1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities1.AluguelDeCarro;
import model.entities1.Veiculo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do Aluguel:");
		System.out.print("Modelo do Carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mmm): ");
		LocalDate dataInicio = LocalDate.parse(sc.nextLine(),dtf);
		System.out.print("Retorno (dd/MM/yyyy HH:mmm): ");
		LocalDate dataFim = LocalDate.parse(sc.nextLine(),dtf);
		
		AluguelDeCarro alucar = new AluguelDeCarro(dataInicio, dataFim, new Veiculo(modelo));
		
		sc.close();

	}

}

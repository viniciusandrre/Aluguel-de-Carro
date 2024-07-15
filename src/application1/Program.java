package application1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities1.AluguelDeCarro;
import model.entities1.Veiculo;
import model.services1.AluguelDeServiço;
import model.services1.TaxaDeImpostoBrasil;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do Aluguel:");
		System.out.print("Modelo do Carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mmm): ");
		LocalDateTime dataInicio = LocalDateTime.parse(sc.nextLine(),dtf);
		System.out.print("Retorno (dd/MM/yyyy HH:mmm): ");
		LocalDateTime dataFim = LocalDateTime.parse(sc.nextLine(),dtf);
		
		AluguelDeCarro alucar = new AluguelDeCarro(dataInicio, dataFim, new Veiculo(modelo));
		
		System.out.print("Entre com o preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
		AluguelDeServiço aluser = new AluguelDeServiço(precoPorHora,precoPorDia,new TaxaDeImpostoBrasil());
		
		aluser.processoDeFatura(alucar);
		
		System.out.println("Fatura:");
		System.out.println("Pagamento Basico: " + String.format("%.2f",alucar.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", alucar.getFatura().getImposto()));
		System.out.println("Pagamento Total: " + String.format("%.2f", alucar.getFatura().pagamentoTotal()));
		
		sc.close();
	}

}

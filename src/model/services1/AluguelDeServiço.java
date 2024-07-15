package model.services1;

import java.time.Duration;

import model.entities1.AluguelDeCarro;
import model.entities1.Fatura;

public class AluguelDeServiço {
	private Double precoPorHora;
	private Double precoPorDia;
	
	private ServiçoDeImposto servicoDeImposto;

	public AluguelDeServiço(Double precoPorHora, Double precoPorDia, ServiçoDeImposto servicoDeImposto) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.servicoDeImposto = servicoDeImposto;
	}

	public Double getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(Double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

	public Double getPrecoPorDia() {
		return precoPorDia;
	}

	public void setPrecoPorDia(Double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}

	public ServiçoDeImposto getServicoDeImposto() {
		return servicoDeImposto;
	}

	public void setServicoDeImposto(ServiçoDeImposto servicoDeImposto) {
		this.servicoDeImposto = servicoDeImposto;
	}
	
	public void processoDeFatura(AluguelDeCarro aluguelDeCarro) {
		double minutos = Duration.between(aluguelDeCarro.getDataInicio(), aluguelDeCarro.getDataFim()).toMinutes();
		double horas = minutos/60;
		
		double pagamentoBasico = 0.0;
		
		if(horas <=12) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		}
		else {
			pagamentoBasico = precoPorDia * Math.ceil(horas/24);
		}
		
		double taxa = servicoDeImposto.taxa(pagamentoBasico);
		aluguelDeCarro.setFatura(new Fatura(pagamentoBasico,taxa));
		
		
	}
	
	
}

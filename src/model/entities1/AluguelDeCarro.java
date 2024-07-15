package model.entities1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AluguelDeCarro {
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelDeCarro() {
	}
	
	public AluguelDeCarro(LocalDateTime dataInicio2, LocalDateTime dataFim2, Veiculo veiculo) {
		this.dataInicio = dataInicio2;
		this.dataFim = dataFim2;
		this.veiculo = veiculo;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
}

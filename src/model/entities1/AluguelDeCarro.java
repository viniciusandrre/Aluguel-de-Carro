package model.entities1;

import java.time.LocalDate;

public class AluguelDeCarro {
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelDeCarro() {
	}
	
	public AluguelDeCarro(LocalDate dataInicio, LocalDate dataFim, Veiculo veiculo) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.veiculo = veiculo;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
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

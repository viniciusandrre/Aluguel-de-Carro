package model.entities1;

public class Fatura {
	private Double pagamentoBasico;
	private Double imposto;
	private Double pagamentoTotal;
	
	public Fatura() {
	}

	public Fatura(Double pagamentoBasico, Double imposto, Double pagamentoTotal) {
		this.pagamentoBasico = pagamentoBasico;
		this.imposto = imposto;
		this.pagamentoTotal = pagamentoTotal;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

	public Double getPagamentoTotal() {
		return pagamentoTotal;
	}

	public void setPagamentoTotal(Double pagamentoTotal) {
		this.pagamentoTotal = pagamentoTotal;
	}
	
	
}

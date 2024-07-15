package model.services1;

public class TaxaDeImpostoBrasil {
	public Double taxa(Double montante) {
		if(montante <= 100.00) {
			return montante * 0.2;
		}
		else {
			return montante * 0.15;
		}
	}
}

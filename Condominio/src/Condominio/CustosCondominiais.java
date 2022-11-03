package Condominio;

import java.time.LocalDate;

public class CustosCondominiais {
	private float contaEnergia;
	private float contaAgua;
	private float salarioLimpeza;
	private boolean mesPintura;
	private boolean mesServicos;
	private float valorTotalMensalPagar;
	
	
	public float getContaEnergia() {
		return contaEnergia;
	}
	public void setContaEnergia(float contaEnergia) {
		this.contaEnergia = contaEnergia;
	}
	public float getContaAgua() {
		return contaAgua;
	}
	public void setContaAgua(float contaAgua) {
		this.contaAgua = contaAgua;
	}
	public float getSalarioLimpeza() {
		return salarioLimpeza;
	}
	public void setSalarioLimpeza(float salarioLimpeza) {
		this.salarioLimpeza = salarioLimpeza;
	}
	public boolean isMesPintura() {
		return mesPintura;
	}
	public void setMesPintura(boolean mesPintura) {
		this.mesPintura = mesPintura;
	}
	public boolean isMesServicos() {
		return mesServicos;
	}
	public void setMesServicos(boolean mesServicos) {
		this.mesServicos = mesServicos;
	}
	public float getValorTotalMensalPagar() {
		return valorTotalMensalPagar;
	}
	public void setValorTotalMensalPagar(float valorTotalMensalPagar) {
		this.valorTotalMensalPagar = valorTotalMensalPagar;
		if(isMesPintura() && isMesServicos()) {
			// pegar o valor da pintura com o usuario
			// pegar o valor de serviço de jardinagem com o usuário
		}
		if(LocalDate.now().getMonthValue() <= 5) {
			float descontoValor;
			descontoValor = this.valorCondominio * 10/100;
		}
	}
	
	
	
}

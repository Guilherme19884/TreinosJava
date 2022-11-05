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
		this.valorTotalMensalPagar = valorTotalMensalPagar ;
		if((this.mesServicos) &&  (LocalDate.now().getDayOfMonth() <= 5)) {
			float descontoValor;
			descontoValor = this.valorTotalMensalPagar * 10/100;
			this.valorTotalMensalPagar -=  descontoValor;
		}
	}
	
	
	public String toString() {
		String pintou;
		String serv;
		
		if (this.isMesPintura()) {
			pintou = "Sim";
		} else {
			pintou = "Nao";
		};
		if (this.isMesServicos()) {
			serv ="Sim";
		}
		else {
			serv= "Nao";
		}
		return "\n*****************RESULTADO***************************\n"
				+"A conta geral do condominio ficou "
				+ this.getValorTotalMensalPagar()
				+"\n tiveram esses servicos extras: "
				+"\n Teve Servico de Manutencao? "
				+this.isMesServicos()
				+"\n Teve pintura esse mes? "
				+ pintou
				+"\n Teve servico esse mes? "
				+ serv;
					
	}
	
	//public void somaDasContas() {
	//	valorTotalMensalPagar += contaAgua +  contaEnergia ;
	//	System.out.println(getValorTotalMensalPagar());
	//}
	
	public String demonstrativoContas(String demonstrativo) {
		demonstrativo += contaAgua +  contaEnergia ;
		return demonstrativo ;
	}
}

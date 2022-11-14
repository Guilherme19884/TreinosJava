package PostoCombustivel;


public class Bomba {
	private String tipoCombustivel;
	private float valorCombustivel;
	private int quantidadeCombustivel;
	
	
	//metodos modificadores
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public float getValorCombustivel() {
		return valorCombustivel;
	}
	public void setValorCombustivel(float valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}
	public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	//métodos espéciais 
	public float abastecerPorValor(float ValorASerAbastecido) {
		/*metodo que é informado o valor a ser abastecido e mostra a quantidade de litros que 
		  colcada no veículo.*/
		
		ValorASerAbastecido *= this.valorCombustivel  ;
		return ValorASerAbastecido; 
		
	}
	/*método onde é informado a quantidade litro abastecido e mostra o valor referente a 
	 * quantidade que vai ser pago pelo cliente.
	 */
	public  float abastecerPorLitro(float abastecerPorLitro ) {
		
		abastecerPorLitro = abastecerPorLitro * this.valorCombustivel ;
		return abastecerPorLitro ;
	}
	/* 
	 * Alterar o valor do litro de combustível
	 */
	public void alterarValor(float novoValorCombustivel) {
		this.valorCombustivel = novoValorCombustivel;
	}
	/*
	 * Esse metodo tem como função principal alterar o tipo de combustivel
	 */
	public void alterarCombustivel(String tipoNovoCombustivel) {
		this.tipoCombustivel = tipoNovoCombustivel;
	}
	public void alterarQuantidadeCombustivel(int novaQtd) {
		this.quantidadeCombustivel = novaQtd;
	}
}

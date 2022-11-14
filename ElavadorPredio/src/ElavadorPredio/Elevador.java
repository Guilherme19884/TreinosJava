package ElavadorPredio;

public class Elevador {
	private int capacidadeMaxima;
	private int andarAtual;
	private int totalAndares;
	private int pessoasDentro;
	
	
	

    /**
     * @return int return the capacidadeMaxima
     */
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    /**
     * @param capacidadeMaxima the capacidadeMaxima to set
     */
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    /**
     * @return int return the andarAtual
     */
    public int getAndarAtual() {
        return andarAtual;
    }

    /**
     * @param andarAtual the andarAtual to set
     */
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    /**
     * @return int return the totalAndares
     */
    public int getTotalAndares() {
        return totalAndares;
    }

    /**
     * @param totalAndares the totalAndares to set
     */
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    /**
     * @return int return the pessoasDentro
     */
    public int getPessoasDentro() {
        return pessoasDentro;
    }

    /**
     * @param pessoasDentro the pessoasDentro to set
     */
    public void setPessoasDentro(int pessoasDentro) {
        this.pessoasDentro = pessoasDentro;
    }

    /**
     * Inicializa: Deve receber parametros capcidade do Elevador e Total de andares no predio.
     */
    public String inicializa(int capacidadeMaxima, int totalAndares) {
    	if(this.getAndarAtual() == 0 && this.getPessoasDentro() == 0) {
    		return "Elevador inicializado:"+
    				" \ncom capacidade maximade de pessoas de : " +
    				capacidadeMaxima + " pessoas." +
    				" \ntotal de andares do predio: "+
    				totalAndares + " andadares.";
    	}
    	else {
    		return "Imposivel inicializar, ele ja esta ligado!" ;
    	}
    }
    
}

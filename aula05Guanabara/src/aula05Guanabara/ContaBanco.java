package aula05Guanabara;

public class ContaBanco {
	public int numConta;
	protected String tipoConta;
	private String dono;
	private float saldo;
	private boolean status;
	
	//Métodos personalizados
	public void estadoAtual () {
		System.out.println("-------------------------------");
		System.out.println("Conta:"+ this.mostraNumConta());
		System.out.println("Tipo:"+ this.mostraNumConta());
		System.out.println("Dono:"+ this.mostrarNomeDono());
		System.out.println("saldo:"+ this.mostrarSaldo());
		System.out.println("Status:"+ this.statusDono());
	}
	
	// Métodos Especiais - Construtor
	public void ContaBanco() {
		this.pegarSaldo(0);
		this.saberStatus(false);
	}
	
	// Métodos
	public void abrirConta (String t) {
		this.pegarTipoConta(t);
		this.saberStatus(true);
		if (t == "CC") {
			//this.saldo = 50;
			this.pegarSaldo(50);	
		}
		else {
			this.pegarSaldo(150);
			//this.saldo = 150;
		}
		System.out.println("Conta aberta com sucesso!");
	}
	public void fecharConta () {
		 if(this.mostrarSaldo() > 0) {
			 System.out.println("Conta nao pode ser fechada pois ainda esta com dinheiro");
		 }else if (this.mostrarSaldo() < 0){
			 System.out.println("Conta nao pode ser fehcada pois esta com débito");
		 }else {
			 this.saberStatus(false);
			 System.out.println("Conta fechada com sucesso!");
		 }
	}
	public void depositar (float v) {
		 if(this.statusDono()) {
			pegarSaldo(mostrarSaldo()+ v);
			System.out.println("Deposito realizado na conta de "+ this.mostrarNomeDono());
		 }
		 else {
			 System.out.println("Impossível depositar");
		 }
	}
	public void sacar(float v ) {
		 if (this.statusDono()) {
			 if (this.mostrarSaldo() >= - v) {
				 System.out.println("Saque realizado na conta de "+ this.mostrarNomeDono() );
			 }
			 else {
				 System.out.println("Saldo insuficiente para saque");
			 }
		 }
		 else {
			 System.out.println("Impossivel sacar de uma conta fechada!");
		 }
	}
	public void pagarMensal() {
		 int v;
		 if (this.mostrarTipoConta() =="CC") {
			v=12;
		 }else if (this.mostrarTipoConta() == "CP") {
			v =20;
		}
	}
	
	
	// Métodos modificadores..
	public void pegarNumConta (int n) {
		this.numConta = n;
	}
	public int mostraNumConta() {
		return this.numConta;
	}
	
	public void pegarTipoConta(String t) {
		this.tipoConta = t;
	}
	public String mostrarTipoConta() {
		return this.tipoConta;
	}
	
	public void pegarNomeDono(String d) {
		this.dono = d;
	}
	public String mostrarNomeDono () {
		return this.dono;
	}
	
	public void pegarSaldo(float s) {
		this.saldo = s;
	}
	public float mostrarSaldo() {
		return this.saldo;
	}
	
	public void saberStatus (boolean st) {
		this.status = st;
	}
	public boolean statusDono () {
		return this.status;
	}
}

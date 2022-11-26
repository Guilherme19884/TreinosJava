package Dispositvos;

public class Dispositvos {

	public static void main(String[] args) {
		//Dispositivo dispotivo = new Dispositivo ();não dá para instanciar quando a classe 
		// é abstrato
		Notebook notebook = new Notebook ();
		notebook.setMarca("Dell");
		notebook.setModelo("xps 13");
		notebook.setPeso(10);
		notebook.setVoltagemDoCarregador(110);
		
		System.out.println("O peso do Notebook e: " + notebook.getPeso());
	}

}

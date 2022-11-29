package ProjetoCapoeira;

public class Capoeira {

	public static void main(String[] args) {
		Capoeirista pernaBamba = new Capoeirista ();
		
		pernaBamba.setNome("Jorge");
		pernaBamba.setTempoDeCapoeiraEmAnos(5);
		
		System.out.println(pernaBamba.getNome() + " Tem o apelido na capoeira de perna "
				+ "bamba, tem o " +pernaBamba.getCordel() + " conseguiu se graduar apos "
				+ pernaBamba.getTempoDeCapoeiraEmAnos() + " ano");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(pernaBamba.getTempoDeCapoeiraEmAnos()+" anos de capoeira");
	
		
	}

}

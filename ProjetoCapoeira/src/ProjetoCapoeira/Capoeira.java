package ProjetoCapoeira;

public class Capoeira {

	public static void main(String[] args) {
		Capoeirista pernaBamba = new Capoeirista ();
		
		pernaBamba.setNome("Jorge");
		//pernaBamba.setCordel("verde");
		pernaBamba.setTempoDeCapoeiraEmAnos(1);
		
		System.out.println(pernaBamba.getNome() + " Tem o apelido na capoeira de perna "
				+ "bamba, tem o cordel " +pernaBamba.getCordel() + " conseguiu se graduar apos "
				+ pernaBamba.getTempoDeCapoeiraEmAnos() + " ano");
	}

}

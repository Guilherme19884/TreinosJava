package LojaBike;

public class Loja {

	public static void main(String[] args) {
		BikeRoad road = new BikeRoad();
		road.setCor("Vermelha");
		road.setFreioDisco(false);
		road.setMarca("Merida");
		road.setTamanho(50);
		road.setModelo("Road lite 901");
		
		BikeRoad road1 = new BikeRoad();
		road1.setCor("preta");
		road1.setFreioDisco(true);
		road1.setMarca("Cannodale");
		road1.setModelo("Super Six");
		road1.setTamanho(48);
		
		BikeRoad road2 = new BikeRoad();
		road2.setCor("vermelha");
		road2.setFreioDisco(true);
		road2.setMarca("Cervelo");
		road2.setModelo("S5");
		road2.setTamanho(49);
		
		
		
		System.out.println(road);
	}

}

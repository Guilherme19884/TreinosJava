package LojaBike;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaBike {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//instanciando bikes
		Bike b= new Bike("Merida", "Road", "Vermelha");
		Bike b1= new Bike("Scott", "Road", "Preta");
		Bike b2= new Bike("Cervelo", "Road", "Azul");
		
		//instanciando acessorios
		Acessorios acessorio1 = new Acessorios("Farol Tubarao","Lanterna quadrada Specialized"); 
		Acessorios acessorio2 = new Acessorios("Farol redondo","Lanterna fininha");
		Acessorios acessorio3 = new Acessorios("Farol triangulo","Lanterna redonda");
		
		
		ArrayList <Bike> bikes = new ArrayList<>();
		bikes.add(b);
		bikes.add(b1);
		bikes.add(b2);
		
		ArrayList <Acessorios> acessorios = new ArrayList<>();
		acessorios.add(acessorio1);
		acessorios.add(acessorio2);
		acessorios.add(acessorio3);
		
		b.setAcessorios(acessorios);
		
	
		
		sc.close();
	}

}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employe> list = new ArrayList<>();
		
		System.out.println("How many employes will be registered? ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Employe#"+ (i+1)+ ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			while(hasID(list,id)) {
				System.out.println("Id alread taken! Try again: ");
				 id = sc.nextInt();
			}
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employe emp = new Employe(id, name, salary);
			
			list.add(emp);
		}
		System.out.println();
		System.out.println("Enter the employe id that will have salary icrease : ");
		int idsalary = sc.nextInt();  
		
		Integer pos = position(list,idsalary);
		if (pos == null) {
			System.out.println("this id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employes: ");
		for(Employe emp :list) {
			System.out.println(emp);
		}
		
		sc.close();
	}

	
	public static Integer position (List <Employe> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasID (List <Employe> list, int id) {
		Employe emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
				return emp != null;
	}
	
}

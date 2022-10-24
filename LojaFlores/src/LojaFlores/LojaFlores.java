package LojaFlores;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaFlores {

	public static void main(String[] args) {
		
		Produto prod = new Produto("Rosa", "Vermelha", 2, 10, true, 12);
		
		prod.cadastrar();
	}
}

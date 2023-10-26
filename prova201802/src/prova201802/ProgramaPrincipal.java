package prova201802;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Biscoito b1;
		Negresco b2;
		String id;
		int tam = 0, total = 0;
		List<Object> l = new ArrayList<Object>();
		
		id = sc.next();
		b1 = new Biscoito(id);
		b1.cor = "azul";
		b1.preco = 5;
		id = sc.next();
		b2 = new Negresco(id);
		b2.cor = "rosa";
		b2.preco = 6;
		l.add(b1);
		l.add(b2);
		if((Utils.existe(l, b1) == true)) {
			System.out.println(b1);
		}
		
		tam = tamanhoArray(l);
		Biscoito y[] = new Biscoito[tam];
		y = transformaListEmArray(l);
		for (int i = 0 ; i < tam ; i++) {
			System.out.println(y[i]);
		}
		
		total = calculaValores(y,tam);
		System.out.println(total);
		
		
		sc.close();
	}
	
	
	public static int tamanhoArray(List<Object> k) {
		int cont = 0;
		for(int i = 0; i < k.size(); i++) {
			if(k.get(i) instanceof Biscoito) {
				cont ++;
			}
		}
		return cont;
	}
	
	
	public static Biscoito[] transformaListEmArray(List<Object> k) {
		int cont = 0;
		for(int i = 0; i < k.size(); i++) {
			if(k.get(i) instanceof Biscoito) {
				cont ++;
			}
		}
		Biscoito x[] = new Biscoito[cont];
		for(int i = 0; i < cont; i++) {
			if(k.get(i) instanceof Biscoito) {
				Biscoito b = (Biscoito) k.get(i);
				x[i] = b;
			}
		}
		
		return x;
	}
	
	public static int calculaValores(Biscoito []x, int tam) {
		int soma = 0;
		for (int i = 0 ; i < tam ; i++) {
			soma += x[i].preco; 
		}
		return soma;
		
	}
}

package br.edu.ifce.computacao.estrutura.arvorebinaria;

public class TesteArvoreBinaria {

	public static void main(String[] args) {

		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
		
		arvore.insereRaiz(30);
		
		arvore.insereEsquerda(20, arvore.getRaiz());
		
		arvore.insereDireita(40, arvore.getRaiz());
		
		arvore.insereEsquerda(15, arvore.getRaiz().getEsq());
		
		arvore.insereDireita(25, arvore.getRaiz().getEsq());
		
		arvore.insereDireita(44, arvore.getRaiz().getDir());
		
		arvore.insereEsquerda(33, arvore.getRaiz().getDir());
		
		System.out.println("Inter Fixado");
		arvore.imprimeInterFixado(arvore.getRaiz());
		System.out.println("\n");
		System.out.println("Pré Fixado");
		arvore.imprimePreFixado(arvore.getRaiz());
		System.out.println("\n");
		System.out.println("Pós Fixado");
		arvore.imprimePosFixado(arvore.getRaiz());
	}

}

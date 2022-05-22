package br.edu.ifce.computacao.estrutura.arvorebinaria;

public class ArvoreBinaria<T> {
	
	private No<T> raiz;
	
	public ArvoreBinaria() {
		raiz = null;
	}
	
	//operações principais
	
	public No<T> insereRaiz(T valor){
		if (raiz != null) {
			System.out.println("Nó raiz já existente. Elemento não inserido.");
			return null;
		}
		
		raiz = new No<T>(valor, null, null, null);
		return raiz;
	}
	
	public No<T> insereEsquerda(T valor, No<T> noBase){
		if(noBase == null) {
			System.out.println("Nó de referência inexistente. Elemento não inserido.");
			return null;
		}
		if(noBase.getEsq() != null) {
			System.out.println("Nó esquerda já existe. Elemento duplicado e não inserido.");
			return null;
		}
		
		No<T> novoNo = new No<T>(valor, noBase, null, null);
		noBase.setEsq(novoNo);
		return novoNo;
	}
	
public No<T> insereDireita(T valor, No<T> noBase){
		if(noBase == null) {
			System.out.println("Nó de referência inexistente. Elemento não inserido.");
			return null;
		}
		if(noBase.getDir() != null) {
			System.out.println("Nó direita já existe. Elemento duplicado e não inserido.");
			return null;
		}
		
		No<T> novoNo = new No<T>(valor, noBase, null, null);
		noBase.setDir(novoNo);
		return novoNo;
	}

	public void imprimePreFixado(No<T> noBase) {
		if(noBase != null) {
			System.out.print(noBase.getValor() + "\t");
			imprimePreFixado(noBase.getEsq());
			imprimePreFixado(noBase.getDir());
		}
	}
	
	public void imprimeInterFixado(No<T> noBase) {
		if(noBase != null) {
			imprimeInterFixado(noBase.getEsq());
			System.out.print(noBase.getValor() + "\t");
			imprimeInterFixado(noBase.getDir());
			
		}
	}
	
	public void imprimePosFixado(No<T> noBase) {
		if(noBase != null) {
			imprimePosFixado(noBase.getEsq());
			imprimePosFixado(noBase.getDir());
			System.out.print(noBase.getValor() + "\t");
		}
	}
	
	public No<T> getRaiz(){
		return raiz;
	}

}

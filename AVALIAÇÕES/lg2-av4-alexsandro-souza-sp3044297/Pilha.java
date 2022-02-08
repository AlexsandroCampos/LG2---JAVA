public class Pilha<T> implements InterfacePilha<T>{
  private T[] elementos;
  private int tamanho;

  public Pilha(int capacidade){
    elementos = (T[]) new Object[capacidade];
    tamanho = 0;
  }

  public void empilha(T elemento){
    if(tamanho == elementos.length){
      T[] elementosNovos = (T[]) new Object[elementos.length*2];
      for (int i = 0; i < tamanho; i++) {
        elementosNovos[i]=elementos[i];
      }
      elementos = elementosNovos;
    }

    for (int i = tamanho - 1; i >= 0; i--) {
      elementos[i+1] = elementos[i];
    }
    elementos[0] = elemento;
    tamanho++;

  }
  
  public T desempilha(){
    if(vazia())throw new RuntimeException("Pilha vazia");

    T elemento = elementos[0];

    for (int i = 0; i < tamanho - 1; i++) {
      elementos[i] = elementos[i+1];
    }
    tamanho--;
    elementos[tamanho] = null;

    return elemento;
  }

  public T topo(){
    if(vazia())throw new RuntimeException("Pilha vazia");

    return elementos[0];
  }

  public int tamanho(){
    return tamanho;
  }

  public boolean vazia(){
    return tamanho == 0;
  }

}
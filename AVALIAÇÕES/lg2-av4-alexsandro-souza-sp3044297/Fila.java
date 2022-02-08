public class Fila<T> implements InterfaceFila<T>{
  private T[] elementos;
  private int tamanho;

  public Fila(int capacidade){
    elementos = (T[]) new Object[capacidade];
    tamanho = 0;
  }

  public void enfileirar(T elemento){
    if(tamanho == elementos.length){
      T[] elementosNovos = (T[]) new Object[elementos.length*2];
      for (int i = 0; i < tamanho; i++) {
        elementosNovos[i]=elementos[i];
      }
      elementos = elementosNovos;
    }
    
    elementos[tamanho] = elemento;
    tamanho++;
  }

  public T desenfileirar(){ 
    if(vazia())throw new RuntimeException("Fila vazia");

    T elemento = elementos[0];
    
    for (int i = 0; i < tamanho - 1; i++) {
      elementos[i] = elementos[i+1];
    }
    tamanho--;
    elementos[tamanho] = null;

    return elemento;
  }

  public T primeiro(){
    if(vazia())throw new RuntimeException("Fila vazia");
    return elementos[0];
  }

  public int tamanho(){
    return tamanho;
  }

  public boolean vazia(){
    return tamanho == 0;
  }

     
}
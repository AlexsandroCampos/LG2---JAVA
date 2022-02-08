import java.util.Arrays;
public class VetorGenerico<T> implements VetorGenericoInterface<T>{
  private T[] elementos;
  private int tamanho;

  public VetorGenerico(int capacidade){
    elementos = (T[]) new Object[capacidade];
    tamanho = 0;
  }

  private void aumentarCapacidade(){
    if(tamanho == elementos.length){
      T[] elementosNovos = (T[]) new Object[elementos.length*2];
      for (int i = 0; i < tamanho; i++) {
        elementosNovos[i]=elementos[i];
      }
      elementos = elementosNovos;
    }
  }

  public void adicionar(T elemento){
    aumentarCapacidade();
    elementos[tamanho] = elemento;
    tamanho++;
  }
  public void adicionar(int posicao, T elemento){
    verificarPosicao(posicao);

    aumentarCapacidade();

    for (int i = tamanho - 1; i >= posicao; i--) {
      elementos[i+1] = elementos[i];
    }

    elementos[posicao] = elemento;
    tamanho++;

  }
  public void remover(int posicao){
    verificarPosicao(posicao);

    for (int i = posicao; i < tamanho - 1; i++) {
      elementos[i] = elementos[i+1];
    }

    tamanho--;

    elementos[tamanho] = null;
  }
  public T buscar(int posicao){
    verificarPosicao(posicao);

    return elementos[posicao];
  }
  public int buscar(T elemento){
    for (int i = 0; i < tamanho; i++) {
      if(elementos[i].equals(elemento)){
        return i;
      }
    }
    return -1;
  }
  public int tamanho(){
    return tamanho;
  }

  public String toString(){
    return Arrays.toString(elementos);
  }

  private void verificarPosicao(int posicao) {
    if(posicao < 0 || posicao >= tamanho){
      throw new RuntimeException("Argumento inválido");
    }
  }

  public boolean contem(T elemento){
    if(buscar(elemento)==-1){
      return false;
    }
    return true;
  }
}
public class VetorInt implements VetorIntInterface {
  private int[] elementos;
  private int tamanho;

  public VetorInt(int capacidade){
    this.elementos = new int[capacidade];
    this.tamanho = 0;
  }

  public void adicionar(int elemento){
    aumentarCapacidade();
    this.elementos[this.tamanho] = elemento;
    this.tamanho++;
  }

  public void adicionar(int posicao, int elemento){
    aumentarCapacidade();
    verificarPosicao(posicao);

    for(int i = this.tamanho-1; i >= posicao; i--){
      this.elementos[i+1] = this.elementos[i];
    }

    this.elementos[posicao] = elemento;
    this.tamanho++;

  }

  public void remover(int posicao){
    verificarPosicao(posicao);
    for(int i = posicao; i < tamanho-1; i++){
      this.elementos[i] = this.elementos[i+1];
    }
    this.tamanho--;
  }

  public int buscar(int posicao){
    verificarPosicao(posicao);
    return this.elementos[posicao];
  }

  public int buscarPosicaoElemento(int elemento){
    for(int i=0; i<this.tamanho; i++){
      if(this.elementos[i] == elemento){
        return i;
      }
    }
    return -1;
  }

  public int tamanho(){
    return this.tamanho;
  }

  public String toString(){
    String texto ="";
    for(int i =0; i<this.tamanho; i++){
      texto += elementos[i] + ", ";
    }
    return texto;
  }

  private void aumentarCapacidade(){
    if(this.tamanho == this.elementos.length){
      int[] elementosNovos = new int[this.elementos.length*2];
      for(int i = 0; i < this.elementos.length; i++){
        elementosNovos[i] = elementos[i];
      }
      this.elementos = elementosNovos;
    }
  }

  private void verificarPosicao(int posicao) {
    if(posicao < 0 || posicao >= tamanho){
      throw new RuntimeException("Argumento inválido");
    }
  }




}
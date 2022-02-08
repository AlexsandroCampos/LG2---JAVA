public class ListaEncadeada<T> implements ListaEncadeadaInterface<T> {
  private No<T> cabeca;
  private No<T> cauda;
  private int tamanho;

  public ListaEncadeada(){
    cabeca = null;
    cauda = null;
    tamanho = 0;
  }

  public No<T> getCabeca(){
    return cabeca;
  }

  public void setElemento(No<T> cabeca){
    this.cabeca = cabeca;
  }

  public int getTamanho(){
    return tamanho;
  }

  public void setTamanho(int tamanho){
    this.tamanho = tamanho;
  }

  public int tamanho(){
    return tamanho;
  }

  public boolean vazia(){
    return tamanho == 0;
  }

  public void adicionarInicio(T elemento){
    No<T> no = new No<T>(elemento, cabeca);
    cabeca = no;
    if(vazia()) cauda = cabeca;
    tamanho++;
  }

  public void adicionarFim(T elemento){
    No<T> no = new No<T>(elemento, null);
    if(vazia())
      cabeca = no;
    else
      cauda.setProximo(no);
    cauda = no;
    tamanho++;
  }

  public void removerInicio(){
    if(vazia()) throw new RuntimeException("Lista vazia");
    cabeca = cabeca.getProximo();
    tamanho--;
    if(vazia()) cauda = null;
  }

  public void removerFim(){
    if(vazia()) throw new RuntimeException("Lista vazia");
    No<T> ant = cabeca;
    for (int i = 1; i < tamanho-1; i++) {
      ant = ant.getProximo();
    }
    ant.setProximo(null);
    cauda = ant;
    tamanho--;
    if(vazia()){
      cabeca = null;
      cauda = null;
    }
  }

  public T primeiro(){
    if(vazia()) throw new RuntimeException("Lista vazia");
    return cabeca.getElemento();
  }

  public T ultimo(){
    if(vazia()) throw new RuntimeException("Lista vazia");
    return cauda.getElemento();
  }

  public T buscar(int posicao){
    if(vazia()) throw new RuntimeException("Lista vazia");
    if(posicao < 0 || posicao >= tamanho) throw new RuntimeException("Argumento inválido");
    No<T> proximo = cabeca;

    for (int i = 0; i < posicao; i++) {
      proximo = proximo.getProximo();
    }
    return proximo.getElemento();
    }   

  public void adicionar(int posicao, T elemento){
    if(vazia()) throw new RuntimeException("Lista vazia");
    if(posicao < 0 || posicao >= tamanho) throw new RuntimeException("Argumento inválido");
    No<T> proximo = cabeca;
    No<T> adicao = new No<T>(elemento, null);

    for (int i = 0; i < posicao-1; i++) {
      proximo = proximo.getProximo();
    }
    if(posicao == 0){
      adicao.setProximo(cabeca);
      cabeca = adicao;
    }
    else{
      adicao.setProximo(proximo.getProximo());
      proximo.setProximo(adicao);
    } 
    tamanho++;
    }
}
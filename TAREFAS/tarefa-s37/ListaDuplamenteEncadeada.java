public class ListaDuplamenteEncadeada<T> implements ListaDuplamenteEncadeadaInterface<T> {
  private NoDuplamente<T> cabeca;
  private NoDuplamente<T> cauda;
  private int tamanho;

  public ListaDuplamenteEncadeada(){
    cabeca = new NoDuplamente<T>(null, null, null);
    cauda = new NoDuplamente<T>(cabeca, null, null);
    cabeca.setProximo(cauda);
    tamanho = 0;
  }

  private void adicionarEntre(T elemento, NoDuplamente<T> anterior, NoDuplamente<T> proximo){
    NoDuplamente<T> no = new NoDuplamente<T>(anterior, elemento, proximo);
    anterior.setProximo(no);
    proximo.setAnterior(no);
    tamanho++;
  }

  public void adicionarInicio(T elemento){
    adicionarEntre(elemento, cabeca, cabeca.getProximo());
  }
  public void adicionarFim(T elemento){
    adicionarEntre(elemento, cauda.getAnterior(), cauda);
  }

  private void remover(NoDuplamente<T> no){
    NoDuplamente<T> anterior = no.getAnterior();
    NoDuplamente<T> proximo = no.getProximo();
    anterior.setProximo(proximo);
    proximo.setAnterior(anterior);
  }
  public void removerInicio(){
    if(vazia()) throw new RuntimeException("Lista vazia");
    remover(cabeca.getProximo());
  }
  public void removerFim(){
    if(vazia()) throw new RuntimeException("Lista vazia");
    remover(cauda.getAnterior());
  }
  public T primeiro(){
    if(vazia()) throw new RuntimeException("Lista vazia");
    return cabeca.getProximo().getElemento();
  }
  public T ultimo(){
    if(vazia()) throw new RuntimeException("Lista vazia");
    return cauda.getAnterior().getElemento();
  }
  public int tamanho(){
    return tamanho;
  }
  public boolean vazia(){
    return tamanho == 0;
  }
  public void adicionar(int posicao, T elemento){
    if(vazia()) throw new RuntimeException("Lista vazia");
    if(posicao < 0 || posicao >= tamanho) throw new RuntimeException("Argumento inválido");
    NoDuplamente<T> proximo = cabeca.getProximo();

    for (int i = 0; i < posicao; i++) {
      proximo = proximo.getProximo();
    }
    adicionarEntre(elemento, proximo.getAnterior(), proximo);

  }
  public T buscar(int posicao){
    if(vazia()) throw new RuntimeException("Lista vazia");
    if(posicao < 0 || posicao >= tamanho) throw new RuntimeException("Argumento inválido");
    NoDuplamente<T> proximo = cabeca.getProximo();

    for (int i = 0; i < posicao; i++) {
      proximo = proximo.getProximo();
    }
    return proximo.getElemento();

  }

    public NoDuplamente<T> getCabeca(){
    return cabeca;
  }

  public void setElemento(NoDuplamente<T> cabeca){
    this.cabeca = cabeca;
  }

  public int getTamanho(){
    return tamanho;
  }

  public void setTamanho(int tamanho){
    this.tamanho = tamanho;
  }

}
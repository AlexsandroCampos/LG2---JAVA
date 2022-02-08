public class NoDuplamente<T>{
  private NoDuplamente<T> anterior;
  private T elemento;
  private NoDuplamente<T> proximo;

  public NoDuplamente(NoDuplamente<T> anterior, T elemento, NoDuplamente<T> proximo){
    this.anterior = anterior;
    this.elemento = elemento;
    this.proximo = proximo;
  }

  public NoDuplamente<T> getAnterior(){
    return anterior;
  }

  public void setAnterior(NoDuplamente<T> anterior){
    this.anterior = anterior;
  }

  public T getElemento(){
    return elemento;
  }

  public void setElemento(T elemento){
    this.elemento = elemento;
  }

  public NoDuplamente<T> getProximo(){
    return proximo;
  }

  public void setProximo(NoDuplamente<T> proximo){
    this.proximo = proximo;
  }
}
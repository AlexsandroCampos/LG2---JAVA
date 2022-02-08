public interface InterfaceFila<T>{
  public void enfileirar(T elemento);
  public T desenfileirar();
  public T primeiro();
  public int tamanho();
  public boolean vazia();
}
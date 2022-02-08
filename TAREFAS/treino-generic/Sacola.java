import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Sacola<T>{
  private List<T> elementos;

  public Sacola(){
    this.elementos = new ArrayList<>();
  }

  public void adicionar(T elemento){
    this.elementos.add(elemento);
  }

  public boolean procurar(T elemento){
    for (int i = 0; i < elementos.size(); i++) {
      if(elementos.get(i).equals(elemento)){
        return true;
      }
    }
    return false;
  }

   public String toString(){
    return Arrays.toString(elementos);
  }
}
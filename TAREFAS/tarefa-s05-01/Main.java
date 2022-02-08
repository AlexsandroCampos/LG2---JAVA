class Main {
  public static void main(String[] args) {
    int[] numeros = {1, 4, 5, 7, 9, 11, 15};
    int numero = 15;
    String[] itens = {"Arroz","Feijão","Macarrão"};
    String item = "Feijão";
 
    System.out.println(buscaBinaria(numero, numeros));
    System.out.println(buscaBinaria(item,itens));
  }

  public static int buscaBinaria(int elemento, int[] elementos) {
    int inicio = 0;
    int fim = elementos.length - 1;
    int meio;

    while(inicio <= fim) {
      meio = (int) (inicio + fim) / 2;

      if(elemento == elementos[meio]) {
        return meio;
      } 
      else if(elemento > elementos[meio]) {
        inicio = meio + 1;
      } 
      else {
        fim = meio -1;
      }
    }

    return -1;
  }
  public static int buscaBinaria(String elemento, String[] elementos){
    int inicio = 0;
    int fim = elementos.length - 1;
    int meio;

    while(inicio <= fim) {
      meio = (int) (inicio + fim) / 2;

      if(elemento.compareTo(elementos[meio]) == 0) {
        return meio;
      } 
      else if(elemento.compareTo(elementos[meio]) > 0) {
        inicio = meio + 1;
      } 
      else {
        fim = meio - 1;
      }
    }
    
    return -1;
  }
}
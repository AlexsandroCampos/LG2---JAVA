class Main {
  public static void main(String[] args) {
    int[] numeros = {4, 7, 8, 2, 11, 3, 9, 1};
    int[] numerosOrdenados = Ordenacao.bubbleSort(numeros);
    int[] numerosOrdenados2= Ordenacao.insertionSort(numeros);

    System.out.println("Ordenação pelo bubble sort:");
    VetorUtil.imprimirVetor(numeros);
    VetorUtil.imprimirVetor(numerosOrdenados);

    System.out.println("Ordenação pelo insertion sort:");
    VetorUtil.imprimirVetor(numeros);
    VetorUtil.imprimirVetor(numerosOrdenados2);

  }
}
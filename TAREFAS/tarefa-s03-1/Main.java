import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com o número de elementos");
    int numeroElement = sc.nextInt();

    int[] elementos = new int[numeroElement];
    for (int i=0; i < numeroElement; i++) {
      System.out.println("Entre com o número " + (i+1));
      elementos[i] = sc.nextInt();
    }
    int maior = elementos[0];
    for (int i=0; i<numeroElement; i++) {
      if (elementos[i]>maior) {
        maior = elementos[i];
      }
    }
    int menor = elementos[0];
    for (int i=0; i<numeroElement; i++) {
      if (elementos[i]<menor) {
        menor = elementos[i];
      }
    }
    System.out.println("Maior número: "+ maior);
    System.out.println("Menor número: "+ menor);

    sc.close();
  }
}
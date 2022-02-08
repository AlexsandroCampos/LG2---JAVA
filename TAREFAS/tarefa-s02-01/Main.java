import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com o número de notas");
    int quantidadeNotas = sc.nextInt();

    float[] notas = new float[quantidadeNotas];
    for (int i = 0; i < quantidadeNotas; i++) {
      System.out.println("Entre com a nota " + (i+1));
      notas[i] = sc.nextFloat();
    }
    float media = 0;
    for (int i = 0; i < quantidadeNotas; i++){
     media = media + notas[i];
    }
    media = media/quantidadeNotas;
    System.out.println("Média: " + media);

    sc.close();
  }
}
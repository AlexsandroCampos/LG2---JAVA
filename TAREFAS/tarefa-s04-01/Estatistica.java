class Estatistica {
  public static double calcularMedia(double[] valores) {
    double soma = 0.0;
    for(double valor : valores) {
      soma += valor;
    }
    return soma / valores.length;
  }
  public static double maiorNota(double[] valores){
    double maior = valores[0];
    for (double valor: valores) {
      if (valor>maior) {
           maior = valor;
      }
    }
    return maior;
  }
  public static double menorNota(double[] valores){
    double menor = valores[0];
    for (double valor: valores) {
      if (valor<menor) {
           menor = valor;
      }
    }
     return menor;
  }
}
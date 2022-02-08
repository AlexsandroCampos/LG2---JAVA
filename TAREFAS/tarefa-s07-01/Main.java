class Main {
  public static void main(String[] args) { 
    
  }

  public static int somaRecursiva(int[] numeros, int n) {
    if (n==0){
      return 0;
    }
    return numeros[n-1] + somaRecursiva(numeros, n-1);
  }

  public static int somaIterativa(int[] numeros) {
    int resultado = 0;
    for (int i=0; i<numeros.length; i++) {
      resultado = resultado + numeros[i];
    }
    return resultado;
  }
}
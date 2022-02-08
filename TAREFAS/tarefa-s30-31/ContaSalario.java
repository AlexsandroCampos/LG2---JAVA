import java.time.LocalDate;

public class ContaSalario extends Conta{
  private Empresa empresa;

  public ContaSalario(int numero, LocalDate dataAbertura, double tarifa, Correntista correntista, Empresa empresa){
    super(numero, dataAbertura, tarifa, correntista);
    this.empresa = empresa;
  }

  public double calcularTarifa(){
    return 0.0;
  }

  public Empresa getEmpresa(){
    return this.empresa;
  }
}
import java.time.LocalDate;

public class ContaPoupanca extends Conta{
  private LocalDate aniversario;

  public ContaPoupanca(int numero, LocalDate dataAbertura, double tarifa, Correntista correntista, LocalDate aniversario){
    super(numero, dataAbertura, tarifa, correntista);
    this.aniversario = aniversario;
  }

  public double calcularTarifa(){
    return this.tarifa;
  }

  public LocalDate getAniversario(){
    return this.aniversario;
  }
}
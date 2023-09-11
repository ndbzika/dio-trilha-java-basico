public class Conta {
  private Integer numero;
  private String agencia;
  private String nomeCliente;
  private Double saldo;

  public Conta() {
  } 
  public Conta(Integer numero, String agencia, String nomeCliente, Double saldo) {
    this.numero = numero;
    this.agencia = agencia;
    this.nomeCliente = nomeCliente;
    this.saldo = saldo;
  }

  public Integer getNumero() {
    return numero;
  }

  public String getAgencia() {
    return agencia;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }
}

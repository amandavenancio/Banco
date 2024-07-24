public abstract class Conta implements IConta {

  private static int SEQUENCIAL = 1;
  private static final int AGENCIA_PADRAO = 0;
  // constante é uma classe estática e final
  // estática porque quero que tenha relação com a classe ContaCorrente e não com
  // a instância que está sendo criada porque se eu criar uma conta, sequencial
  // estará em 1, se criar duas contas, sequencial irá para 2 e assim por diante.

  protected int agencia;
  protected int numeroConta;
  protected double saldo;
  protected Cliente cliente;

  // não faz sentido que a agencia e numero da conta tenham o metodo set, pois
  // eles não devem ser reatribuídos;
  // faz sentido criar um construtor para atribuir o numero da conta e da agencia.
  // Pode deixar uma classe sendo abstrata porque não quer que ninguém instancie
  // ela. Nesse exemplo não faz sentido alguém fazer um new Conta() e não falar
  // qual tipo é (corrente ou poupança)

  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numeroConta = SEQUENCIAL++;
    this.cliente = cliente;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public void sacar(double valor) {
    saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }


  protected void imprimirInfosComuns() {
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Conta: %d", this.numeroConta));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }
}

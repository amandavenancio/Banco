public class Main {
  public static void main(String[] args) {
    
    Cliente amanda = new Cliente(); 
    amanda.setNome("Amanda");
    
    Conta cc = new ContaCorrente(amanda);
    Conta cPoupanca = new ContaPoupanca(amanda);

    cc.depositar(100);
    cc.transferir(100, cPoupanca);

    cc.imprimirExtrato();
    cPoupanca.imprimirExtrato();
  }
}

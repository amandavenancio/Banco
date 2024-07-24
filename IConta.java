public interface IConta {

  // interface é uma classe abstrata com todos os metodos abstratos. Uma classe que obriga a todos que a implementarem (extends) a implementar tudo que ela tem.
  // uma classe abstrata tem como caracteristica solicitar alguma implementação que ela sozinha não consegue resolver. 
  // não faz sentido colocar que os metodos são públicos, porque todo método da uma interface já é parametrizado como público.
    
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
  }
  
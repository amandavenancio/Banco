import java.util.List;

public class Banco {
// entidade são as coisas importantes dentro de um sistema e que são definidas como classes.
// absração do problema: trabalhar algo que é abstrato e transformar em um sistema modelado.
// encapsulamento: esconder as implementações dos objetos que não faz sentido ser exposta. Não é só get/set. 
// herança é importante, principalmente para reutilizar código. permite definir uma classe filha que herda, estende ou modifica o comportamento da classe pai. A classe cujo  membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada. 
// polimorfismo: capacidade de um objeto ser referenciado de várias formas, ou seja, de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Pode manipulçar o objeto de forma mais conveniente de acordo com o contexto. Não quer dizer que o objeto fica se transformando, pois um objeto nasce e morre do mesmo tipo, o que pode mudar é a maneira como nos referimos a ele.


//TO DO
// -Criar um método na classe Banco que liste todos os clientes. Dá para fazer porque a classe Banco tem as contas e as contas tem os clientes dentro. 
// - Incluir Lombok ao projeto para reduzir a verbosidade do código


  private String nome;
  private List<Cliente> clientes;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(List<Cliente> clientes) {
    this.clientes = clientes;
  }



}

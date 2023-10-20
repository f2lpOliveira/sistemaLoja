
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("Fellipe F Oliveira");
		cliente.setEndereco("Brasil, BR");
		cliente.dadosCliente();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCodigo(1);
		funcionario.setNome("Mais Antigo");
		funcionario.setEndereco("Aqui da Loja");
		funcionario.dadosFuncionario();

	}

}

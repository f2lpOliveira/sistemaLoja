
public class Funcionario {
	private int codigo;
	private String nome;
	private String endereco;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void dadosFuncionario() {
		System.out.println("Aqui estão os dados do Funcionário...");
		System.out.println("\n" + "Código: " + getCodigo());
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco() + "\n");
		
	}
	
}

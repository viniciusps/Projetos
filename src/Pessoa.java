public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private int salario;
	
	Pessoa[] arrayPessoa = new Pessoa[10];
	
	//arrayPessoa[1] = "vinicius";
	
	
	void insereDadosPessoa(int posicao, String nome, int idade, String cpf, int salario){
		for(int i=0;i<arrayPessoa.length;i++){
			if(i == posicao){
				Pessoa pes = new Pessoa();
				pes.setNome(nome);
				pes.setIdade(idade);
				pes.setCpf(cpf);
				pes.setSalario(salario);
				arrayPessoa[i] = pes;
			}
		}
		
	}
	
	void mostraDadosPessoa(int posicao){
		for(int i=0;i<arrayPessoa.length;i++){
			if(i == posicao){
				System.out.println("Nome: "+arrayPessoa[i].getNome());
				System.out.println("Idade: "+arrayPessoa[i].getIdade());
				System.out.println("cpf: "+arrayPessoa[i].getCpf());
				System.out.println("Salário: "+arrayPessoa[i].getSalario());
			}
		}
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}

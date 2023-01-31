
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("9999999999-1");
		nico.setSalario(2600);
		
		System.out.print("Nome do Funcionario - ");
		System.out.println(nico.getNome());
		System.out.print("Bonificacao do Funcionario - R$ ");
		System.out.println(nico.getBonificacao());				
		
	}

}

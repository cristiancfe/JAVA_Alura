
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do Editor de Video");
		return super.getBonificacao()+ 100.0;
		}

}

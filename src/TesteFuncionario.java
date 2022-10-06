
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario Rosana = new Funcionario();
		 Rosana.setNome("Rosana");
		 Rosana.setCpf("222.222.222-22");
		 Rosana.setSalario(1500);
		 
		 System.out.println(Rosana.getNome());
		 System.out.println(Rosana.bonificacao());
	}

}

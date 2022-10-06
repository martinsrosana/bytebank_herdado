
public class TesteGerenteSenior {
 public static void main(String[] args) {
	 GerenteSenior gerenteSenior = new GerenteSenior();
	 
	 gerenteSenior.setSetor ("Gerencia administrativa");
	 gerenteSenior.setSenha (2222);
	 gerenteSenior.setCpf ("444.444.444-44");
	 gerenteSenior.setMatricula("3333");
	 
	 System.out.println(gerenteSenior.getSetor());
	 System.out.println(gerenteSenior.getSenha());
	 System.out.println(gerenteSenior.getCpf());
	 System.out.println(gerenteSenior.getMatricula());
}
}

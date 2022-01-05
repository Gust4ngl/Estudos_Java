package testes;

public class AgendaTeste {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		agenda.addContatos("Vanitas", 4895561, 9987456);
		agenda.addContatos("Carlos", 948632154, 898756);

		System.out.println(agenda.exibirCtt());
	}

}

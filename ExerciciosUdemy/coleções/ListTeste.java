package coleções;

import java.util.ArrayList;

public class ListTeste {

	public static void main(String[] args) {
		ArrayList<Integer> idFuncionario = new ArrayList<>();
		
		idFuncionario.add(849812);
		idFuncionario.add(509897);
		idFuncionario.add(484651);
		idFuncionario.add(5038375);
		
		for (Integer integer : idFuncionario) {
			System.out.println(integer);//for feito para mostrar como é exibido os elementos em list
		}
	}
}

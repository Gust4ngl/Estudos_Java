package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num %2 == 0;
		Predicate<Integer> istresDigitos = num -> num >= 100 && num <= 99;
		
		System.out.println(isPar.or(istresDigitos).test(23));
		System.out.println(isPar.and(istresDigitos).test(989));
	}//psvm
	

}//public class

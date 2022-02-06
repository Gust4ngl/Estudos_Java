package br.com.Gusta.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

	private static final Memoria instancia = new Memoria();
	
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoAtual = "";
	private String textoBuffer = "";
	
	private Memoria() {
		
	}//construtor privado	
	
	public static Memoria getInstancia() {
		return instancia;
	}//getInstancia
	
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}//adicionarObserver

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}//getTextoAtual
	
	public void processarComando(String texto) {
		
		TipoComando tipoComando  = detectarTipoComando(texto);
		System.out.println(tipoComando);
		
		if(tipoComando == null) {
			return;
		} else if(tipoComando == TipoComando.ZERAR) {
			
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
			
		} else if(tipoComando == TipoComando.NUMERO 
				|| tipoComando == TipoComando.VIRGULA) {
			
			textoAtual = substituir ? texto : textoAtual + texto;
			substituir = false;
			
		} else {
			
			substituir = true;
			textoAtual = obterResulstadoOperacao();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
			
		}//if else
		
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	
	}//processarComando
	
	private String obterResulstadoOperacao() {
		
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}
		
		double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
		
		double resultado = 0;
		
		if(ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroBuffer + numeroAtual;
		} else if(ultimaOperacao == TipoComando.SUB) {
			resultado = numeroBuffer - numeroAtual;
		} else if(ultimaOperacao == TipoComando.MULT) {
			resultado = numeroBuffer * numeroAtual;
		} else if (ultimaOperacao == TipoComando.DIV) {
			resultado = numeroBuffer / numeroAtual;
		}
		
		String texto = Double.toString(resultado).replace(".", ",");
		boolean inteiro = texto.endsWith(",0");
		return inteiro ? texto.replace(",0", "") : texto;
		
	}

	private TipoComando detectarTipoComando(String texto) {
		
		if(textoAtual.isEmpty() && texto == "0") {
			return null;
		}//if
		
		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			// Quando não for número...
			if("AC".equals(texto)) {
				return TipoComando.ZERAR;
			} else if ("/".equals(texto)) {
				return TipoComando.DIV;
			} else if ("x".equals(texto)) {
				return TipoComando.MULT;
			} else if ("-".equals(texto)) {
				return TipoComando.SUB;
			}else if ("+".equals(texto)) {
				return TipoComando.SOMA;
			} else if ("=".equals(texto)) {
				return TipoComando.IGUAL;
			} else if (",".equals(texto) && !textoAtual.contains(",")) {
				return TipoComando.VIRGULA;
			}
			
		}//try catch
		
		return null;
		
	}//detectarTipoComando
	
	
}//class

package pOO;

import java.text.NumberFormat;

public class Ingresso {
	private float valorIngresso;
	private int numero;
	private String show;
	private String tipo;
	private String data;
	
	public Ingresso(float valorIngresso, int numero, String show, String tipo, String data) {
		this.valorIngresso = valorIngresso;
		this.numero = numero;
		this.show = show;
		this.tipo = tipo;
		this.data = data;
	}

	public float getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(float valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String formataValor() {
		NumberFormat fi = NumberFormat.getCurrencyInstance();
		
		fi.setMinimumFractionDigits(2);
		
		String valorIngressoFormatado = fi.format(valorIngresso);
		return valorIngressoFormatado;
	}
	
	public void visualizar() {
		System.out.println("Valor do ingresso: "+this.formataValor());
		System.out.println("Ingresso para o show do(a): "+this.show);
		System.out.println("Número do ingresso: "+this.numero);
		System.out.println("Tipo do ingresso: "+this.tipo);
		System.out.println("Data do show: "+this.data+"\n");
	}
}

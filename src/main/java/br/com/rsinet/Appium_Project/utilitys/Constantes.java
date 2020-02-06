package br.com.rsinet.Appium_Project.utilitys;

import java.util.Random;

public class Constantes {
	
	
	
	public static String getNome(int letras) {
		Random quantidadeDeLetras = new Random();
		int index;
		
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		String palavraRamdom = "";
		for(int i = 0; i <= letras - 1; i++) {
			index = quantidadeDeLetras.nextInt(caracteres.length());
			palavraRamdom += caracteres.substring(index, index+1);
		}
	return palavraRamdom;
	}

	public static String nome = "AXG9guZ";
	public static String email = "marcos@email.com";
	public static String senha = "123Aqwer";
	public static String ultimoNome = "Xavier";
	public static String telefone = "9876543210";
	public static String estado = "ES";
	public static String endereco = "Rua Sao Marcos, 221";
	public static String cidade = "Marrocos";
	public static String cep = "06246-040";
	
	public static String produto = "HP ELITEPAD 1000 G2 TABLET";
	public static String file = "src\\main\\java\\resources\\ArquivoExcel.xlsx";
	
	public static void main(String[] args) {
		System.out.println(getNome(7));
	}
}


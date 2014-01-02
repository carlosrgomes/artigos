package br.com.blog.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * 
 * @author carlosrgomes@gmail.com
 *
 */
public class LeituraArquivo {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//Instancia da classe scaner que recebe no seu construtor o arquivo a ser lido.
		Scanner scanner = new Scanner(new File("leitura.txt"));
		
		//verifica se existe a proxima linha
		while (scanner.hasNextLine()) {
			//Imprime a proxima linha
			System.out.println(scanner.nextLine());
		}
	}

}

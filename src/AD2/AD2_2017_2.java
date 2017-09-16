/**
 * @author Yuri Rodrigues
 * Matrícula: 15213050337
 * Polo: Duque de Caxias
 * Data: 15/09/2017
 *
 */

public class AD2_2017_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String filename = new String();
		
		filename = args[0]; // Captura o primeiro e unico argumento de entrada que é o nome do arquivo.

		Correios novo = new Correios(filename); // Cria a classe correios, com o nome do arquivo.
		novo.Result(); // Metodo para criar o arquivo res-<filename> com a solução;
	}

}

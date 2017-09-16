import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Correios {
	
	private HashMap<String, Integer> caminho; // Hashmap contendo como key o nome do caminho e quantas vezes foi utilizado;
	private String input_fname; // Nome do arquivo de entrada, para colocar no arquivo de saida;
	
	public Correios(String filename) {
		caminho = new HashMap<String, Integer>(); // Inicializa uma instancia vazia de HashMap
		this.input_fname = filename; // Captura o nome do arquivo com os dados;
		getCaminhos(filename); // Já cria todos os caminhos;
	}
	
	public void Result() {
		try {
			PrintWriter result_file = new PrintWriter("resp-" + this.input_fname, "UTF-8"); // Cria o arquivo com os resultado;
			for (String key : caminho.keySet()) // Itera sobre o Hashmap com os caminhos;
				if(caminho.get(key) > 1) // Se o caminho se reptiu mais de 1x, coloco ele como solução;
				result_file.println(key + "	-> " + caminho.get(key)); // Escreve no arquivo;
			
			result_file.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void Sort() {
		Comparator<Entry<String, Integer>> valueComparator = 
			    (e1, e2) -> e2.getValue().compareTo(e1.getValue()); // Cria instancia para comparar se o valor 2 > 1

			HashMap<String, Integer> sortedMap = // Cria um novo HashMap com os caminhos em ordem decrescente
			    this.caminho.entrySet().stream().
			    sorted(valueComparator).
			    collect(Collectors.toMap(Entry::getKey, Entry::getValue,
			                             (e1, e2) -> e1, LinkedHashMap::new));
			
			this.caminho = sortedMap; // Faz o HashMap caminho agora está com os valores na ordem esperada; 
	}
	
	protected void getCaminhos(String filename) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename)); // Le o arquivo de entrada
			String line = new String();
			String caminho_cidades = new String(); // buffer usado para montar os caminhos usados de A para B
			
			while((line = reader.readLine()) != null) {
				 String[] caminho_correio = line.split("/"); // Divide os caminhos no separador /
				 
				 for(int i = 0; i < caminho_correio.length - 1; ++i) {
					 caminho_cidades = caminho_correio[i] + "/" + caminho_correio[i+1]; // Cria o caminho de A para B; 
					 if(caminho.get(caminho_cidades) == null) // Se Caminho nao exister adiciona ele a 1 vez;
						 caminho.put(caminho_cidades, 1);
					 else // Se nao adiciona +1 na contagem;
						 caminho.put(caminho_cidades, caminho.get(caminho_cidades) + 1);
				 }
			}
			
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.Sort();
	}
}
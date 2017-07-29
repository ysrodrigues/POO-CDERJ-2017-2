/* Criado Por: Yuri Rodrigues
 * Matrícula: 15213050337
 * 
 */

public class AD1_2017_2 {
	
	public static void main(String[] args) {
		/* Questão a)

		Questao[] prova = new Questao[2];
		
		prova[0] = new Discursiva("Qual é o número da última versao de Java?", "8");
		
		ItemVerdadeiroFalso[] itens = new ItemVerdadeiroFalso[3];
		itens[0] = new ItemVerdadeiroFalso("Java foi lançado há mais de 20 anos atrás", true);
		itens[1] = new ItemVerdadeiroFalso("OO surgiu com a linguagem Java", false);
		itens[2] = new ItemVerdadeiroFalso("Eclipse é um editor de texto multilinguagem", true);
		
		prova[1] = new VerdadeiroFalso(itens);
		
		int num = 1;
		
		for(Questao q : prova) {
			System.out.print(num + ") ");
			System.out.println(q);
			
			num++;
		}
		
		*/
		
		// Questao d)
		Prova prova = new Prova(2);
		
		prova.criarQuestao("Qual é o número da última versao de Java?", "8");
		prova.criarQuestao("Java foi lançado há mais de 20 anos atrás", true);
		prova.criarQuestao("OO surgiu com a linguagem Java", false);
		prova.criarQuestao("Eclipse é um editor de texto multilinguagem", true);
		
		prova.imprimir();
	}
}

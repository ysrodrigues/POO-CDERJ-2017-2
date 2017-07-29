public class Prova {
	private Questao[] questoes;
	private int indexArrayQuestoes;
	private int indexVerdadeiroFalso;
	
	public Prova(int quantidadeDeQuestoes) {
		this.questoes = new Questao[quantidadeDeQuestoes];
		this.indexArrayQuestoes = 0;
		this.indexVerdadeiroFalso = -1;
	}
	
	public void criarQuestao (String enunciado, String gabarito) {
		this.questoes[this.indexArrayQuestoes] = new Discursiva(enunciado, gabarito);
		this.indexArrayQuestoes++;
	}
	
	public void criarQuestao(String enunciado, boolean gabarito) {
		
		/* Verifica se ja existe uma questão de Verdadeiro ou Falso.
		 * Caso não exista cria um questao verdadeiro ou falso e adiciona um item.
		 * Se não adiciona mais um item a questão criada;
		 */
		
		if(this.indexVerdadeiroFalso == -1) {
			this.questoes[this.indexArrayQuestoes] = new VerdadeiroFalso(enunciado, gabarito);
			this.indexVerdadeiroFalso = this.indexArrayQuestoes;
			this.indexArrayQuestoes++;
		} else {
			VerdadeiroFalso vf = (VerdadeiroFalso) this.questoes[this.indexVerdadeiroFalso];
			vf.adicionarItem(enunciado, gabarito);
			this.questoes[this.indexVerdadeiroFalso] = vf;
			
		}
	}
	
	//Questão c)
	public void imprimir() {
		int num = 1;
		
		for(Questao q : this.questoes) {
			System.out.print(num + ") ");
			System.out.println(q);
			
			num++;
		}
	}
}

class VerdadeiroFalso extends Questao {
	private ItemVerdadeiroFalso[] itens;
	
	// Variaveis e constantes usadas nas Questao b) em diante
	private int indexArrayItens;
	private final static int max_itens = 30;
	
	
	/* Questao a)
	 
	public VerdadeiroFalso(ItemVerdadeiroFalso[] _itens) {
		super("Assinale verdadeiro ou falso para os itens: ");
		this.itens = _itens;
	}
	
	private String getEnunItens() {
		String enunItens = new String();
		
		for (ItemVerdadeiroFalso item : this.itens) {
			enunItens +=  "( ) " + item.toString();
		}
		
		return enunItens;
	}
	
	*/
	
	// Questao b) em diante
	private String getEnunItens() {
		String enunItens = new String();
		
		for (int i = 0; i < indexArrayItens; ++i) {
			enunItens +=  "( ) " + this.itens[i].toString();
		}
		
		return enunItens;
	}

	public VerdadeiroFalso(String enunciado, boolean gabarito) {
		super("Assinale verdadeiro ou falso para os itens: ");
		this.itens = new ItemVerdadeiroFalso[VerdadeiroFalso.max_itens];
		this.indexArrayItens = 0;
		this.adicionarItem(enunciado, gabarito);
	}
	
	public void adicionarItem(String enunciado, boolean gabarito) {
		this.itens[this.indexArrayItens] = new ItemVerdadeiroFalso(enunciado, gabarito);
		this.indexArrayItens++;
	}
	
	// Não foi alterado durante as questões
	public String toString() {
		return this.getEnunciado() + "\n" + this.getEnunItens();
	}

}

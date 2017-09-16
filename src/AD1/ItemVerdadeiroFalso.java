class ItemVerdadeiroFalso extends Questao {
	private boolean gabarito;
	
	
	public ItemVerdadeiroFalso(String enunciado, boolean gabarito) {
		super(enunciado);
		this.gabarito = gabarito;
	}
	
	public boolean getGabarito() {
		return this.gabarito;
	}
	
	public String toString() {
		return this.getEnunciado() + "\n";
	}

}

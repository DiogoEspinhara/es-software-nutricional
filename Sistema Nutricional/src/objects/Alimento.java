package objects;

public class Alimento {
	private int codigo;
	private String nome;
	private double valCal;
	private double carbo;
	private double gordura;
	private double proteina;
	private double restricao;
	private double porcao;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValCal() {
		return valCal;
	}
	public void setValCal(double valCal) {
		this.valCal = valCal;
	}
	public double getCarbo() {
		return carbo;
	}
	public void setCarbo(double carbo) {
		this.carbo = carbo;
	}
	public double getGordura() {
		return gordura;
	}
	public void setGordura(double gordura) {
		this.gordura = gordura;
	}
	public double getProteina() {
		return proteina;
	}
	public void setProteina(double proteina) {
		this.proteina = proteina;
	}
	public double getRestricao() {
		return restricao;
	}
	public void setRestricao(double restricao) {
		this.restricao = restricao;
	}
	public double getPorcao() {
		return porcao;
	}
	public void setPorcao(double porcao) {
		this.porcao = porcao;
	}

}

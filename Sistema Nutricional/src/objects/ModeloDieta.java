package objects;

public class ModeloDieta {
	private int codigo;
	private Dieta dieta;
	private String descricao;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Dieta getDieta() {
		return dieta;
	}
	public void setDieta(Dieta dieta) {
		this.dieta = dieta;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

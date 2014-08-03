package objects;

import java.sql.Date;

public class Dieta {
	private int codigo;
	private Paciente paciente;
	private Refeicao opcao1;
	private Refeicao opcao2;
	private Refeicao opcao3;
	private Date data;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Refeicao getOpcao1() {
		return opcao1;
	}
	public void setOpcao1(Refeicao opcao1) {
		this.opcao1 = opcao1;
	}
	public Refeicao getOpcao2() {
		return opcao2;
	}
	public void setOpcao2(Refeicao opcao2) {
		this.opcao2 = opcao2;
	}
	public Refeicao getOpcao3() {
		return opcao3;
	}
	public void setOpcao3(Refeicao opcao3) {
		this.opcao3 = opcao3;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}

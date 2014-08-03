package objects;

import java.sql.Date;

public class Anamnese {
	private int codigo;
	private Paciente paciente;
	private boolean doenca;
	private String listaDoencas;
	private boolean tratamentoMedico;
	private boolean gravidez;
	private boolean medicamentos;
	private String listaMedicamentos;
	private boolean alergia;
	private String listaAlergias;
	private boolean operado;
	private String listaOperacoes;
	private boolean problemaCicatrizacao;
	private boolean problemaAnestesia;
	private boolean problemaHemorragia;
	private boolean febreReumatica;
	private boolean problemasCardiacos;
	private boolean problemasRenais;
	private boolean problemasGrasticos;
	private boolean problemasRespiratorios;
	private boolean problemasAlergicos;
	private boolean problemasArticulares;
	private boolean diabetes;
	private boolean hipertensaoArterial;
	private double pressaoArterial;
	private String listaHabitos;
	private String antecedentesFamiliares;
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
	public boolean isDoenca() {
		return doenca;
	}
	public void setDoenca(boolean doenca) {
		this.doenca = doenca;
	}
	public String getListaDoencas() {
		return listaDoencas;
	}
	public void setListaDoencas(String listaDoencas) {
		this.listaDoencas = listaDoencas;
	}
	public boolean isTratamentoMedico() {
		return tratamentoMedico;
	}
	public void setTratamentoMedico(boolean tratamentoMedico) {
		this.tratamentoMedico = tratamentoMedico;
	}
	public boolean isGravidez() {
		return gravidez;
	}
	public void setGravidez(boolean gravidez) {
		this.gravidez = gravidez;
	}
	public boolean isMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(boolean medicamentos) {
		this.medicamentos = medicamentos;
	}
	public String getListaMedicamentos() {
		return listaMedicamentos;
	}
	public void setListaMedicamentos(String listaMedicamentos) {
		this.listaMedicamentos = listaMedicamentos;
	}
	public boolean isAlergia() {
		return alergia;
	}
	public void setAlergia(boolean alergia) {
		this.alergia = alergia;
	}
	public String getListaAlergias() {
		return listaAlergias;
	}
	public void setListaAlergias(String listaAlergias) {
		this.listaAlergias = listaAlergias;
	}
	public boolean isOperado() {
		return operado;
	}
	public void setOperado(boolean operado) {
		this.operado = operado;
	}
	public String getListaOperacoes() {
		return listaOperacoes;
	}
	public void setListaOperacoes(String listaOperacoes) {
		this.listaOperacoes = listaOperacoes;
	}
	public boolean isProblemaCicatrizacao() {
		return problemaCicatrizacao;
	}
	public void setProblemaCicatrizacao(boolean problemaCicatrizacao) {
		this.problemaCicatrizacao = problemaCicatrizacao;
	}
	public boolean isProblemaAnestesia() {
		return problemaAnestesia;
	}
	public void setProblemaAnestesia(boolean problemaAnestesia) {
		this.problemaAnestesia = problemaAnestesia;
	}
	public boolean isProblemaHemorragia() {
		return problemaHemorragia;
	}
	public void setProblemaHemorragia(boolean problemaHemorragia) {
		this.problemaHemorragia = problemaHemorragia;
	}
	public boolean isFebreReumatica() {
		return febreReumatica;
	}
	public void setFebreReumatica(boolean febreReumatica) {
		this.febreReumatica = febreReumatica;
	}
	public boolean isProblemasCardiacos() {
		return problemasCardiacos;
	}
	public void setProblemasCardiacos(boolean problemasCardiacos) {
		this.problemasCardiacos = problemasCardiacos;
	}
	public boolean isProblemasRenais() {
		return problemasRenais;
	}
	public void setProblemasRenais(boolean problemasRenais) {
		this.problemasRenais = problemasRenais;
	}
	public boolean isProblemasGrasticos() {
		return problemasGrasticos;
	}
	public void setProblemasGrasticos(boolean problemasGrasticos) {
		this.problemasGrasticos = problemasGrasticos;
	}
	public boolean isProblemasRespiratorios() {
		return problemasRespiratorios;
	}
	public void setProblemasRespiratorios(boolean problemasRespiratorios) {
		this.problemasRespiratorios = problemasRespiratorios;
	}
	public boolean isProblemasAlergicos() {
		return problemasAlergicos;
	}
	public void setProblemasAlergicos(boolean problemasAlergicos) {
		this.problemasAlergicos = problemasAlergicos;
	}
	public boolean isProblemasArticulares() {
		return problemasArticulares;
	}
	public void setProblemasArticulares(boolean problemasArticulares) {
		this.problemasArticulares = problemasArticulares;
	}
	public boolean isDiabetes() {
		return diabetes;
	}
	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}
	public boolean isHipertensaoArterial() {
		return hipertensaoArterial;
	}
	public void setHipertensaoArterial(boolean hipertensaoArterial) {
		this.hipertensaoArterial = hipertensaoArterial;
	}
	public double getPressaoArterial() {
		return pressaoArterial;
	}
	public void setPressaoArterial(double pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}
	public String getListaHabitos() {
		return listaHabitos;
	}
	public void setListaHabitos(String listaHabitos) {
		this.listaHabitos = listaHabitos;
	}
	public String getAntecedentesFamiliares() {
		return antecedentesFamiliares;
	}
	public void setAntecedentesFamiliares(String antecedentesFamiliares) {
		this.antecedentesFamiliares = antecedentesFamiliares;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

}

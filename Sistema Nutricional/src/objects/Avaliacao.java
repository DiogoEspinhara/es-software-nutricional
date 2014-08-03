package objects;

import java.sql.Date;

public class Avaliacao {
	private int codigo;
	private Paciente paciente;
	private int protocolo;
	private double estatura;
	private double pesoAtual;
	private double pesoUsual;
	private double circunferenciaBraco;
	private double circunferenciaMuscularBraco;
	private double circunferenciaAbdomen;
	private double circunferenciaCintura;
	private double circunferenciaQuadril;
	private double pcTriciptal;
	private double pcSubescap;
	private double pcAxilarMedia;
	private double pcSupralliaca;
	private double pcPeitoral;
	private double pcCoxa;
	private double pcBiceps;
	private double pcPanturrilha;
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
	public int getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(int protocolo) {
		this.protocolo = protocolo;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public double getPesoAtual() {
		return pesoAtual;
	}
	public void setPesoAtual(double pesoAtual) {
		this.pesoAtual = pesoAtual;
	}
	public double getPesoUsual() {
		return pesoUsual;
	}
	public void setPesoUsual(double pesoUsual) {
		this.pesoUsual = pesoUsual;
	}
	public double getCircunferenciaBraco() {
		return circunferenciaBraco;
	}
	public void setCircunferenciaBraco(double circunferenciaBraco) {
		this.circunferenciaBraco = circunferenciaBraco;
	}
	public double getCircunferenciaMuscularBraco() {
		return circunferenciaMuscularBraco;
	}
	public void setCircunferenciaMuscularBraco(double circunferenciaMuscularBraco) {
		this.circunferenciaMuscularBraco = circunferenciaMuscularBraco;
	}
	public double getCircunferenciaAbdomen() {
		return circunferenciaAbdomen;
	}
	public void setCircunferenciaAbdomen(double circunferenciaAbdomen) {
		this.circunferenciaAbdomen = circunferenciaAbdomen;
	}
	public double getCircunferenciaCintura() {
		return circunferenciaCintura;
	}
	public void setCircunferenciaCintura(double circunferenciaCintura) {
		this.circunferenciaCintura = circunferenciaCintura;
	}
	public double getCircunferenciaQuadril() {
		return circunferenciaQuadril;
	}
	public void setCircunferenciaQuadril(double circunferenciaQuadril) {
		this.circunferenciaQuadril = circunferenciaQuadril;
	}
	public double getPcTriciptal() {
		return pcTriciptal;
	}
	public void setPcTriciptal(double pcTriciptal) {
		this.pcTriciptal = pcTriciptal;
	}
	public double getPcSubescap() {
		return pcSubescap;
	}
	public void setPcSubescap(double pcSubescap) {
		this.pcSubescap = pcSubescap;
	}
	public double getPcAxilarMedia() {
		return pcAxilarMedia;
	}
	public void setPcAxilarMedia(double pcAxilarMedia) {
		this.pcAxilarMedia = pcAxilarMedia;
	}
	public double getPcSupralliaca() {
		return pcSupralliaca;
	}
	public void setPcSupralliaca(double pcSupralliaca) {
		this.pcSupralliaca = pcSupralliaca;
	}
	public double getPcPeitoral() {
		return pcPeitoral;
	}
	public void setPcPeitoral(double pcPeitoral) {
		this.pcPeitoral = pcPeitoral;
	}
	public double getPcCoxa() {
		return pcCoxa;
	}
	public void setPcCoxa(double pcCoxa) {
		this.pcCoxa = pcCoxa;
	}
	public double getPcBiceps() {
		return pcBiceps;
	}
	public void setPcBiceps(double pcBiceps) {
		this.pcBiceps = pcBiceps;
	}
	public double getPcPanturrilha() {
		return pcPanturrilha;
	}
	public void setPcPanturrilha(double pcPanturrilha) {
		this.pcPanturrilha = pcPanturrilha;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

}

package objects;

public class Protocolo {
	private Avaliacao avaliacao;
	
	
	private double pollockTresDobras(){
		double valor = avaliacao.getPcTriciptal()+avaliacao.getPcSupralliaca()+avaliacao.getPcCoxa();
		double dobras = 0;
		double densidade;
		if(avaliacao.getPaciente().getSexo().equals("Feminino")){
			densidade = (1.0994921 - (0.0009929 * 3*dobras)+(0.0000023 * (3*dobras)*2 - (0.0001393 * avaliacao.getPaciente().getIdade())));
		} else {
			densidade = (1.112 - (0.00043499 * 7 *dobras)+(0.00000055 * (3 * dobras)*2 - (0.00012882 * avaliacao.getPaciente().getIdade())));
		}
		return (4.95/densidade) - 4.5*100;
	}
	

}

import java.util.Random;

public class GeradorDeProcessos {

	public int QtdInstruçõesMin = 10;
	public int QtdInstruçõesMax = 50;

	public GeradorDeProcessos(int qtdProcessos) {

		for (int i = 0; i < qtdProcessos; i++) {
			System.out.println("Processo " + (i + 1));

			Random random = new Random();
			int QtdInstruções = random.nextInt((QtdInstruçõesMax - QtdInstruçõesMin) + 1) + QtdInstruçõesMin;

			Processo novoProcesso = new Processo(QtdInstruções);
		}

	}

}

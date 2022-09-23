
public class Processo {

	private int id;
	private int qtdInstruções;

	public Processo(int quantidadeInstruções) {
		this.qtdInstruções = quantidadeInstruções;

		while (qtdInstruções != 0) {
			this.id += 1;
			System.out.println("Instrução realizada [Id " + id + "]");
			qtdInstruções -= 1;

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

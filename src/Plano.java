public class Plano {

	private int plano;
	private double valorPlano;

	private final static double PLANO_FAMILIA = 130;
	private final static double PLANO_UNIVERSITARIO = 40;
	private final static double PLANO_PADRAO = 60;
	private final static double PLANO_NATACAO = 100;
	private final static double PLANO_LUTA = 80;

	public Plano() {
		this.plano = 0;
		this.valorPlano = 0.0;
	}
	
	public int getPlano() {
		return plano;
	}

	public void setPlano(int plano) {
		this.plano = plano;
	}

	public double getValorPlano() {
		return valorPlano;
	}
	public void setValorPlano(int plano) {
		this.valorPlano = Invoker_Plano.invoke(Integer.toString(plano));
	}
        
	public String nomePlano(int plano) {
		return Invoker_Plano2.invoke(Integer.toString(plano));
	}
} 

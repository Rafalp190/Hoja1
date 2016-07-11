
public class RadioCarro implements Radio {
	private boolean estado;
	private boolean frecuencia;
	private double emisora;
	private double[] botones;
	

	
	
	public RadioCarro() {
		super();
		botones= new double[12];
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setEncendido(boolean estado) {
	    /**
        Metodo de encendido
        @param estado, define el estado de apagado/encendido
        True -> encendido
        False -> apagado
     */
		if (estado==true)
			this.estado=false;
		else
			this.estado=true;
	}

	@Override
	public void setFrecuencia(boolean frecuencia) {
	    /**
        Metodo de cambio de frecuencia
        @param frecuencia, define el estado de AM/FM
        True -> FM
        False -> AM
     */
		if (frecuencia==true)
			this.frecuencia=false;
		else
			this.frecuencia=true;
	}

	@Override
	public void setEmisora(double emisora) {
		// TODO Auto-generated method stub
		this.emisora=emisora;
		
	}

	@Override
	public void saveEmisora(int btn, double emisora) {
		// TODO Auto-generated method stub
		botones[(btn-1)] = emisora;
		}
		
	@Override
	public double selectEmisora(int btn) {
		double selEmisora = botones[(btn-1)];
		return selEmisora;
	}

	@Override
	public boolean getEncendido() {
		// TODO Auto-generated method stub
		return estado;
	}

	@Override
	public boolean getFrecuencia() {
		// TODO Auto-generated method stub
		return frecuencia;
	}

	@Override
	public double getEmisora() {
		// TODO Auto-generated method stub
		return emisora;
	}

}

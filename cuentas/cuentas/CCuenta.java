package cuentas;
/**
 * Esta clase permite crear un objeto de tipo CCuenta
 * @author Angel
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor sin parámetros, para la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros, para la clase CCuenta
     * @param nom nombre del propietario de la cuenta
     * @param cue numero de la cuenta
     * @param sal saldo actual de la cuenta
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    /**
     * método que devuelve el nombre de la persona dueña de la cuenta
     * @return nombre
     */
    public String getNombre() {
		return nombre;
	}
    /**
     * método que cambia el atributo nombre de CCuenta
     * @param nombre
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * método que retorna el número de cuenta
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * método que cambia el número de la cuenta
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * método que retorna el saldo actual
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * método que actualiza el saldo actual
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * metodo que obtiene el tipo de interes
	 * @return tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * método que actualiza el tipo de interes
	 * @param tipoInteres
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	/**
	 * metodo que retorna el saldo
	 * @return saldo
	 */
	public double estado()
    {
        return saldo;
    }

	/**
	 * método que permite ingresar una cantidad a la cuenta
	 * @param cantidad
	 * @throws Exception
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * método que permite retirar una cantidad de la cuenta
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

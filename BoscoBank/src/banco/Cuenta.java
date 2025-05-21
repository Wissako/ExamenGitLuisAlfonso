package banco;

import java.io.Serializable;

/**
 *
 * @author Luis
 */
public class Cuenta implements Serializable, operable{

    public String iban;
    public String titular;
    public double saldo;
    public String dni;

    public Cuenta(String iban, String titular, String dni) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.dni = dni;
    }

    public Cuenta() {
        this.iban = "";
        this.titular = "";
        this.saldo = 0;
        this.dni = "";
    }

    @Override
	public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    @Override
	public void retirar(double cantidad) {
        this.saldo -= cantidad;
    }

    @Override
    public String toString() {       
        return String.format("%-24s %-30s %9s %10.2f", this.iban, this.titular, this.dni, this.saldo);
    }

}

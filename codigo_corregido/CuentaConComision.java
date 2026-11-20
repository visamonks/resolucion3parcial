public class CuentaConComision extends Cuenta {
    private static final double COMISION = 5;

    public CuentaConComision(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0");
        }
        super.retirar(monto + COMISION);
    }
}

public class CuentaConComision extends Cuenta {
    public CuentaConComision(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > 0) {
            if (saldo > monto + 5) {
                super.retirar(monto);
                super.retirar(5);
                return saldo;
            } else {
                SaldoInsuficienteException();
                return SaldoInsuficienteException;
            }
        } else {
            throw IllegalArgumentException;
        }
    }
}

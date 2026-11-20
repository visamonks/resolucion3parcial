public class Main {
    public static void main(String[] args) {
        probarRetiro(new CuentaConComision(30), 28);
        probarRetiro(new CuentaConComision(30), -10);
        probarRetiro(new CuentaConComision(30), 20);
    }

    private static void probarRetiro(Cuenta cuenta, double monto) {
        System.out.println("Retiro de Q" + monto);
        try {
            cuenta.retirar(monto);
            System.out.println("Aceptado");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Rechazado: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Rechazado: " + e.getMessage());
        } finally {
            System.out.println("Saldo: " + cuenta.getSaldo());
            System.out.println();
        }
    }
}

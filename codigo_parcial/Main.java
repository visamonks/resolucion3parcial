public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaConComision(30);
        try {
            cuenta.retirar(28);
            System.out.println("Aceptado");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Rechazado por falta de saldo");
        } catch (IllegalArgumentException e) {
            System.out.println("Ingresa un monto positivo o mayor a 0");
        } finally {
            System.out.println("Saldo: " + cuenta.getSaldo());
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

        // Ejemplo de uso de la clase CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria(1000, 0.02); // Saldo inicial y tasa de interés mensual
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.aplicarInteres();
        System.out.println("Saldo después de aplicar interés: " + cuenta.getSaldo());
    }
}

class CuentaBancaria {
    private double saldo;
    private double tasaDeInteresMensual;

    public CuentaBancaria(double saldo, double tasaDeInteresMensual) {
        this.saldo = saldo;
        this.tasaDeInteresMensual = tasaDeInteresMensual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void aplicarInteres() {
        saldo = saldo * (1 + tasaDeInteresMensual);
    }
}
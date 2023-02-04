package cuentas.clientes;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta();
    }

    private static void operativa_cuenta() {
        Cuenta cuenta1;
        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual de " + cuenta1.getNombre() + " es de " + cuenta1.getSaldo() + " euros");

        try {
            System.out.println("\n***** Realizando una retirada de dinero en la cuenta *****");
            cuenta1.retirar(2300);
            System.out.println("El nuevo saldo es de " + cuenta1.getSaldo() + " euros");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("\n***** Realizando un ingreso en la cuenta *****");
            cuenta1.ingresar(695);
            System.out.println("El nuevo saldo es de "+ cuenta1.getSaldo() + " euros");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        String direccion;
        String telefono;


        double consignar;
        double retirar;
        double extraccion, rapido;
        double agregar;
        int op;
        double saldo;


        System.out.println("NOMBRE COMPLETO");

            nombre = teclado.next();




        System.out.println("DIRECCION");

            direccion = teclado.next();

        System.out.println("TELEFONO");

            telefono = teclado.next();


        System.out.println("SALDO");

            saldo = teclado.nextDouble();


        System.out.println("""
                    1. CONSIGNAR
                    2. RETIRAR
                    3. EXTRACION RAPIDA (20%)
                    4. CONSULTAR SALDO
                    5. SALIR
                    """
        );
        System.out.println("INGRESE  LA OPCION");
        op = teclado.nextInt();
        switch (op) {
            case 1:
                System.out.println("CONSIGNAR");
                agregar = teclado.nextDouble();
                teclado.nextLine();
                consignar = saldo + agregar;
                System.out.println("NUEVO SALDO " + consignar);
                break;

            case 2:
                System.out.println("RETIRAR");
                extraccion = teclado.nextInt();
                teclado.hasNextInt();
                retirar = saldo-extraccion;
                System.out.println("NUEVO SALDO: " + retirar);
                break;

            case 3:
                System.out.println("EXTRACION RAPIDA");
                rapido = saldo * 0.2;
                System.out.println("NUEVO SALDO: " + rapido);
                break;





        }














    }
}
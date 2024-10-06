import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("***************************************************************************");
        System.out.println("    Bienvenido/a al Conversor de monedas de Guido Alfredo Albarracín.");
        System.out.println("***************************************************************************");
        System.out.println("\nEstas son las monedas disponibles para convertir. Seleccione una opción: ");
        System.out.println("1. [ARS] a [USD]");
        System.out.println("2. [USD] a [ARS]");
        System.out.println("3. [BOB] a [USD]");
        System.out.println("4. [USD] a [BOB]");
        System.out.println("5. [BRL] a [USD]");
        System.out.println("6. [USD] a [BRL]");
        System.out.println("7. [CLP] a [USD]");
        System.out.println("8. [USD] a [CLP]");
        System.out.println("9. [COP] a [USD]");
        System.out.println("10. [USD] a [COP]");
        System.out.println("11. salir");
        System.out.println("\n*****************************************************************************");

        try {
            System.out.println("Escriba una opción: ");
            Scanner lectura = new Scanner(System.in);
            int opcion = Integer.valueOf(lectura.nextLine());
            while (opcion >= 1 & opcion < 11) {
                    ConsultaMoneda consulta = new ConsultaMoneda();
                    //var divisaBase = opcion.nextLine();
                    System.out.println("\nIngresa el valor que deseas convertir: ");
                    Scanner lecturaMonto = new Scanner(System.in);
                    var montoConvertir = lecturaMonto.nextLine();
                    var importeFinal = 0.0;

                    switch (opcion) {
                        case 1:
                            Moneda moneda = consulta.convierteMoneda("ARS", "USD");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[ARS]" + " convertidos a " + "[USD]" + " ==> "
                                    + importeFinal + "[USD]");
                            break;
                        case 2:
                            moneda = consulta.convierteMoneda("USD", "ARS");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[USD]" + " convertidos a " + "[ARS]" + " ==> "
                                    + importeFinal + "[ARS]");
                            break;
                        case 3:
                            moneda = consulta.convierteMoneda("BOB", "USD");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[BOB]" + " convertidos a " + "[USD]" + " ==> "
                                    + importeFinal + "[USD]");
                            break;
                        case 4:
                            moneda = consulta.convierteMoneda("USD", "BOB");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[USD]" + " convertidos a " + "[BOB]" + " ==> "
                                    + importeFinal + "[BOB]");
                            break;
                        case 5:
                            moneda = consulta.convierteMoneda("BRL", "USD");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[BRL]" + " convertidos a " + "[USD]" + " ==> "
                                    + importeFinal + "[USD]");
                            break;
                        case 6:
                            moneda = consulta.convierteMoneda("USD", "BRL");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[USD]" + " convertidos a " + "[BRL]" + " ==> "
                                    + importeFinal + "[BRL]");
                            break;
                        case 7:
                            moneda = consulta.convierteMoneda("CLP", "USD");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[CLP]" + " convertidos a " + "[USD]" + " ==> "
                                    + importeFinal + "[USD]");
                            break;
                        case 8:
                            moneda = consulta.convierteMoneda("USD", "CLP");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[USD]" + " convertidos a " + "[CLP]" + " ==> "
                                    + importeFinal + "[CLP]");
                            break;
                        case 9:
                            moneda = consulta.convierteMoneda("COP", "USD");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[COP]" + " convertidos a " + "[USD]" + " ==> "
                                    + importeFinal + "[USD]");
                            break;
                        case 10:
                            moneda = consulta.convierteMoneda("USD", "COP");
                            importeFinal = Double.valueOf(montoConvertir) * moneda.conversion_rate();
                            System.out.println(montoConvertir + "[USD]" + " convertidos a " + "[COP]" + " ==> "
                                    + importeFinal + "[COP]");
                            break;
                    }
                System.out.println("\nEstas son las monedas disponibles para convertir. Seleccione una opción: ");
                System.out.println("1. [ARS] a [USD]");
                System.out.println("2. [USD] a [ARS]");
                System.out.println("3. [BOB] a [USD]");
                System.out.println("4. [USD] a [BOB]");
                System.out.println("5. [BRL] a [USD]");
                System.out.println("6. [USD] a [BRL]");
                System.out.println("7. [CLP] a [USD]");
                System.out.println("8. [USD] a [CLP]");
                System.out.println("9. [COP] a [USD]");
                System.out.println("10. [USD] a [COP]");
                System.out.println("11. salir");
                System.out.println("\n*****************************************************************************");
                System.out.println("Escriba una opción: ");
                lectura = new Scanner(System.in);
                opcion = Integer.valueOf(lectura.nextLine());
            }
            System.out.println("Finalizando la aplicación.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }
    }
}

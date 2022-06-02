package ejercicio4;

public class Tema4 {
    public static void main(String[]args){

    //punto if
        System.out.println();
        System.out.println("Punto if");
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("positivo");
        }else if (numeroIf < 0){
            System.out.println("negativo");
        }else if (numeroIf == 0){
            System.out.println("este es 0");
        }else {
            System.out.println("por favor ingresa un numero");
        }
        //punto while
        System.out.println();
        System.out.println("Punto while");

        int numeroWhile=0;
        while (numeroWhile < 3){

            System.out.println("Incrementando: "+numeroWhile);
            numeroWhile++;
        }

    //punto do while
        System.out.println();
        System.out.println("Punto do while");

        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
        System.out.println("se incremento:" + numeroDoWhile);

    //punto for
        System.out.println();
        System.out.println("Punto for");
        for (int numerofor= 0; numerofor<=3;numerofor++) {

            System.out.println("incrementando: " + numerofor);
        }

    //punto do Switch
        System.out.println();
        System.out.println("Punto do Switch");
        String estacion = "ASA";
        switch (estacion){
            case "Verano":
                System.out.println("Usted se encuentra en la estación Verano");
                break;
            case "Invierno":
                System.out.println("Usted se encuentra en la estación Invierno");
                break;
            case "Otoño":
                System.out.println("Usted se encuentra en la estación Otoño");
                break;
            case "Primavera":
                System.out.println("Usted se encuentra en la estación Primavera");
                break;
            default:
                System.out.println("Has ingresado una estación incorrecta");
                break;
        }
    }
}

public class Tema4 {
    public static void main(String[] args) {
        int numeroIf = 100;
        if (numeroIf < 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es negativo");
        } else if (numeroIf > 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es positivo");
        } else {
            System.out.println("La variable numeroIf es 0");
        }

        int numeroWhile = 1;

        while(numeroWhile < 3) {
            ++numeroWhile;
            System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
        }

        int numeroDoWhile = 2;

        do {
            ++numeroDoWhile;
            System.out.println("La variable numeroDoWhile ahora vale: " + numeroDoWhile);
        } while(numeroDoWhile < 3);

        for(int numeroFor = 0; numeroFor <= 10; ++numeroFor) {
            System.out.println("La variable numeroFor ahora vale: " + numeroFor);
        }

        switch ("primavera") {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}


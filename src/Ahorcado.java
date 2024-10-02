import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        //REALIZAR EL JUEGO DEL AHORCADO
        /*
         * 1) la palabra secreta ya tiene que estar definida    *
         * 2) motrar cuantas letras son representados con guiones bajos  *
         * 3) usuario debe ingresar una letra  *
         * 4) comprobar si existe la letra en la palabra
         * 5) ir reemplazando la el guion bajo por la letra
         *
         * */

        Scanner ingresoLetra = new Scanner(System.in);

        char[] palabraSecreta = {'u', 'l', 't', 'r', 'a', 'm', 'a', 'n' };
        char[] ingresoPalabra = new char[palabraSecreta.length];
        int i;
        int contadorVidas = (palabraSecreta.length+5);
        boolean acierto = false;







        do{



            System.out.println( "\n tiene :  " + contadorVidas+ " intentos");
            for (i = 0; i < palabraSecreta.length; i++) {
                System.out.print("_  ");

            }

            System.out.println( "\n ingrese una letra :  ");


            char letra = Character.toLowerCase(ingresoLetra.nextLine().charAt(0));




            for( i = 0 ;i < palabraSecreta.length;i++) {

                System.out.println(" contenido " + palabraSecreta[i] +i);



                if  ( letra ==  palabraSecreta[i] ) {

                    ingresoPalabra[i] = letra;
                    acierto = true;

                break;
                }

                else {

                    acierto = false;

                    contadorVidas--;
                    break;
                }


            }




        }while(contadorVidas != 0);
        System.out.println(" LA PALABRA SECRETA ERA : ");

        for (i =0 ; i<palabraSecreta.length;i++) {
            System.out.print( palabraSecreta[i]);

        }

        for (i =0 ; i<ingresoPalabra.length;i++) {
            System.out.println( " ** "+ingresoPalabra[i]);

        }




        ingresoLetra.close();

    }


}
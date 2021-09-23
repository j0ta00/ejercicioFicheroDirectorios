package vista;

import java.util.Scanner;

public class Vista {
    private static Scanner teclado=new Scanner(System.in);

    public static String imprimirYLeerRuta(){
        System.out.println("Introduce la ruta: ");
        return teclado.nextLine();
    }

    public static void esFicheroODir(boolean esEjecutable,boolean esEscribible,boolean esLeible,boolean esFichero,String nombreFicheroODir){
        if(esFichero){
            imprimirPermisosFichero(esEjecutable,esEscribible,esLeible);
            System.out.print(nombreFicheroODir);
        }else{
            System.out.println(String.format("+--- %s",nombreFicheroODir));
        }
    }

    public static void imprimirPermisosFichero(boolean esEjecutable,boolean esEscribible,boolean esLeible){
        System.out.print(String.format("%s,%s,%s",ficheroPudeEjecutarse(esEjecutable),ficheroPuedeEscribirse(esEscribible),
                ficheroPuedeLeerse(esLeible)));
    }

    private static String ficheroPudeEjecutarse(boolean esEjecutable){
        String ejecutable="";
        if(esEjecutable){
            ejecutable="X";
            
        }else{
            ejecutable="_";
        }
        return ejecutable;
    }
    private static String ficheroPuedeLeerse(boolean esLeible){
        String leible="";
        if(esLeible){
            leible="R";

        }else{
            leible="_";
        }
        return leible;
    }
    private static String ficheroPuedeEscribirse(boolean esEscribible){
        String escribible="";
        if(esEscribible){
            escribible="W";

        }else{
            escribible="_";
        }
        return escribible;
    }
    
}

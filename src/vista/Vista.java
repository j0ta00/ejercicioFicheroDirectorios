package vista;

import java.util.Scanner;

public class Vista {
    private static Scanner teclado=new Scanner(System.in);
    //CADENAS CONSTANTES
    public static final String PEDIR_RUTA="Introduce la ruta: ";
    public static final String PERMISO_EJECUCION="X";
    public static final String PERMISO_ESCRITURA="W";
    public static final String PERMISO_LECTURA="R";
    public static final String ES_DIRECTORIO="+---";
    public static final String NO_PERMISO="_";

    public static String imprimirYLeerRuta(){
        System.out.println(PEDIR_RUTA);
        return teclado.nextLine();
    }

    public static void esFicheroODir(int cantidadTabulaciones,boolean esEjecutable,boolean esEscribible,boolean esLeible,boolean esFichero,String nombreFicheroODir){
        imprimirNumeroTabulaciones(cantidadTabulaciones);
        if(esFichero){
            imprimirPermisosFichero(esEjecutable,esEscribible,esLeible);
            System.out.println(nombreFicheroODir);
        }else{
            System.out.println(String.format("%s %s",ES_DIRECTORIO,nombreFicheroODir));
        }
    }

    public static void imprimirPermisosFichero(boolean esEjecutable,boolean esEscribible,boolean esLeible){
        System.out.print(String.format("%s,%s,%s ",ficheroPudeEjecutarse(esEjecutable),ficheroPuedeEscribirse(esEscribible),
                ficheroPuedeLeerse(esLeible)));
    }

    private static String ficheroPudeEjecutarse(boolean esEjecutable){
        String ejecutable="";
        if(esEjecutable){
            ejecutable=PERMISO_EJECUCION;
            
        }else{
            ejecutable=NO_PERMISO;
        }
        return ejecutable;
    }
    private static String ficheroPuedeLeerse(boolean esLeible){
        String leible="";
        if(esLeible){
            leible=PERMISO_LECTURA;

        }else{
            leible=NO_PERMISO;
        }
        return leible;
    }
    private static String ficheroPuedeEscribirse(boolean esEscribible){
        String escribible="";
        if(esEscribible){
            escribible=PERMISO_ESCRITURA;

        }else{
            escribible=NO_PERMISO;
        }
        return escribible;
    }
    private static void imprimirNumeroTabulaciones(int cantidad){
        for(int i=1;cantidad>i;i++){
            System.out.print("  ");
        }

    }
}

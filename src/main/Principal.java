package main;

import fileAcces.FileAcces;
import vista.Vista;

import java.io.File;

public class Principal {

    public static void main(String[] args) {
        int numeroTabulaciones=0;
        FileAcces gestoraFicheros;
        do{//bucle para comprobar si la ruta es correcta o no
            gestoraFicheros=new FileAcces(Vista.imprimirYLeerRuta());
        }while(!gestoraFicheros.exists());
        gestoraFicheros.leerContenidoDirectorio(numeroTabulaciones);
    }
    /**
     * Cabecera:public static void enviarDatosFichero(int numeroTabulaciones,boolean ejecutable,boolean escribible, boolean leible, boolean ficheroODir, String nombre)
     * Proposito:Comunicar los datos obtenidos del fichero a la vista que se encargará de representarlos
     * @param numeroTabulaciones,ejecutable,escribible, leible, ficheroODir, nombre
     * Precondición:Ninguna
     * Postcondición:Los datos son enviados a la vista que se encargará de representarlos de forma adecuada en la consola
     * */
    public static void enviarDatosFichero(int numeroTabulaciones,boolean ejecutable,boolean escribible, boolean leible, boolean ficheroODir, String nombre){
        Vista.esFicheroODir(numeroTabulaciones,ejecutable, escribible, leible, ficheroODir,nombre);//llamamos a la vista para que represente dichos datos
    }

}

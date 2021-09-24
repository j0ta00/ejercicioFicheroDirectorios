package fileAcces;

import main.Principal;
import vista.Vista;

import java.io.File;


public class FileAcces{
    //fichero
    private File fichero;
    //constructor de la clase
    public FileAcces(String path){
        fichero=new File(path);
    }

    public boolean exists(){
        return fichero.exists();
    }

    /**
     * @author:jjmza
     * Cabecera:public void leerContenidoDirectorio(int numeroTabulaciones)
     * Proposito:Método que nos dice si un elemento es o no fichero
     * @param numeroTabulaciones
     * Precondición:Ninguna
     * Postcondición:Imprime en consola el árbol del directorio introducido
     * */
    public void leerContenidoDirectorio(int numeroTabulaciones) {
        numeroTabulaciones++;
            File[] ficheros = fichero.listFiles();//listamos todos los elementos del directorio y lo guardamos en un array de tipo File
            boolean esFichero;//para ahorrarme dos llamadas a is file innecesarias
            for (int i = 0; i < ficheros.length; i++) {//bucle for encargado de recorrer el array con los elementos del directorio
                fichero = ficheros[i];
                esFichero = fichero.isFile();
                Principal.enviarDatosFichero(numeroTabulaciones, fichero.canExecute(), fichero.canWrite(), fichero.canRead(), esFichero, fichero.getName());/*
           en este método le enviamos los datos al controlador el cual se comunicará con la vista, puede parecer innecesario pero es para mantener correctamente
           el módelo vista/modelo/controlador que seguimos
            */
                if (!esFichero) {
                    leerContenidoDirectorio(numeroTabulaciones);
                }
            }
        }
}

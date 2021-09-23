package fileAcces;

import vista.Vista;

import java.io.File;


public class FileAcces{
    //fichero
    private File fichero;
    //constructor de la clase
    public FileAcces(String path){
        fichero=new File(path);
    }


    /**
     * @author:jjmza
     * Cabecera:public void directorioOFichero(int numeroTabulaciones)
     * Proposito:Método que interactua con la vista en función de
     *
     * */
    public void directorioOFichero(int numeroTabulaciones){
        numeroTabulaciones++;
        File[] ficheros = fichero.listFiles();
        boolean esFichero;//para ahorrarme dos llamadas a is file innecesarias
        for(int i=0;i<ficheros.length;i++){
            fichero=ficheros[i];
            esFichero=fichero.isFile();
            Vista.esFicheroODir(numeroTabulaciones,fichero.canExecute(), fichero.canWrite(), fichero.canRead(), esFichero, fichero.getName());
            if(!esFichero){
                directorioOFichero(numeroTabulaciones);
            }
        }
    }
}

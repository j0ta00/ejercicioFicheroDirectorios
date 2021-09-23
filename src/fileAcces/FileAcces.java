package fileAcces;

import vista.Vista;

import java.io.File;

public class FileAcces{

    private File fichero;

    public FileAcces(String path){
        fichero=new File(path);
    }

    public void directorioOFichero(){
        String nombre="";
        nombre=fichero.getName();
        if(fichero.isFile()){.

            Vista.esFicheroODir(fichero.canExecute(),fichero.canWrite(),fichero.canRead(),true,nombre);
        }else{
              Vista.esFicheroODir(false,false,false,false,nombre);
        }
    }

}

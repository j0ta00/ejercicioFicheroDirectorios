package main;

import fileAcces.FileAcces;
import vista.Vista;

public class Principal {

    public static void main(String[] args) {
        FileAcces gestoraFicheros=new FileAcces(Vista.imprimirYLeerRuta());
        gestoraFicheros.directorioOFichero();
    }
}

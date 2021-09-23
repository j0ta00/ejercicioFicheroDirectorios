package main;

import fileAcces.FileAcces;
import vista.Vista;

public class Principal {

    public static void main(String[] args) {
        int numeroTabulaciones=0;
        FileAcces gestoraFicheros=new FileAcces(Vista.imprimirYLeerRuta());
        gestoraFicheros.directorioOFichero(numeroTabulaciones);
    }
}

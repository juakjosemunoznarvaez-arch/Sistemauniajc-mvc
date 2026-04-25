package com.uniajc.vista;

import com.uniajc.controlador.MateriaController;
import com.uniajc.modelo.entidad.Materia;
import java.util.Scanner;

public class VistaMateria {

    public void menu() {
        Scanner sc = new Scanner(System.in);
        MateriaController controller = new MateriaController();

        System.out.println("Ingrese nombre de la materia:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese créditos:");
        int creditos = sc.nextInt();

        Materia materia = new Materia(0, nombre, creditos);
        controller.crearMateria(materia);
    }
}
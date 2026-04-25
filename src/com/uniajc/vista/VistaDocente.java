package com.uniajc.vista;

import com.uniajc.controlador.DocenteController;
import com.uniajc.modelo.entidad.Docente;
import java.util.Scanner;

public class VistaDocente {

    public void menu() {

        Scanner sc = new Scanner(System.in);
        DocenteController controller = new DocenteController();

        System.out.println("Ingrese nombre del docente:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese especialidad:");
        String especialidad = sc.nextLine();

        Docente docente = new Docente(0, nombre, especialidad);

        controller.crearDocente(docente);
    }
}
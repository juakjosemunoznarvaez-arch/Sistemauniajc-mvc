package com.uniajc.vista;

import com.uniajc.controlador.EstudianteController;
import com.uniajc.modelo.entidad.Estudiante;

import java.util.Scanner;

public class VistaEstudiante {

    public void menu() {

        Scanner sc = new Scanner(System.in);
        EstudianteController controller = new EstudianteController();

        System.out.println("Ingrese nombre del estudiante:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese programa:");
        String programa = sc.nextLine();

        Estudiante estudiante = new Estudiante(0, nombre, programa);

        controller.crearEstudiante(estudiante);
    }
}
package com.uniajc.vista;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Crear Materia");
        System.out.println("2. Crear Docente");
        System.out.println("3. Crear Estudiante");
        System.out.println("4. Crear Grupo");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {
            VistaMateria vm = new VistaMateria();
            vm.menu();
        } 
        else if (opcion == 2) {
            VistaDocente vd = new VistaDocente();
            vd.menu();
        } 
        else if (opcion == 3) {
            VistaEstudiante ve = new VistaEstudiante();
            ve.menu();
        } 
        else if (opcion == 4) {
            VistaGrupo vg = new VistaGrupo();
            vg.menu();
}
        else {
            System.out.println("Opción inválida");
        }
    }
}
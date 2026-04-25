package com.uniajc.vista;

import com.uniajc.vista.VistaGrupo;
import com.uniajc.controlador.GrupoController;
import com.uniajc.modelo.entidad.Grupo;

import java.util.Scanner;

public class VistaGrupo {

    public void menu() {

        Scanner sc = new Scanner(System.in);
        GrupoController controller = new GrupoController();

        System.out.println("Ingrese ID de materia:");
        int idMateria = sc.nextInt();

        System.out.println("Ingrese ID de docente:");
        int idDocente = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese aula:");
        String aula = sc.nextLine();

        System.out.println("Ingrese horario:");
        String horario = sc.nextLine();

        Grupo grupo = new Grupo(0, idMateria, idDocente, aula, horario);

        controller.crearGrupo(grupo);
    }
}
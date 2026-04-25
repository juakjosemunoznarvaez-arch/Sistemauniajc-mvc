package com.uniajc.modelo.entidad;

public class Grupo {

    private int idGrupo;
    private int idMateria;
    private int idDocente;
    private String aula;
    private String horario;

    public Grupo(int idGrupo, int idMateria, int idDocente, String aula, String horario) {
        this.idGrupo = idGrupo;
        this.idMateria = idMateria;
        this.idDocente = idDocente;
        this.aula = aula;
        this.horario = horario;
    }

    public int getIdMateria() { return idMateria; }
    public int getIdDocente() { return idDocente; }
    public String getAula() { return aula; }
    public String getHorario() { return horario; }
}
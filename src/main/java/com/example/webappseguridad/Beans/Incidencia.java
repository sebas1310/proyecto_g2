package com.example.webappseguridad.Beans;

public class Incidencia {
    private int idIncidencia;
    private String nombreIncidencia;
    private String descripcion;
    private String zonaPUCP;
    private String ubicacion;
    private int idUsuario;
    private int idTipoDeIncidencia;
    private int idNivelDeUrgencia;
    private int idEstado;

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public String getNombreIncidencia() {
        return nombreIncidencia;
    }

    public void setNombreIncidencia(String nombreIncidencia) {
        this.nombreIncidencia = nombreIncidencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getZonaPUCP() {
        return zonaPUCP;
    }

    public void setZonaPUCP(String zonaPUCP) {
        this.zonaPUCP = zonaPUCP;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoDeIncidencia() {
        return idTipoDeIncidencia;
    }

    public void setIdTipoDeIncidencia(int idTipoDeIncidencia) {
        this.idTipoDeIncidencia = idTipoDeIncidencia;
    }

    public int getIdNivelDeUrgencia() {
        return idNivelDeUrgencia;
    }

    public void setIdNivelDeUrgencia(int idNivelDeUrgencia) {
        this.idNivelDeUrgencia = idNivelDeUrgencia;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
}

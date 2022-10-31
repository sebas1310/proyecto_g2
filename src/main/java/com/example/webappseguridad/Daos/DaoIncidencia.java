package com.example.webappseguridad.Daos;

import com.example.webappseguridad.Beans.Estado;
import com.example.webappseguridad.Beans.Incidencia;

import java.sql.*;
import java.util.ArrayList;

public class DaoIncidencia {
    public ArrayList<Incidencia> obtenerListaDeIncidencias(){
        ArrayList<Incidencia> listaDeIncidencias= new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Parametros de Conexion

        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/gigacontrol";

        //Conexion a base de datos

        String sql = "select * from incidencia";


        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {


            while (rs.next()) {
                Incidencia incidencia = new Incidencia();
                incidencia.setIdIncidencia(rs.getInt(1));
                incidencia.setNombreIncidencia(rs.getString(2));
                incidencia.setDescripcion(rs.getString(3));
                incidencia.setZonaPUCP(rs.getString(4));
                incidencia.setUbicacion(rs.getString(5));
                incidencia.setIdUsuario(rs.getInt(7));
                incidencia.setIdTipoDeIncidencia(rs.getInt(8));
                incidencia.setIdNivelDeUrgencia(rs.getInt(9));
                incidencia.setIdEstado(rs.getInt(10));
                listaDeIncidencias.add(incidencia);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return listaDeIncidencias;
    }
}


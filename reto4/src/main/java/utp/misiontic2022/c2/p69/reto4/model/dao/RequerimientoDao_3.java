package utp.misiontic2022.c2.p69.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p69.reto4.model.vo.Requerimiento_3;
import utp.misiontic2022.c2.p69.reto4.util.JDBCUtilities;

public class RequerimientoDao_3 {

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT SUBSTR(l.Nombre, 0, 4) || SUBSTR(l.Primer_Apellido, 0, 4) || SUBSTR(l.Segundo_Apellido, 0, 4) "
            + " FROM Lider l";

        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){
            Requerimiento_3 requerimiento_3 = new Requerimiento_3(
                resultSet.getString("SUBSTR(l.Nombre, 0, 4) || SUBSTR(l.Primer_Apellido, 0, 4) || SUBSTR(l.Segundo_Apellido, 0, 4)")
            );
            respuesta.add(requerimiento_3);
        }
        resultSet.close();
        statement.close();

        } catch (SQLException e) {
            System.err.println("Error en la consulta SQL Requerimiento_3 -> " + e);
        } finally {
            conexion.close();
        }
            return respuesta;
    }    
}


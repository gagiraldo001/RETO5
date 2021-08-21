package utp.misiontic2022.c2.p69.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p69.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p69.reto4.util.JDBCUtilities;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();

        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, " 
                    + "l.Nombre || ' ' || l.Segundo_Apellido, "
                    + "t.Codigo_Tipo, t.Estrato "
                    + "FROM Proyecto p " + "INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider "
                    + "INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo "
                    + "WHERE p.Fecha_Inicio BETWEEN '2021-01-01' AND '2021-05-30' AND p.Ciudad = 'Armenia'";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Requerimiento_2 requerimiento_2 = new Requerimiento_2(
                        resultSet.getString("Fecha_Inicio"),
                        resultSet.getString("Ciudad"), 
                        resultSet.getString("Constructora"),
                        resultSet.getString("l.Nombre || ' ' || l.Segundo_Apellido"), 
                        resultSet.getInt("Codigo_Tipo"),
                        resultSet.getInt("Estrato")
                    );
                    respuesta.add(requerimiento_2);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error en la consulta SQL Requerimiento_2 --> " + e);
        } finally{
            conexion.close();
        }

        return respuesta;
    }

}

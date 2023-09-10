package Dao;

import model.Empresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class EmpresaDao {
    public int registrarEmpresa(Empresa empresa) throws ClassNotFoundException{
        String INSERT_EMPRESAS_SQL = "INSERT  Empresas" +
                "(nit,nombre,direccion,telefono,clave,servicio) VALUES" +
                "(?,?,?,?,?,?);";
        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");


             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPRESAS_SQL)) {
            preparedStatement.setString(1, empresa.getNit());
            preparedStatement.setString(2, empresa.getNombre());
            preparedStatement.setString(3, empresa.getDireccion());
            preparedStatement.setString(4, empresa.getTelefono());
            preparedStatement.setString(5, empresa.getClave());
            preparedStatement.setString(6, empresa.getServicio());

            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}

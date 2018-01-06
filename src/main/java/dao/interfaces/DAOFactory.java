package dao.interfaces;

import dao.implemetations.DAODepartureImpl;
import dao.implemetations.DAOEmployeeImpl;
import dao.implemetations.DAOTaskImpl;
import source.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DAOFactory {
    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    DAOTask getDAOTask(Connection connection) {
        return new DAOTaskImpl(connection);
    }

    DAODeparture getDAODepartre(Connection connection) {
        return new DAODepartureImpl(connection);
    }

    DAOEmployee getDAOEmployee(Connection connection) {
        return new DAOEmployeeImpl(connection);
    }
}


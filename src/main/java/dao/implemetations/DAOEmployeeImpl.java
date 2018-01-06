package dao.implemetations;

import dao.interfaces.DAOEmployee;
import model.entities.Employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOEmployeeImpl implements DAOEmployee {
    private final Connection connection;

    public DAOEmployeeImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Employee read(int id) {
        Employee employee = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees " +
                    "JOIN departures ON employees.idDept = departures.idDept=" + id);
            resultSet.next();
            employee = new Employee(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getString(4),
                    resultSet.getInt(5), resultSet.getString(7));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<Employee> readAll() {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees " +
                    "JOIN departures ON employees.idDept = departures.idDept");
            resultSet.next();
            list.add(new Employee(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getString(4),
                    resultSet.getInt(5), resultSet.getString(7)));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Employee> readByDepartment(int idDep) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees" +
                    " JOIN departures ON employees.idDept = departures.idDept" +
                    " WHERE employees.idDept=" + idDep);
            resultSet.next();
            list.add(new Employee(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getString(4),
                    resultSet.getInt(5), resultSet.getString(7)));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(int id) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM employees WHERE  idEmployee=" + id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Employee create() {
        return null;
    }
}

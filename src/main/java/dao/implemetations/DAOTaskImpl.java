package dao.implemetations;

import dao.interfaces.DAOTask;
import model.entities.Task;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DAOTaskImpl implements DAOTask {
    private final Connection connection;

    public DAOTaskImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Task read(int id) {
        Task task = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tasks WHERE idTask=" + id);
            resultSet.next();
            task = new Task(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getInt(3));
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return task;
    }

    @Override
    public List<Task> readAll() {
        return null;
    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Task create() {
        return null;
    }
}

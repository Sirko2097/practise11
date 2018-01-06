package dao.interfaces;

import model.entities.Task;

import java.util.List;

public interface DAOTask {
    Task read(int id);
    List<Task> readAll();
    void update(Task task);
    void delete(int id);
    Task create();
}

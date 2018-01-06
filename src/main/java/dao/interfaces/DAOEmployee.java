package dao.interfaces;

import model.entities.Employee;

import java.util.List;

public interface DAOEmployee {
    Employee read(int id);
    List<Employee> readAll();
    void update(Employee employee);
    void delete(int id);
    Employee create();
}

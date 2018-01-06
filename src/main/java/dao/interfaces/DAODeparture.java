package dao.interfaces;

import model.entities.Departure;

import java.util.List;

public interface DAODeparture {
    Departure read(int id);
    List<Departure> readAll();
    void update(Departure employee);
    void delete(int id);
    Departure create();
}

package dao.implemetations;

import dao.interfaces.DAODeparture;
import model.entities.Departure;

import java.sql.Connection;
import java.util.List;

public class DAODepartureImpl implements DAODeparture{
    private final Connection connection;

    public DAODepartureImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Departure read(int id) {
        return null;
    }

    @Override
    public List<Departure> readAll() {
        return null;
    }

    @Override
    public void update(Departure employee) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Departure create() {
        return null;
    }
}

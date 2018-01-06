package model.entities;

public class Task {
    private int idTas;
    private String description;
    private int idEmployee;

    public Task(int idTas, String description, int idEmployee) {
        this.idTas = idTas;
        this.description = description;
        this.idEmployee = idEmployee;
    }

    public int getIdTas() {
        return idTas;
    }

    public void setIdTas(int idTas) {
        this.idTas = idTas;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public String toString() {
        return "Task{" +
                "idTas=" + idTas +
                ", description='" + description + '\'' +
                ", idEmployee=" + idEmployee +
                '}';
    }
}

package model.entities;

public class Departure {
    private int depId;
    private String depName;
    private String depPhoneNumber;

    public Departure(int depId, String depName, String depPhoneNumber) {
        this.depId = depId;
        this.depName = depName;
        this.depPhoneNumber = depPhoneNumber;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepPhoneNumber() {
        return depPhoneNumber;
    }

    public void setDepPhoneNumber(String depPhoneNumber) {
        this.depPhoneNumber = depPhoneNumber;
    }

    @Override
    public String toString() {
        return "Departure{" +
                "depId=" + depId +
                ", depName='" + depName + '\'' +
                ", depPhoneNumber='" + depPhoneNumber + '\'' +
                '}';
    }
}

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int idNumber;       // Табельный номер
    private String phoneNumber; // Номер телефона
    private String name;        // Имя
    private int experience;     // Стаж

    public Employee(int idNumber, String phoneNumber, String name, int experience) {
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + idNumber +
                ", Name='" + name + '\'' +
                ", Experience=" + experience +
                ", Phone='" + phoneNumber + '\'' +
                '}';
    }
}

import java.util.ArrayList;
import java.util.List;

class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(int idNumber, String phoneNumber, String name, int experience) {
        // Проверка на уникальность табельного номера
        for (Employee employee : employees) {
            if (employee.getIdNumber() == idNumber) {
                throw new IllegalArgumentException("Сотрудник с табельным номером " + idNumber + " уже существует.");
            }
        }
        employees.add(new Employee(idNumber, phoneNumber, name, experience));
    }

    public List<Employee> findByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> getPhoneByName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    public Employee findById(int idNumber) {
        for (Employee employee : employees) {
            if (employee.getIdNumber() == idNumber) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "EmployeeDirectory{" +
                "employees=" + employees +
                '}';
    }
}

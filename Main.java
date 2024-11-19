public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавляем сотрудников
        directory.addEmployee(1, "0707-123-456", "Мирбек Мирбекович", 5);
        directory.addEmployee(2, "0708-456-789", "Нурбек Нурбекович", 3);
        directory.addEmployee(3, "0705-563-245", "Сагын Сагынович", 5);

        // Поиск сотрудников по стажу
        System.out.println("Сотрудники со стажем 5 лет: " + directory.findByExperience(5));

        // Получение телефона по имени
        System.out.println("Телефон Мирбек Мирбековича: " + directory.getPhoneByName("Мирбек Мирбекович"));

        // Поиск сотрудника по табельному номеру
        System.out.println("Сотрудник с табельным номером 1: " + directory.findById(1));
    }
}
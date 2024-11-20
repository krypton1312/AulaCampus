package act13t5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Act13T5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получение текущей даты
        LocalDate currentDate = LocalDate.now();
        System.out.println("Fecha actual: " + currentDate);

        // Ввод даты от пользователя (или использование значения по умолчанию)
        System.out.print("Introduce la fecha en formato AAAA-MM-DD (la fecha predeterminada es la de hoy):");
        String input = scanner.nextLine().trim();

        LocalDate expirationDate;
        if (input.isEmpty()) {
            // Использовать текущую дату как значение по умолчанию
            expirationDate = currentDate;
        } else {
            try {
                expirationDate = LocalDate.parse(input);

                // Проверяем, что год введенной даты соответствует текущему году
                if (expirationDate.getYear() != currentDate.getYear()) {
                    System.out.println("Error. Solo se puede introducir fecha de este año.");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Error.");
                return;
            }
        }

        // Проверяем, не просрочен ли продукт
        if (expirationDate.isBefore(currentDate)) {
            System.out.println("Продукт просрочен.");
        } else {
            System.out.println("Продукт не просрочен.");
        }
    }
}

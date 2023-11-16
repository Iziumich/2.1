import java.util.*;

public class Main {
    public static void main(String[] args) {

        int totalPrice = 0;

        Set<String> counter = new HashSet<>();
        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(new Address("Россия", "Москва"), 100);
        costPerAddress.put(new Address("Россия", "Орёл"), 200);
        costPerAddress.put(new Address("Германия", "Берлин"), 600);
        costPerAddress.put(new Address("Молдова", "Бельцы"), 300);
        costPerAddress.put(new Address("Дания", "Вайле"), 800);

        while (true) {

            System.out.print("Заполнение нового заказа или end. \nВведите страну: ");
            Scanner scanner = new Scanner(System.in);
            String newCountry = scanner.nextLine();
            if ("end".equals(newCountry)) {
                System.out.println("Программа завершена!");
                break;
            }
            System.out.print("Введите город: ");
            String newCity = scanner.nextLine();
            System.out.print("Введите Вес посылки (кг): ");
            int weight = scanner.nextInt();

            if (costPerAddress.containsKey(new Address(newCountry, newCity))) {

                counter.add(newCountry);
                totalPrice += (weight * costPerAddress.get(new Address(newCountry, newCity)));
                System.out.println("-----------------------------");
                System.out.println("Стоимость доставки составит: " + weight * costPerAddress.get(new Address(newCountry, newCity)) + " руб.");
            } else {
                System.out.println("-----------------------------");
                System.out.println("Доставки по этому адресу нет!");

            }
            System.out.println("Общая стоимость всех доставок: " + totalPrice + " руб.");
            System.out.println("Уникальных стран " + counter.size());
            System.out.println("-----------------------------");
        }
    }

}

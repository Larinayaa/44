import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main2 {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Анна", "Ковальчук", 27, "Саарбрюккен"),
                new Person("Вася", "Пупкин", 25, "Берлин"),
                new Person("Андрей", "Симонов", 35, "Берлин"),
                new Person("Ярослав", "Хрущев", 30, "Берлин"),
                new Person("Инна", "Войтова", 30, "Мюнхен")
        );
        double berlinAge = sredniyVozrastBerlin(personList, "Берлин");
        System.out.println("Средний возраст, Берлин: " + berlinAge);
        Map<Integer, Long> ageCountMap = gruppAgeKolichestvo(personList);
        System.out.println("Сколько людей по возрастам:");
        ageCountMap.forEach((age, count) -> System.out.println(age + " -> " + count));
    }
    public static double sredniyVozrastBerlin(List<Person> personList, String city) {
        return personList.stream()
                .filter(person -> person.getCity().equalsIgnoreCase(city)) //выбираем по городу, берем возраст, высчитываем средний. если по городу пусто, возврат 0
                .mapToInt(Person::getAge).average().orElse(0);
    }
    public static Map<Integer, Long> gruppAgeKolichestvo(List<Person> personList) {
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
    }
}

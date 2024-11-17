import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> spisok = List.of("имя:Анна", "возраст:27", "имя:Олег", "возраст:15", "имя:Валентина");
        Map<String, String> result = spisok.stream()
                .map(entry -> entry.split(":", 3)).collect(Collectors.toMap(
                        arr -> arr[0],
                        arr -> arr[1],
                        (existing, replacement) -> existing + "," + replacement//через запятую добавляются значения
                ));
        result.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

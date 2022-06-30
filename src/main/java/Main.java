import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова:");
        String input = scanner.nextLine();
        List<String> list = new ArrayList<>(Arrays.asList(input.split(" ")));
        list.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(x -> System.out.println(x + " "));
    }
}
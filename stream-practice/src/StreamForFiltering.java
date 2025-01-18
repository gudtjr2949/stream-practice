import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForFiltering {
    public static void main(String[] args) {
        // 1. 다음 리스트에서 5보다 큰 숫자만 추출하여 새로운 리스트를 생성하세요.
        solve1();

        // 2. 다음 문자열 리스트에서 "A"로 시작하는 단어만 추출하여 새로운 리스트를 반환하세요.
        solve2();

        // 3. 다음 리스트에서 10 이상 30 이하인 숫자만 추출하여 새로운 리스트를 만드세요.
        solve3();

        // 4. 다음 리스트에서 길이가 4 이상이고 "e" 문자를 포함한 문자열만 추출하세요.
        solve4();

        // 5. 다음 문자열 리스트에서 빈 문자열("")을 제외한 나머지 문자열만 추출하여 새로운 리스트를 반환하세요.
        solve5();
    }

    static void solve1() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 11, 13);

        List<Integer> filterList = numbers.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());

        System.out.println("1번 : " + filterList);
    }

    static void solve2() {
        List<String> names = Arrays.asList("Alice", "Bob", "Angela", "Andrew", "Charlie");

        List<String> filterList = names.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("2번 : " + filterList);
    }

    static void solve3() {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40);

        List<Integer> filterList = numbers.stream()
                .filter(n -> n >= 10 && n <= 30)
                .collect(Collectors.toList());

        System.out.println("3번 : " + filterList);
    }

    static void solve4() {
        List<String> words = Arrays.asList("tree", "bee", "apple", "elephant", "car", "deer");

        List<String> filterList = words.stream()
                .filter(w -> w.length() >= 4 && w.contains("e"))
                .collect(Collectors.toList());

        System.out.println("4번 : " + filterList);
    }

    static void solve5() {
        List<String> items = Arrays.asList("apple", "", "banana", "", "cherry", "date", "");

        List<String> filterList = items.stream()
                .filter(i -> !i.isEmpty())
                .collect(Collectors.toList());

        System.out.println("5번 : " + filterList);
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForStringChange {
    public static void main(String[] args) {
        solve1();
        solve2();
        solve3();
        solve4();
        solve5();
    }

    // 1. 다음 리스트의 모든 문자열을 대문자로 변환하세요.
    static void solve1() {
        List<String> words = Arrays.asList("hello", "world", "java", "stream");

        List<String> changesList = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("1번 : " + changesList);
    }

    // 2. 모든 문자열에 접두사 "prefix_"를 추가하여 새로운 리스트를 반환하세요.
    static void solve2() {
        List<String> words = Arrays.asList("one", "two", "three");

        List<String> changedList = words.stream()
                .map(word -> "prefix_" + word)
                .collect(Collectors.toList());

        System.out.println("2번 : " + changedList);
    }


    // 3. 리스트의 각 문자열의 길이를 추출하여 새로운 리스트를 생성하세요.
    static void solve3() {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<Integer> changedList = words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());

        System.out.println("3번 : " + changedList);
    }


    // 4. 모든 문자열에서 문자 'a'를 제거하고 새로운 리스트를 반환하세요.
    static void solve4() {
        List<String> words = Arrays.asList("apple", "banana", "avocado");

        List<String> changedList = words.stream()
                .map(word -> word.replace("a", ""))
                .collect(Collectors.toList());

        System.out.println("4번 : " + changedList);
    }

    // 5. 모든 문자열을 역순으로 변환한 리스트를 반환하세요.
    static void solve5() {
        List<String> words = Arrays.asList("abc", "def", "ghi");

        List<String> changedList = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());

        System.out.println("5번 : " + changedList);
    }
}

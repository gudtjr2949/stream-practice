import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StreamForTally {
    public static void main(String[] args) {
        solve1();
        solve2();
        solve3();
        solve4();
        solve5();
    }

    // 1. 다음 리스트의 총합을 구하세요.
    static void solve1() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        int sum = numbers.stream().mapToInt(number -> number).sum();
        System.out.println("1번 : " + sum);
    }

    // 2. 다음 리스트에서 최대값을 추출하세요.
    static void solve2() {
        List<Integer> numbers = Arrays.asList(15, 8, 22, 35, 9);
        int max = numbers.stream()
                .mapToInt(number -> number)
                .max()
                .orElseThrow(NoSuchElementException::new);;
        System.out.println("2번 : " + max);
    }

    // 3. 다음 리스트의 평균값을 계산하세요.
    static void solve3() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double avg = numbers.stream()
                .mapToInt(number -> number)
                .average()
                .orElseThrow();
        System.out.println("3번 : " + avg);
    }

    // 4. 다음 문자열 리스트를 하나의 문자열로 연결하세요. 각 단어는 쉼표로 구분됩니다.
    static void solve4() {
        List<String> words = Arrays.asList("red", "green", "blue");
        String result = words.stream().collect(Collectors.joining());
        System.out.println("4번 : " + result);
    }

    // 5. 다음 리스트에서 홀수만 추출하여 곱을 구하세요.
    static void solve5() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(1, (n1, n2) -> n1 * n2); // 초기값을 1로 설정하고, 이후에 오는 숫자를 모두 곱한다.
        System.out.println("5번 : " + result);
    }
}

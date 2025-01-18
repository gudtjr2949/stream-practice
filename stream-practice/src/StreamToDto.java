import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToDto {

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<String> name = createNames();
        List<Person> persons = name.stream()
                .distinct() // 중복 이름 제거
                .filter(n -> n.contains("a")) // 중복 제거를 거친 스트림을 내가 원하는 조건에 맞게 필터링
                .map(n -> new Person(n, 1)) // 필터링을 거친 스트림을 변환하여 새로운 객체를 생성함
                .collect(Collectors.toList()); // 최종적으로 리스트로 반환

        System.out.println(persons);
    }

    private static List<String> createNames() {
        return Arrays.asList("jack", "lee", "kim", "tony", "gabi", "amy", "jack");
    }
}

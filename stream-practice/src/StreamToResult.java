import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamToResult {

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
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
        List<Person> persons = Arrays.asList(
                new Person("jack", 21),
                new Person("lee", 11),
                new Person("kim", 55),
                new Person("tony", 34),
                new Person("gabi", 29),
                new Person("amy", 61),
                new Person("jack", 24));

        // 이름에 a가 포함된 사람의 나이 총합 (대신 이름이 중복된 사람이 있는 경우 더 어린 사람의 나이를 선택함)
        int ageSum = persons.stream()
                .collect(Collectors.toMap(
                        Person::getName, // Person 객체에서 이름을 Key 로 사용
                        p -> p, // Person 객체 자체를 Value 로 사용
                        (p1, p2) -> p1.getAge() < p2.getAge() ? p1 : p2
                )).values().stream()
                .filter(p -> p.getName().contains("a"))
                .mapToInt(Person::getAge)
                .sum();

        System.out.println(ageSum);
    }
}

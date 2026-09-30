package LAMBDA;


import java.util.List;
import java.util.stream.Collectors;

public class chaining {
    public static void main(String[] args) {
        class person {
            int age;
            String name;


            person(int age, String name) {
                this.age = age;
                this.name = name;
            }
        }

            List<person> people = List.of(
                    new person(20, "anish"),
                    new person(30, "Max"),
                    new person(40, "hamilton")

            );
            List<String> names = people.stream()
                    .filter(n -> n.age >= 18)
                    .sorted((p1, p2) -> p1.age - p2.age)
                    .map(n -> n.name)
                    .collect(Collectors.toList());

        System.out.println(names);

        }
    }


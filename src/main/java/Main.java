
import java.util.List;
import java.util.function.Predicate;

public class Main {

    interface checkPerson{
        boolean test(Person p);
    }

    static class checkPersonEligibleForSelectiveSearch implements checkPerson {

        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.Male &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }


    public static void printPersonOlderThan(List<Person> people, int age){
        for (Person p: people) {
            if (p.getAge() >= age){
                p.printPerson();
            }
        }
    }

    public static void printPersonWithinAgeRange(
            List<Person> people, int low, int high){
            for (Person p :people){
                if(low <= p.getAge() && p.getAge() < high){
                    p.printPerson();
                }
            }
    }

    public static void printPeople(List<Person> people,
                                   checkPerson tester){
        for (Person p: people){
            if (tester.test(p)){
                p.printPerson();
            }
        }
    }

    public static void printPeopleWithPredicate(List<Person> people,
                                   Predicate<Person> tester){
        for (Person p: people){
            if (tester.test(p)){
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> people = Person.generateDefaultList();
        // printPersonWithinAgeRange(people, 20, 21);
        // printPeople(people, new checkPersonEligibleForSelectiveSearch());
        printPeople(people, new checkPerson() {
            @Override
            public boolean test(Person p) {
                return p.gender == Person.Sex.Male &&
                        p.getAge() >= 18 &&
                        p.getAge() <= 25;
            }
        });

        printPeople(people, (p) ->
            p.gender == Person.Sex.Male &&
                        p.getAge() >= 18 &&
                        p.getAge() <= 25
        );

        printPeopleWithPredicate(people, (p) ->
            p.gender == Person.Sex.Male &&
                        p.getAge() >= 18 &&
                        p.getAge() <= 25
        );
    }
}

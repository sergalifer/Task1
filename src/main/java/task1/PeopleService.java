package task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Sergey on 08.07.2017.
 */
public class PeopleService {
    public static List<Person> data() {
        List<Person> data = Arrays.asList(
                new Person(35, "Zlatan", 90),
                new Person(31, "Cristiano", 76),
                new Person(22, "Lorenzo", 78),
                new Person(29,"Diego",85),
                new Person(28, "Alexis",70));

        return data;
    }
    public static List<Person> getSortByWeightDown(List<Person> sortPeopleByWeight) {
        sortPeopleByWeight = data();
        Collections.sort(sortPeopleByWeight, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o2.getWeight() - o1.getWeight();
            }
        });
        return sortPeopleByWeight;
    }
    public static List<Person> getSortByWeightUp(List<Person> sortPeopleByWeight) {
        sortPeopleByWeight = data();
        Collections.sort(sortPeopleByWeight, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        return sortPeopleByWeight;
    }
    public static List<Person> getSortByAgeDown(List<Person> sortPeopleByAge) {
        sortPeopleByAge = data();
        Collections.sort(sortPeopleByAge, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        return sortPeopleByAge;
    }
    public static List<Person> getSortByAgeUp(List<Person> sortPeopleByAge) {
        sortPeopleByAge = data();
        Collections.sort(sortPeopleByAge, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        return sortPeopleByAge;
    }

    public static List<Person> getSortByName(List<Person> sortByName) {
        sortByName = data();
        Collections.sort(sortByName, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return sortByName;
    }
    public static void outByName() {
        for (int i = 0; i < getSortByName(data()).size(); i++) {
            System.out.println(getSortByName(data()).get(i).getName() + " " +
                    getSortByName(data()).get(i).getAge() + " " +
                    getSortByName(data()).get(i).getWeight());
        }
    }
    public static void outByAgeUp() {
        for (int i = 0; i < getSortByAgeUp(data()).size(); i++) {
            System.out.println(getSortByAgeUp(data()).get(i).getName() + " " +
                    getSortByAgeUp(data()).get(i).getAge() + " " +
                    getSortByAgeUp(data()).get(i).getWeight());
        }
    }
    public static void outByAgeDown() {
        for (int i = 0; i < getSortByAgeDown(data()).size(); i++) {
            System.out.println(getSortByAgeDown(data()).get(i).getName() + " " +
                    getSortByAgeDown(data()).get(i).getAge() + " " +
                    getSortByAgeDown(data()).get(i).getWeight());
        }
    }
    public static void outByWeightUp() {
        for (int i = 0; i < getSortByWeightUp(data()).size(); i++) {
            System.out.println(getSortByWeightUp(data()).get(i).getName() + " " +
                            getSortByWeightUp(data()).get(i).getAge() + " " +
                            getSortByWeightUp(data()).get(i).getWeight());
        }
    }
    public static void outByWeightDown() {
        for (int i = 0; i < getSortByWeightDown(data()).size(); i++) {
            System.out.println(
                    getSortByWeightDown(data()).get(i).getName() + " " +
                            getSortByWeightDown(data()).get(i).getAge() + " " +
                            getSortByWeightDown(data()).get(i).getWeight());
        }
    }
}

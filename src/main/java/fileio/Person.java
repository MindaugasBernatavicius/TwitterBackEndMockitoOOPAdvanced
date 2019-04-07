package fileio;

public class Person {
    int id, age, numberOfTimesVisitedLastYear;
    String name;

    public Person(){}

    public Person(int id, String name, int age, int numberOfTimesVisitedLastYear) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.numberOfTimesVisitedLastYear = numberOfTimesVisitedLastYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id +
                ", name='" + name +
                '\'' + ", age=" + age +
                ", numberOfTimesVisitedLastYear=" + numberOfTimesVisitedLastYear +
                '}';
    }
}

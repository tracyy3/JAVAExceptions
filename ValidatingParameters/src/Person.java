public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        if (name.isEmpty() || name == null || name.length() > 40) {
            throw new IllegalArgumentException("Invalid");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
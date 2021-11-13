package people;

public class Person {
    public int number;
    public int age;
    public String name;
    public String sex;


    public Person(int number, String name, String sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;

    }

    public Person(int number, String name, int age, String sex) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

    
    
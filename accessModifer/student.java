package accessModifer;

import java.util.Objects;

public class student {

    int id;
    String name;
    int age;

    public student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public static void main(String[] args) {
        student s1 = new student(420, "Gaya", 60);
        System.out.println(s1); // calls toString()
        System.out.println("HashCode: " + s1.hashCode());
    }
}

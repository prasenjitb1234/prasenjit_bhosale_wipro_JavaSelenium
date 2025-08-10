package day_7_assignment.passByValue_passByReference;

// 5. Write a Java program to pass an object to a method
//    and modify its internal fields. Verify that the changes reflect outside the method.

class Person {
    String name;
    int age;
}

public class ObjectPassDemo {

    static void modifyPerson(Person p) {
        System.out.println("Inside method, before modification: name = " + p.name + ", age = " + p.age);

        p.name = "Peter";
        p.age = 25;

        System.out.println("Inside method, after modification: name = " + p.name + ", age = " + p.age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Prasenjit";
        person.age = 21;

        System.out.println("Before method call: name = " + person.name + ", age = " + person.age);

        modifyPerson(person);

        System.out.println("After method call: name = " + person.name + ", age = " + person.age);
    }
}

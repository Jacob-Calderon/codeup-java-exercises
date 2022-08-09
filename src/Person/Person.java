package Person;

public class Person {
    private String name;

    public Person(String name){

        this.name = name;

    }
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Joan");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        Person person3 = new Person("John");
        Person person4 = new Person("joan");
        System.out.println(person3 == person4);

        Person person5 = new Person("John");
        Person person6 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person3.getName());
        System.out.println(person4.getName());
    }
   }
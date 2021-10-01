package question5N6;

public class Person {
    private String name;
    private int age;

    public  Person(int age){
       this.age = age;
    }


    public int setAge(int newAge) {
         return age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speaking(){
        System.out.println("Hello im a person obj created by Jordan Mitchell");

    }


}

package question5N6;

public class Kid extends Person{
    private String name;
    private int age;
    public boolean cancry;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int setAge(int age) {

        return age;
    }
    @Override
    public void speaking(){
        System.out.println("Im just a kid");
    }


    public Kid(int age) {
        super(age);
    }

}

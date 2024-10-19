package AbtractClass.Demo;

public class Customer extends Person {
    private String email;
    public Customer (String name , int age , String email){
        super(name,age);
        this.email = email;
    }
    @Override
    public String getInfo(){
        return "name " + super.getName() + "age" + super.getAge() + "email" + email;
    }
}

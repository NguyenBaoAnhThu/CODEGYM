package AbtractClass.Demo;

public class User extends Person {
    protected User(String name , int age ){
        super(name,age);
    }

    @Override
    public String getInfo(){
        return "User:{ name : " + name + ",age :" + age + "}";
    }
}

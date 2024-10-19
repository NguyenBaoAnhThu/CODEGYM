package AbtractClass.Demo;

public class Student extends Person {
    private String group ;
    public Student(String name , int age , String group){
        super(name,age);
        this.group = group;
    }
    @Override
    public String getInfo(){
        return "Student : { name :" + super.getName() + "age : " + super.getAge() + "group" + group +"}";
    }
}

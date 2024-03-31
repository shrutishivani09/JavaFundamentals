package oops;

class Person{
    private String firstName;
    private String secondName;

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
}
public class EncapsulationExample {
    public static void main(String[] args){

        Person person = new Person();
        person.setFirstName("Shruti");
        System.out.println(person.getFirstName());
        person.setSecondName("Shivani");
        System.out.println(person.getSecondName());
    }
}

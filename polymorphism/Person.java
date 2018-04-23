public class Person{
    private String name; 
    private int age; 

    public Person(String name, int age){
        this.name = name; 
        this.age = age; 
    }

    public void printInfo(){
        System.out.println(
            "name: " + getName()
            + "\nage: " + getAge()
        ); 
    }

    public String getName(){
        return name; 
    }
    public int getAge(){
        return age; 
    }
}
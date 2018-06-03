public class Teacher extends Person {
    //inherits name and age 
    String office;

    public Teacher(String name, int age, String office) {
        super(name, age);
        this.office = office;
    }

    //overrides Person.printInfo()
    public void printInfo() {
        System.out.println(
            "name: " + getName() 
            + "\nage: " + getAge() 
            + "\nteachers office: " + getOffice()
        );
    }

    public String getOffice() {
        return office;
    }
}
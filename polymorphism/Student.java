public class Student extends Person{
    //inherits name and age 
    String studentId; 

    public Student(String name, int age, String studentId){
        super(name, age); 
        this.studentId = studentId; 
    }
    
    //overrides Person.printInfo()
    public void printInfo() {
        System.out.println(
                "name: " + getName() 
            + "\nage: " + getAge()
            + "\nstudent ID: " + getStudentId()
        ); 
    }
    

    public String getStudentId(){
        return studentId; 
    }
}
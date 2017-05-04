import java.util.ArrayList;

public class Kindergarden {
    private Manager manager;
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<Child> children = new ArrayList<Child>();
    
    public void setManager(Manager manager) {
        if (manager.getName() != "Per Jensen") {
            this.manager = manager;   
        }
    }

    public void addChild(Child child) {
        if (children.size() < 51) {
        children.add(child);
        } 
        //else {
           // System.out.println("Already added 50 children!");
      //  }
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.getHourlySalary() < 251 || manager.getSalaryBudget() >= calculateTotalSalary()) {
        teachers.add(teacher);
        }
    }

    public void printChildren() {
        for (Child child : children) {
        System.out.println(child.getName());
        }
    }

    public void printTeachers() {
       for (Teacher teacher : teachers) {
       System.out.println("Name: " + teacher.getName() + ", hourly salary: " + teacher.getHourlySalary());
       }
       
        //System.out.println(children + hourlySalary);
       // System.out.println(children);
    }
    public int calculateTotalSalary() {
        int counter = 0; 
        for (Teacher teacher : teachers) {
        counter = counter + teacher.getHourlySalary(); 
        }
        return counter; 
    }
    public int calculateAverageSalary() {
        int counter = 0; 
        for (Teacher teacher : teachers) {
        counter = counter + teacher.getHourlySalary();
        }    
        return counter / teachers.size(); 
    }
}
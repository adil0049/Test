public class Manager {
    private String name; 
    private int salaryBudget; 

    public Manager(String name, int salaryBudget) {
        this.name = name; 
        this.salaryBudget = salaryBudget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalaryBudget(int salaryBudget) {
        this.salaryBudget = salaryBudget;
    }

    public String getName() {
        return name;
    }

    public int getSalaryBudget() {
        return salaryBudget;
    }
}
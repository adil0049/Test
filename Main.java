public class Main {
    public static void main(String[] args) {

        Child child1 = new Child("Per");
        Child child2 = new Child("Hanne");
        Child child3 = new Child("Hubert");
        Child child4 = new Child("Caroline");

        Teacher teacher1 = new Teacher();
        teacher1.setName("Jens Heriksen");
        teacher1.setHourlySalary(180);

        Teacher teacher2 = new Teacher();
        teacher2.setName("Helle Petersen");
        teacher2.setHourlySalary(185);

        Manager manager = new Manager("Hans", 400);

        Kindergarden kindergarden = new Kindergarden();
        kindergarden.setManager(manager);
        kindergarden.addTeacher(teacher1);
        kindergarden.addTeacher(teacher2);
        kindergarden.addChild(child1);
        kindergarden.addChild(child2);
        kindergarden.addChild(child3);
        kindergarden.addChild(child4);

        kindergarden.printChildren();
        kindergarden.printTeachers();

        System.out.println(kindergarden.calculateAverageSalary());
    }

}
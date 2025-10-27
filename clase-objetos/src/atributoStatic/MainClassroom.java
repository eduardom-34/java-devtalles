package atributoStatic;

public class MainClassroom {

    public static void main(String[] args) {
        Classroom student1 = new Classroom("Maria");
        Classroom student2 = new Classroom("Juan");

        student2.showInfo();
        student1.showInfo();

        Classroom.setSchoolName("Escuela 2");

        student1.showInfo();
        student2.showInfo();
    }

}

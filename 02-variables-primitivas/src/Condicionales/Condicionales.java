package Condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int age = 19;
        double average = 7.5;

        boolean isadult = age > 16;
        boolean hasPassingGrade = average >= 7;

        if( isadult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requisitos");
        }

        if(isadult == false ){
            System.out.println("Es un adulto");
        }

        //comentarios
        /*
        int day = 30;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("El dato ingresado no se valido");
        }
        */
    }
}

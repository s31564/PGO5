import java.util.ArrayList;
import java.util.List;

public class Studenci {
    private static List<Student> listaStudentow = new ArrayList<>();

    public static void dodajStudenta(Student student) {
        listaStudentow.add(student);
    }

    public static void promujWszystkichStudentow() {
        for (Student student : listaStudentow) {
            student.promujNaNastepnySemestr();
        }
    }

    public static void pokazInfoOSudentach() {
        for (Student student : listaStudentow) {
            System.out.println("Numer Indeksu: " + student.getNumerIndeksu());
            System.out.println("Semestr: " + student.getSemestr());
            System.out.println("Status: " + student.getStatus());
            System.out.println();
        }
    }
}

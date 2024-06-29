import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int ostatniIndeks = 0;

    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;
    private String email;
    private String adres;
    private String numerIndeksu;
    private String status;
    private int semestr;
    private List<Ocena> oceny;
    private ProgramStudiow programStudiow;

    public Student(String imie, String nazwisko, String email, String adres, Date dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.adres = adres;
        this.dataUrodzenia = dataUrodzenia;
        this.numerIndeksu = unikalnyNumerIndeksu();
        this.status = "kandydat";
        this.semestr = 1;
        this.oceny = new ArrayList<>();
    }

    private String unikalnyNumerIndeksu() {
        ostatniIndeks++;
        return "s" + ostatniIndeks;
    }

    public void zapiszNaStudia(ProgramStudiow program) {
        this.programStudiow = program;
        this.status = "student";
    }

    public void dodajOcene(int ocena, String przedmiot) {
        this.oceny.add(new Ocena(przedmiot, ocena));
    }

    public void promujNaNastepnySemestr() {
        if (semestr < programStudiow.getLiczbaSemestrow()) {
            int liczbaITN = (int) oceny.stream().filter(ocena -> ocena.getOcena() < 3).count();
            if (liczbaITN <= programStudiow.getDopuszczalnaLiczbaITN()) {
                semestr++;
            }
            if (semestr == programStudiow.getLiczbaSemestrow()) {
                status = "absolwent";
            }
        }
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public int getSemestr() {
        return semestr;
    }

    public String getStatus() {
        return status;
    }


}

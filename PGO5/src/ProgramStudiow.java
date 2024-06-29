public class ProgramStudiow {
    private String nazwa;
    private String opis;
    private int liczbaSemestrow;
    private int dopuszczalnaLiczbaITN;

    public ProgramStudiow(String nazwa, String opis, int liczbaSemestrow, int dopuszczalnaLiczbaITN) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.liczbaSemestrow = liczbaSemestrow;
        this.dopuszczalnaLiczbaITN = dopuszczalnaLiczbaITN;
    }

    public int getLiczbaSemestrow() {
        return liczbaSemestrow;
    }

    public int getDopuszczalnaLiczbaITN() {
        return dopuszczalnaLiczbaITN;
    }

}

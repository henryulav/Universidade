public class bolsistas extends estudantes {
    int bolsa;

    public bolsistas (String matri, int anoI, String curso, int bolsa) {
        super(matri, anoI, curso);
        this.bolsa = bolsa;
    }

    @Override
    double precoCopia() {
        return 0.07;
    }

    double qntCopias() {
        return bolsa / precoCopia();
    }

}

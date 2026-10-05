public abstract class estudantes {
    String matri;
    int anoI;
    String curso;

    public estudantes(String matri, int anoI, String curso) {
        this.matri = matri;
        this.anoI = anoI;
        this.curso = curso;
    }

    double precoCopia() {
        return 0.10;
    }
}

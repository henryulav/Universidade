public class Main {
    static void main() {
       bolsistas b = new bolsistas("2613723",2026, "CC",2000);
       estudantes e = new estudantes("243554", 2023, "CC") {};

       System.out.println("BOLSISTAS");
       System.out.println("\nMatricula: " + b.matri);
       System.out.println("Ano de ingressão: " + b.anoI);
       System.out.println("Curso: " + b.curso);
       System.out.println("Bolsa: " + b.bolsa + " R$");
       System.out.println("Quantidade de copias: " + Math.floor(b.qntCopias()));
       System.out.println("\n====================================================");
       System.out.println("\nMatricula: " + e.matri);
       System.out.println("Ano de ingressão: " + e.anoI);
       System.out.println("Curso: " + e.curso);
    }
}

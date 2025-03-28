package jean.aulas.segundasemana;
public class BoletimEscolar {
    public static void main(String[] args) {
        int mediaFinal =5;
        if (mediaFinal < 6)
            System.err.println("REPROVADO");
        else if (mediaFinal == 6)
            System.err.println("PROVA MINERVA");
        else
            System.err.println("APROVADO");

    }
}
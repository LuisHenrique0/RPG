public class PersonagemCarol {
    String classe;
    int level;
    String habilidadePrincipal;

    public void mostrarStatusCarol() {
        System.out.format("Classe: %s\nLevel: %d\nHabilidade Principal: %s\n", classe, level, habilidadePrincipal);
    }

    void buffDruida(String aliadoCarol) {
        System.out.println("Concede 20% de regeneração de vida!");
    }

    void ataqueDruida(String baiacu) {
        System.out.println("Carol usa sua habilidade principal para invocar um baiacu celestial e atacar o inimigo!");
    }

    public void buffMago(String aliadoLuis) {
        System.out.println("Recebe 10% de regeneração de mana de Luis!");
    }

}
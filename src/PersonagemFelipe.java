public class PersonagemFelipe {
    String classe;
    int level;
    String habilidadePrincipal;


    public void mostrarStatusFelipe() {
        System.out.format("Classe: %s\nLevel: %d\nHabilidade Principal: %s\n", classe, level, habilidadePrincipal);
    }

    public void buffMagoF(String aliadoFelipe) {
        System.out.println("Concede 15% de aumento de poder de habilidade!");
    }

    void ataqueMagof(String FamiliarFlamejante) {
        System.out.println("Felipe invoca uma centopéia flamejante para atacar o inimigo!");
    }

    public void buffAprendiz(String aliadoCarlos) {
        System.out.println("Recebe um impulso de inspiração de Carlos, aumentando a inteligência em 10% por dois turnos!");


    }
}
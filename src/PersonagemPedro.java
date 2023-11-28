public class PersonagemPedro {
    String classe;
    int level;
    String habilidadePrincipal;

    public void mostrarStatusPedro() {
        System.out.format("Classe: %s\nLevel: %d\nHabilidade Principal: %s\n", classe, level, habilidadePrincipal);
    }

    public void buffArqueiroElfico(String aliadoPedro) {
        System.out.println("Concede 25% de aumento de precisão de ataque!");

    }
        void ataqueArqueiroElfico(String habilidadeArqueiroElfico){
            System.out.println("Pedro usa sua habilidade principal, atirando uma flechas de trilhas celestiais!");
        }


    public void buffBerserker(String aliadoAugusto) {
        System.out.println("Augusto concedeu 15% de dano extra!");

    }

}
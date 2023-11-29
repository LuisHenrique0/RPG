public class PersonagemAugusto {
    String classe;
    int level;
    String habilidadePrincipal;

        public PersonagemAugusto() {
        }

        public void mostrarStatusAugusto() {
            System.out.format("Classe: %s\nLevel: %d\nHabilidade Principal: %s\n", classe, level, habilidadePrincipal);
        }

       public void buffBerserker(String aliadoAugusto) {
            System.out.println("Concede 15% de dano extra!");
        }

        void ataqueBerserker(String aliadoAugusto) {
            System.out.println("Augusto ativa sua habilidade principal, atacando freneticamente o inimigo com seu machado!");
        }

    public void buffArqueiroElfico(String aliadoPedro) {
        System.out.println("Pedro concede 25% de aumento de precisão de ataque!");

    }
}
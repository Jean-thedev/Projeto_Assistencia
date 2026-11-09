public class App {
    public static void main(String[] args) throws Exception {
        ServicoDomiciliar sd1 = new ServicoDomiciliar("Ajeitar a pia da cozinha", 5.5, 5);
        ServicoUrgente su1 = new ServicoUrgente("Meu cano explodiu", 50.6);
        Orcamento o1 = new Orcamento();

        o1.adicionarServico(sd1);
        o1.adicionarServico(su1);

        o1.listarServico();
        


    }
}

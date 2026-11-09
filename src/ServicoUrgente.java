public class ServicoUrgente extends servico{

    public ServicoUrgente(String descricao, double valorBase) {
        super(descricao, valorBase);
    }

    @Override 
    public double calcularValor(){
        return super.calcularValor() * 0.7;
    }

}

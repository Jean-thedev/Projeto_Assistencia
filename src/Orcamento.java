import java.util.ArrayList;

public class Orcamento {
    private ArrayList<servico> servicos = new ArrayList<servico>();
    public Orcamento(){

    }

    public void adicionarServico(servico s){
        servicos.add(s);
    }

    public void listarServico(){
        for (servico servico : servicos) {
            System.out.println("Descrição: "+servico.getDescricao());
            System.out.println("Valor Base: "+servico.getValorBase());
            System.out.println("Valor Completo: "+ servico.calcularValor());
        }
    }

    public double calcularTotal(){
        if(servicos == null){
            return 0;
        }
        double total = 0.0;
        for (servico servicos : servicos) {
            total += servicos.calcularValor();
        }
        return total;
    }


}

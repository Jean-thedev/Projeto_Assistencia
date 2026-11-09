public class ServicoDomiciliar extends servico {
    private double distanciaKm;

    public ServicoDomiciliar(String descricao, double valorBase, double distanciaKm) {
        super(descricao, valorBase);
        this.distanciaKm = distanciaKm;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcularValor(){
        if (distanciaKm<=10){
            return super.calcularValor() + 15.0;
        }
        else{
            return super.getValorBase() + 30.0;
        }
    }

    


}

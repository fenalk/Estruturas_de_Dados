import java.util.ArrayList;

public class FiladeProcessos {
    private ArrayList<Processo> fila;

    public FiladeProcessos(){
        this.fila=new ArrayList<>();
    }

    public void adicionarProcesso(Processo processo){
        fila.add(processo);

    }
    public void TirarProcessoMaiorEspera(){
        if (fila.isEmpty()){
            System.out.println("Não há processos para tirar.");
            return;
        }

        Processo processoMaiorEspera = null;
        
        for (Processo p: fila) { 
        if (processoMaiorEspera == null || p.getEspera()>processoMaiorEspera.getEspera()){
            processoMaiorEspera=p;
        }
    }
    if (processoMaiorEspera != null){
        fila.remove(processoMaiorEspera);
        System.out.println("Processo Finalizado:"+processoMaiorEspera);
        }
    }
    public void executarProcesso(){
        if (fila.isEmpty()){
            System.out.println("Não há processos para executar");
            return;
        }

        Processo processo = fila.remove(0);
        System.out.println("Processo executado:"+ processo);

    }
    public void imprimirProcessos(){
        if (fila.isEmpty()){
            System.out.println("Não tem processos na fila.");
            return;
        }

        System.out.println("Processos na fila:");
        for (Processo p : fila){
            System.out.println(p);
        }
    }
}

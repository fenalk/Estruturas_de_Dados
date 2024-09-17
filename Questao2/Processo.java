public class Processo{
    private int id;
    private String nome;
    private int prioridade;
    private int tempo_espera;


    public Processo (int id, String nome, int prioridade, int tempo_espera){
        this.id=id;
        this.nome=nome;
        this.prioridade=prioridade;
        this.tempo_espera=tempo_espera;

    }
   public int getEspera(){
    return tempo_espera;
   } 

   @Override 
   public String toString(){
        return "ID:" + id + ", NOME: " + nome + ", PRIORIDADE: " + 
        prioridade + ", TEMPO DE ESPERA: " + tempo_espera; }
    



}

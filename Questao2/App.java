public class App {
    public static void main(String[] args) {
        FiladeProcessos fila = new FiladeProcessos();

        fila.adicionarProcesso(new Processo(105, "Bloco de notas", 7, 10));
        fila.adicionarProcesso(new Processo(110, "Navegador", 3,30));
        fila.adicionarProcesso(new Processo(107, "Editor de texto", 4, 20));
        
        fila.imprimirProcessos();

        fila.TirarProcessoMaiorEspera();

        fila.executarProcesso();

        fila.imprimirProcessos();
    }
}

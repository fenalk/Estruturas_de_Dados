public class Contato {
    char[] nome = new char[80]; 
    int telefone;
    char[] email = new char[80]; 
    Contato proximo; 

    public Contato(String nomeStr, int telefone, String emailStr) {
        for (int i = 0; i < nomeStr.length() && i < 80; i++) {
            nome[i] = nomeStr.charAt(i);
        }

        for (int i = 0; i < emailStr.length() && i < 80; i++) {
            email[i] = emailStr.charAt(i);
        }

        this.telefone = telefone;
        this.proximo = null; 
    }

    public void exibirContato() {
        System.out.println("\nNome: " + new String(nome).trim()); 
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + new String(email).trim()); 
        System.out.println("---------------------------\n");
    }
}

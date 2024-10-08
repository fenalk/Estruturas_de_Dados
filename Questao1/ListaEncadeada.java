public class ListaEncadeada {
    private Contato primeiro;

    public ListaEncadeada() {
        this.primeiro = null; 
    }

    public void incluirContato(String nome, int telefone, String email) {
        Contato novoContato = new Contato(nome, telefone, email);

        if (primeiro == null) {
            primeiro = novoContato; 
        } else {
            Contato atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoContato; 
        }
        System.out.println("Contato incluído com sucesso!");
    }

    public void removerContato(int telefone) {
        Contato atual = primeiro;
        Contato anterior = null;

        while (atual != null && atual.telefone != telefone) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Contato não encontrado!");
            return;
        }

        if (anterior == null) {
            primeiro = atual.proximo; 
        } else {
            anterior.proximo = atual.proximo;
        }

        System.out.println("Contato removido com sucesso!");
    }

    public void listarContatos() {
        if (primeiro == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        Contato atual = primeiro;
        while (atual != null) {
            atual.exibirContato();
            atual = atual.proximo;
        }
    }

    public void pesquisarContato(int telefone) {
        Contato atual = primeiro;

        while (atual != null) {
            if (atual.telefone == telefone) {
                System.out.println("Contato encontrado:");
                atual.exibirContato();
                return;
            }
            atual = atual.proximo;
        }

        System.out.println("Contato não encontrado.");
    }

    public void mostrarContatosComValor(int telefone) {
        Contato atual = primeiro;
        boolean encontrado = false;
        boolean repetido = false;
        int contadorRepetido = 0;

        while (atual != null) {
            if (atual.telefone == telefone) {
                atual.exibirContato();
                encontrado = true;
                contadorRepetido++; 
            }
            atual = atual.proximo;
        }

        if (!encontrado) {
            System.out.println("Nenhum contato com o telefone informado foi encontrado.");
        }

        if (contadorRepetido > 1) {
            System.out.println("Existem " + contadorRepetido + " contatos com o mesmo número de telefone.");
            repetido = true;
        }

        if (!repetido) {
            System.out.println("Não há repetidos para o número de telefone informado.");
        }
    }

    public void removerContatosRepetidos() {
        Contato atual = primeiro;

        while (atual != null && atual.proximo != null) {
            Contato comparador = atual;
            while (comparador.proximo != null) {
                if (atual.telefone == comparador.proximo.telefone) {
                    comparador.proximo = comparador.proximo.proximo;
                    System.out.println("Contato repetido removido.");
                } else {
                    comparador = comparador.proximo;
                }
            }
            atual = atual.proximo;
        }
        System.out.println("Contatos repetidos removidos.");
    }
}

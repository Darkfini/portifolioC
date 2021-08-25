package locadora;

public class Locadora {
    
    public static void main(String[] args) {
        Banco.cria_tabela("Dvd", "cod int primary key", "estoque int", "diretor varchar", "producao varchar", "genero varchar", "prazo varchar");

        Dvd l = new Dvd();
        l.setCod(1547);
        l.setEstoque(4);
        l.setDiretor("James Cameron");
        l.setProducao("pacific western");
        l.setGenero("Ação");
        l.setPrazo("7 dias");
        Banco.salvar(l);

        Banco.visualiza_tabela("Dvd", "cod", "estoque", "diretor", "producao", "genero", "prazo");
    }
}

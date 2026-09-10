package br.ufpb.dcx.poo.biblioteca.demo;
import br.ufpb.dcx.poo.biblioteca.Fabrica;
import br.ufpb.dcx.poo.biblioteca.contrato.Biblioteca;
import br.ufpb.dcx.poo.biblioteca.contrato.excecoes.BibliotecaException;
public class DemoDefeito {
    public static void main(String[] args) throws BibliotecaException {
        Biblioteca biblioteca = Fabrica.novaBiblioteca();
        biblioteca.acervo().cadastrarItem("L1", "POO em Java",
                "Ayla", "livro", 2020);
        String codigo = new StringBuilder("L").append(1).toString();
        biblioteca.acervo().buscarItem(codigo);
    }
}
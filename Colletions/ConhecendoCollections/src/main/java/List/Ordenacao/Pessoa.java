package List.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String Nome;
    private int idade;
    private int altura;

    public Pessoa(String nome, int idade, int altura) {
        Nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade,p.getIdade());
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    static class ComparatorPorAltura implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }

}

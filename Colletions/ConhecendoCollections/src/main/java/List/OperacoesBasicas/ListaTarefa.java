package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefasList;

    public ListaTarefa() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefasList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }
    public int obterTotal(){
        return tarefasList.size();
    }
    public void obterDescricoes(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O total de tarefas é: " + listaTarefa.obterTotal());

        listaTarefa.adicionarTarefa("Lavar a louça");
        listaTarefa.adicionarTarefa("Imprimir documentos");
        System.out.println("O total de tarefas é: " + listaTarefa.obterTotal());

        listaTarefa.removerTarefa("Lavar a louça");
        System.out.println("O total de tarefas é: " + listaTarefa.obterTotal());

        listaTarefa.obterDescricoes();
    }
}

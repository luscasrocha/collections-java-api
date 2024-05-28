package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //adicionando tarefa na lista
     public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
     }

     //removendo as tarefas da lista com essa descrição
     public void removerTarefa(String descricao) {
        //criando uma nova lista para inserir nela as tarefas que vai remover
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao))
            {
                tarefasParaRemover.add(t);
            }
        }
        //usar o removeAll ao invés do Remove pois se tiver mais de uma descrição com o mesmo nome não iria remover, apenas a primeira
        tarefaList.removeAll(tarefasParaRemover);
     }

     //descobrindo a quantidade de elementos que tem dentro da lista
     public int obterNumeroTotalTarefas() {
        return tarefaList.size();
     }

     //imprimindo a lista de tarefas
     public void obterDescricoesTarefas(){
         System.out.println(tarefaList);
     }

    public static void main(String[] args) {
        //criando objeto
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O nº total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //testando add
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O nº total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //testando remover
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O nº total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //testando listagem
        listaTarefa.obterDescricoesTarefas();
    }

}
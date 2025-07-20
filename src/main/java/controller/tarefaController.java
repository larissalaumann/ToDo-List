package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Tarefa;

public class tarefaController {
    
    private static List<Tarefa> tarefas = new ArrayList<>();

    public static void addTarefa(Tarefa t) {
        tarefas.add(t);
    }
    
    public static Tarefa getTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            return tarefas.get(index);
        }
        return null;
    }

    public static void editarTarefa(int index, Tarefa tarefaAtualizada) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.set(index, tarefaAtualizada);
        }
    }

    public static void excluirTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        }
    }
    
    public static List<Tarefa> getListaDeTarefas() {
        return tarefas;
    }
    
    public static void atualizarTabela(JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0); 

        for (Tarefa t : tarefas) {
            modelo.addRow(new Object[]{
                t.getTitulo(),
                t.getDescricao(),
                t.getData(),
                t.isConcluida()
            });
        }
    }
}

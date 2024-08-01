package ListOperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	//atributo
	
	 private List<Tarefa> tarefaList;
	 
	 public ListaTarefa() {
		 this.tarefaList = new ArrayList<>();
		 
	 }

	 public void adicionarTarefa(String descricao) {
		 tarefaList.add(new Tarefa(descricao));
		 }
	 
	 public void removerTarefa(String descricao) {
		 List<Tarefa> tarefasParaRemover = new ArrayList<>();
		 for(Tarefa t : tarefaList) {
		 if(t.getDescricao().equalsIgnoreCase(descricao)) {
			 
		 }
		 
	 }
         tarefaList.removeAll(tarefasParaRemover);
	 }
	public int obterNumeroTotalTarefa() {
		return tarefaList.size();
}
	public void obterDescricao() {
		System.out.println(tarefaList);
	
	
}
   }
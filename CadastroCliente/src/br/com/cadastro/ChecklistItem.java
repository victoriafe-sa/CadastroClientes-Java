package br.com.cadastro;

public class ChecklistItem {

		private String descricao;
		private boolean concluido;
		
		public ChecklistItem(String descricao) {
			this.descricao = descricao;
			this.concluido = false;
		}
		
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		public Boolean isConcluido() {
			return concluido;
		}
		public void setConcluido(boolean concluido) {
			this.concluido = concluido;
		}
		
		@Override
		public String toString() {
			return "ChecklistItem [descricao=" + descricao + ", concluido=" + concluido + "]";
		}
}

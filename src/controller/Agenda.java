package controller;

import model.contato;

public class Agenda {
	
	private ArrayList<Contato> contatos;
	
	public Agenda(){
			
	}

	public Contato pesquisar(final String nome){
		for(Contato c : this.contatos){
			if(c.getNome().equals(nome)){
				return c;
			}
		}
		return null;
	}
	public boolean adicionarContatos(final Contato contato){
		if(pesquisar(contato.getNome()) == null){
			this.contatos.add(contato);
			return true;
		}
		else{
			System.out.println("O Contato ja existe!!");
			return false;
		}
	}
}

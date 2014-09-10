package controller;

import java.util.ArrayList;

import model.Contato;

public class Agenda {
	
	private ArrayList<Contato> contatos;
	
	public Agenda(){
			
	}

	public Contato pesquisar(String nome){
		for(Contato c : this.contatos){
			if(c.getNome().equals(nome)){
				return c;
			}
		}
		return null;
	}
	public boolean adicionarContatos(Contato contato){
		if(pesquisar(contato.getNome()) == null){
			this.contatos.add(contato);
			return true;
		}
		return false;
	}
}

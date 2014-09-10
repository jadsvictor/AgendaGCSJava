package controller;

import java.util.ArrayList;

import model.Contato;

public class Agenda {
	
	private ArrayList<Contato> contatos;
	
	public Agenda(){
			this.contatos = new ArrayList<Contato>();
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
	
	public boolean deletarContato(final String nome){
		for(Contato c : contatos){
			if(c.getNome().equals(nome)){
				this.contatos.remove(c);
				return true;
			}
		}
		return false;
	}
}

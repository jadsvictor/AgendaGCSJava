import java.util.Scanner;

import model.Contato;
import controller.Agenda;



public class MainAgenda {
	
	static public void main(String args[]){
		
		System.out.println("Bem vindo a agenda Java.");
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		
		String nome;
		String telefone;
		String email;
		String endereco;
		int idade;
		
		Agenda agenda = new Agenda();
		
		do{
			System.out.println("Digite 1 para adicionar um contato");
			System.out.println("Digite 2 para remover");
			System.out.println("Digite 3 para pesquisar");
			System.out.println("Digite 4 para sair");
			
			opcao = Integer.parseInt(scan.nextLine());
			
			switch(opcao){
				case 1:
					System.out.println("Digite o nome do contato:");
					nome = scan.nextLine();
					System.out.println("Digite o email do contato:");
					email = scan.nextLine();
					System.out.println("Digite o telefone do contato");
					telefone = scan.nextLine();
					System.out.println("Digite o endereco do contato");
					endereco = scan.nextLine();
					System.out.println("Digite a idade do contato");
					idade = Integer.parseInt(scan.nextLine());
					
					Contato contato = new Contato(nome, telefone, endereco, email, idade);
					agenda.adicionarContatos(contato);
					break;
				case 2:
					System.out.println("Digite o nome do contato");
					nome = scan.nextLine();
					
					boolean removido = agenda.deletarContato(nome);
					if(removido){
						System.out.println("Contato removido");
					}
					else {
						System.out.println("contato inexistente");
					}
					break;
				case 3:
					System.out.println("Digite o nome do contato");
					nome = scan.nextLine();
					
					Contato contatoEncontrado = agenda.pesquisar(nome);
					if(contatoEncontrado != null){
						System.out.println("Contato encontrado:");
						System.out.println(contatoEncontrado.toString());
					}
					else {
						System.out.println("contato nao encontrado");
					}
					break;
				case 4:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Essa opcao nao existe!");
					break;
			}
			
		}while(opcao != 4);
		
		
	}

}

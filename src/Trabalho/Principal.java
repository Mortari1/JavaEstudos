package Trabalho;
import java.util.*;

import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		//declarações globais
		Interface tela = new Interface();
		ControlaAluno controller = new ControlaAluno();
		int escolhaMenu;
		
		escolhaMenu = tela.menuPrincipal();
		
		while(escolhaMenu != 5) {
			
			switch(escolhaMenu) {
			
				case 1://cadastro de Aluno
					
					Aluno aluno = tela.novoAluno();
					if(controller.cadastrarAluno(aluno)) {
						tela.mostraMensagem("Aluno cadastrado com sucesso");
						tela.mostraAluno(aluno);
					}else {
						tela.mostraMensagem("Aluno não cadastrado, código já existente");
						tela.mostraAluno(aluno);
					}
					break;
				case 2://Listagem de aluno
					
					ArrayList<Aluno> alunosCadastrados = controller.listarTodos();
					tela.mostraMensagem("Listar Alunos cadastrados");
					tela.listarAluno(alunosCadastrados);
					break;
					
				case 3://Busca por código 
					int codigo = tela.lerCodigoAluno();
					Aluno aluno_buscado = controller.buscoAlunoCodigo(codigo);
					
					if(aluno_buscado == null) {
						tela.mostraMensagem("O aluno com o código: "+codigo+" não foi encontrado.");
					}else {
						tela.mostraMensagem("Aluno encontrado!");
						tela.mostraAluno(aluno_buscado);
					}
					break;
					
				case 4:
					int codigoDelet = tela.lerCodigoAluno();
					boolean removeu = controller.removeAlunoCodigo(codigoDelet);
					
					if(removeu) {
						tela.mostraMensagem("Aluno do código: "+codigoDelet+" removido com sucesso!");
					
					}else {
						tela.mostraMensagem("Aluno não encontrado, logo não removido!");
					}
					break;
					
					
			}
			
			escolhaMenu = tela.menuPrincipal();
			
		}
		
		tela.mostraMensagem("SAIR - Sistema encerrado");
		
	}

}

package Trabalho;
import java.util.*;
public class ControlaAluno {
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public ArrayList<Aluno> listarTodos(){
		return this.alunos;
	}
	
	public boolean cadastrarAluno(Aluno aluno) {
		boolean existe = verificarAlunoExistente(aluno);
		
		if(existe) {
			return false;
		}else {
			this.alunos.add(aluno);
			return true;
		}
	}
	
	public boolean verificarAlunoExistente(Aluno aluno) {
		
		Aluno alunoComparado = new Aluno();
		alunoComparado = aluno;
		if(this.alunos.equals(alunoComparado)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public Aluno buscoAlunoCodigo(int codigo_busca) {
		Aluno aluno_buscado = new Aluno();
		aluno_buscado.setCodigo(codigo_busca);
		int contador = 0;
		boolean existe = false;
		for(Aluno i: alunos) {
			
				if(i.equals(aluno_buscado)) {
					
					aluno_buscado = alunos.get(contador);
					existe = true;
					break;
				}else {
					
					aluno_buscado = null;
					existe = false;
					
				}
			
			
		}
		
		if(existe) {
			return aluno_buscado;
		}else {
			return aluno_buscado;
		}
		
	}
	
	public boolean removeAlunoCodigo(int codigo_busca) {
		Aluno aluno_removido = new Aluno();
		aluno_removido.setCodigo(codigo_busca);
		boolean existe = false;
		int contador = 0;
		for(Aluno i: alunos) {
			
			if(i.equals(aluno_removido)) {
				
				aluno_removido = alunos.get(contador);
				existe = true;
				break;
			}else {
				
				aluno_removido = null;
				existe = false;
				
			}
		}
		
		if(existe) {
			return alunos.remove(aluno_removido);
		
		}else {
			
			return false;
		}
			
		
		
	}
		
		
	}
	



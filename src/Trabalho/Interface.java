package Trabalho;
import java.util.*;
public class Interface {
	Scanner entrada = new Scanner(System.in);

	public int menuPrincipal() {
		int op;
		Scanner entrada = new Scanner(System.in);

		System.out.println("------------------------------------");
		System.out.println("----------   MENU   ----------------");
		System.out.println("------------------------------------");
		System.out.println("1 - Cadastrar Aluno ");
		System.out.println("2 - Listar Aluno ");
		System.out.println("3 - Procurar Aluno ");
		System.out.println("4 - Deletar Aluno por Código ");
		System.out.println(" ");

		System.out.println("5 - SAIR ");

		op = entrada.nextInt();

		while (op > 5 || op <= 0) {

			System.out.println("------------------------------------");
			System.out.println("----------   MENU   ----------------");
			System.out.println("------------------------------------");
			System.out.println("1 - Cadastrar Aluno ");
			System.out.println("2 - Listar Aluno ");
			System.out.println("3 - Procurar Aluno por Código ");
			System.out.println("4 - Deletar Aluno por Código ");
			System.out.println(" ");

			System.out.println("5 - SAIR ");
			op = entrada.nextInt();

		}
		return op;
	}
	
	public int lerCodigoAluno() {
		
		try {
			Scanner entrada = new Scanner(System.in);
			int code;
			System.out.println("Informe o código do aluno: ");
			code = entrada.nextInt();
			return code;
			
		}catch (InputMismatchException e) {
			System.out.println("Caracter invalido!");
			return 0;
		
		}catch (NumberFormatException e) {
			System.out.println("Numero invalido");
			return 0;
		}
		
		
	}
	
	public int lerSexoAluno() {
		try {
			Scanner entrada = new Scanner(System.in);
			int gender;
			System.out.println("Informe o sexo 1- Masculino 2 - Feminino: ");
			gender = entrada.nextInt();
			return gender;
			
		}catch(InputMismatchException e) {
			System.out.println("caracter invalido");
			return 0;
		
		}catch (NumberFormatException e) {
			System.out.println("Deve ser um número!");
			return 0;
		}
		
	}
	
	public String lerNomeAluno() {
		Scanner entrada = new Scanner(System.in);
		String name;
		System.out.println("Informe o nome do aluno: ");
		name = entrada.nextLine();
		return name;
		
	}
	
	public String lerEmailAluno() {
		Scanner entrada = new Scanner(System.in);
		String mail;
		System.out.println("inform o e-mail do aluno: ");
		mail = entrada.nextLine();
		return mail;
	}
	
	public double lerPesoAluno() {
		Scanner entrada = new Scanner(System.in);
		try {
			
			double weight;
			System.out.println("informe o peso(kg): ");
			weight = entrada.nextDouble();
			return weight;
			
		}catch (InputMismatchException e) {//fiz esse tryCatch pq tava digitando com . e ele não aceitava
			System.out.println("Era pra eu ser dobule, mas sou int!!");
			return 0.0;
		}catch(NumberFormatException e) {
			System.out.println("Numero invalido!");
			return 0.0;
			
		}
		
		
		
	}
	
	public double lerAlturaAluno() {
		try {
			
			Scanner entrada = new Scanner(System.in);
			
			double height;
			System.out.println("Infore a altura(m): ");
			height = entrada.nextDouble();
			
			return height;
		
		}catch(InputMismatchException e) {
			System.out.println("Caracter invalido!");
			return 0.0;
			
		}catch(NumberFormatException e) {
			System.out.println("Numero Invalido!");
			return 0.0;
		}
		
		
	}
	
	public void listarAluno(Aluno aluno) {
		aluno.toString();
	}
	
	public Aluno novoAluno() {
		Aluno aluno;
		int codeAl;
		String nomeAl, emailAl;
		double pesoAl, alturaAL;
		int sexoAL;
		
		codeAl = lerCodigoAluno();
		while(codeAl <= 0) {
			codeAl = lerCodigoAluno();
		}
		
		nomeAl = lerNomeAluno();
		while(nomeAl.indexOf(' ') == -1) {
			nomeAl = lerNomeAluno();
		}
		
		emailAl = lerEmailAluno();
		while(emailAl.indexOf('@') == -1) {
			emailAl = lerEmailAluno();
		}
		
		pesoAl = lerPesoAluno();
		while(pesoAl <= 0) {
			pesoAl = lerPesoAluno();
		}
		alturaAL = lerAlturaAluno();
		while(alturaAL <= 0) {
			alturaAL = lerAlturaAluno();
		}
		sexoAL = lerSexoAluno();
		while(sexoAL != 1 && sexoAL !=2) {
			sexoAL = lerSexoAluno();
		}
		
		aluno = new Aluno(codeAl, nomeAl, emailAl, pesoAl, alturaAL, sexoAL);
		
		return aluno;
		
		
	}
	
	public void listarAluno(ArrayList<Aluno> alunos) {
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
		
	}
	
	public void mostraAluno(Aluno aluno) {
		
		System.out.println(aluno.toString());
	}
	
	public void mostraMensagem(String msg) {
		System.out.println("-------------");
		System.out.println(msg);
		System.out.println("-------------");
	}
	
}

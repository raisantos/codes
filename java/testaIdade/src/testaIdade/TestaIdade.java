package testaIdade;

public class TestaIdade {

	public static void main(String[] args) {
		//imprime idade
		int idade = 20;
		boolean amigoDoDono = true;
		
		System.out.println(idade);
		
		//gera idade no ano que vem
		int idadeNoAnoQueVem = idade +1;
		
		System.out.println(idadeNoAnoQueVem);
		
		if (idade < 18 && amigoDoDono == false) {
			System.out.println("Nao eh amigo do dono");
		}
		else {
			System.out.println("Eh amigo do Dono!");
		}
	}

}

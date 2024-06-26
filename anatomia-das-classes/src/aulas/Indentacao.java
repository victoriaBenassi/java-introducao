package aulas;
public class Indentacao {
    
    public static void main(String[] args) {
        //exemplo de codigo com indentação
		int mediaFinal = 7;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
        
//exemplo sem indentação
mediaFinal = 6;
if(mediaFinal<6)	
System.out.println("REPROVADO"); 
else if(mediaFinal==6)
System.out.println("PROVA MINERVA"); 
else
System.out.println("APROVADO"); 	
    }
}

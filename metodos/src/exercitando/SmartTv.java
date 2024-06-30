package exercitando;
/*Exercitando

Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
-Ela tenha as características: ligada (boolean), canal (int) e volume (int);
-Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
-Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
-Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
 */

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligar (){
        ligada = true;
        System.out.println("TV foi ligada");
    }

    public void desligar (){
        ligada = false;
        System.out.println("TV foi desligada");
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("O volume foi aumentado para : " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("O volume foi diminuido  para : " + volume);
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("o canal foi alterado para : "+novoCanal);;
    }
    public void aumentarCanal (){
        canal++;
        System.out.println("o canal foi aumentado para : "+ canal);
    }
    public void diminuirCanal (){
        canal--;
        System.out.println("o canal foi diminuido para : "+ canal);
    }
}

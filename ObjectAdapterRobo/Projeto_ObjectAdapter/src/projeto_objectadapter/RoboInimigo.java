package projeto_objectadapter;
import java.util.Random;
public class RoboInimigo {
    
    Random generator = new Random();
    
    public void esmagarComAsMaos(){
        
        int danoDeAtaque = generator.nextInt(10) + 1;
        System.out.println("O robô inimigo causou " + danoDeAtaque + " de dano com as mãos.");
    }
    
    public void andandoParaFrente(){
        int movimento = generator.nextInt(5)+1;
        
        System.out.println("O robô inimigo avançou " + movimento + " espaços.");
    }
    
    public void reacaoHumana(String nomeDoMotorista){
        System.out.println("Robô inimigo se aproxima de " + nomeDoMotorista + ".");
    }
    
}

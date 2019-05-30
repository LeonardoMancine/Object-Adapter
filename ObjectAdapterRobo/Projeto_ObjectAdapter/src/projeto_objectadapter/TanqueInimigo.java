package projeto_objectadapter;
import java.util.Random;
public class TanqueInimigo implements AtaqueDoInimigo {

    Random generator = new Random();
    
    @Override
    public void armaDeFogo() {
        
        int danoDeAtaque = generator.nextInt(10) + 1;
        System.out.println("Tanque inimigo causou " + danoDeAtaque + " de dano.");
    }

    @Override
    public void avançar() {
        
        int movement = generator.nextInt(5) + 1;
        System.out.println("O tanque inimigo avançou " + movement + " espaços.");
        
    }

    @Override
    public void motorista(String nomeDoMotorista) {
        System.out.println(nomeDoMotorista +" é o motorista do tanque.");
    }
    
}

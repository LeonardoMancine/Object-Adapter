package projeto_objectadapter;
public class Projeto_ObjectAdapter {
    public static void main(String[] args) {
        
        TanqueInimigo tanque = new TanqueInimigo();
        
        RoboInimigo tRobo = new RoboInimigo();
        
        AtaqueDoInimigo robAda = new InimigoRoboAdapter(tRobo);
        
        System.out.println("Robô");
        System.out.println("=============================");
        System.out.println("Robô sem o Adapter");
        System.out.println("-----------------------------");
        
        tRobo.reacaoHumana("Paul");
        tRobo.andandoParaFrente();
        tRobo.esmagarComAsMaos();
        
        System.out.println(" ");
        System.out.println("O tanque inimigo se aproxima.");
        System.out.println("=============================");
        System.out.println("Robô com o Adapter");
        System.out.println("-----------------------------");
        
        robAda.motorista("Mark");
        robAda.avançar();
        robAda.armaDeFogo();
    }
    
}

package projeto_objectadapter;
public class InimigoRoboAdapter implements AtaqueDoInimigo {

    RoboInimigo Robo;
    
    public InimigoRoboAdapter(RoboInimigo novoRobo){
        Robo = novoRobo;
    }
        
    @Override
    public void armaDeFogo() {
        Robo.esmagarComAsMaos();
    }

    @Override
    public void avançar() {
        Robo.andandoParaFrente();
    }
    

    @Override
    public void motorista(String nomeDoMotorista) {
        Robo.reacaoHumana(nomeDoMotorista);
    }
    
    
}

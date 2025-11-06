public class Engine {
    public void start(){
        System.out.println("El motor está encendido");
    }

    public void start(boolean silentMode){
        if (silentMode){
            System.out.println("Esta encendido en modo silencio");
        }else{
            System.out.println("Endendio el vehiculo");
        }
    }
}

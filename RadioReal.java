import java.util.EmptyStackException;

public class RadioReal implements Radio {

    double contAm = 530;
    double contFm = 87.9;
    Boolean frecuencia = false;
    double[] estaciones = new double[12];

    public void prenderRadio(){
        System.out.println("Radio encendida");
    }
	public void apagarRadio(){
        System.out.println("Radio apagada");
    }
	public void avanzarEstacion(){
        if(frecuencia){
            if(contAm==1610){
                contAm=530;
            }else{
                contAm+=10;
            }
            System.out.println(contAm+" AM");
        }else{
            if(contFm==107.9){
                contFm=81.9;
            }else{
                contFm+=0.2;
            }
            System.out.println(contFm+" FM");
        }
    }
	public void guardarEstacion(int numeroBoton){
        if(frecuencia){
            estaciones[numeroBoton]=contAm;
            System.out.println("Estación "+contAm+" AM guardada en botón "+numeroBoton);
        }else{
            estaciones[numeroBoton]=contFm;
            System.out.println("Estación "+contFm+" FM guardada en botón "+numeroBoton);

        }
    }
	public void cargarEstacion(int numeroBoton){
        double estacion = estaciones[numeroBoton];
        if(estacion%10==0){
            frecuencia=true;
            System.out.println(contAm+" AM");
        }
        else{
            frecuencia=false;
            System.out.println(contFm+" FM");
        }
    }
	public void cambiarFM(){
        frecuencia=false;
        System.out.println("Frecuencia Fm");
    }
	public void cambiarAM(){
        frecuencia=true;
        System.out.println("Frecuencia Fm");
    }
}
public class RadioReal implements Radio {
    int contAm = 530;
    double contFm = 87.9;
    Boolean frecuencia = false;

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
        }else{
            if(contFm==107.9){
                contFm=81.9;
            }else{
                contFm+=0.2;
            }
        }
    }
	public void guardarEstacion(int numeroBoton){

    }
	public void cargarEstacion(int numeroBoton){

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
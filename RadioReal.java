public class RadioReal implements Radio {

    double contAm = 530;
    double contFm = 87.9;
    boolean frecuencia = false; // false = FM, true = AM
    double[] estaciones = new double[12];

    public void prenderRadio(){
        System.out.println("Radio encendida");
    }

    public void apagarRadio(){
        System.out.println("Radio apagada");
    }

    public void avanzarEstacion(){
        if (frecuencia) { // AM
            if (contAm == 1610) {
                contAm = 530;
            } else {
                contAm += 10;
            }
            System.out.println((int) contAm + " AM");
        } else { // FM
            if (contFm == 107.9) {
                contFm = 87.9;
            } else {
                contFm += 0.2;
            }
            System.out.printf("%.1f FM%n", contFm);
        }
    }

    public void guardarEstacion(int numeroBoton){
        if (frecuencia) {
            estaciones[numeroBoton] = contAm;
            System.out.println((int) contAm + " AM guardada en botón " + numeroBoton);
        } else {
            estaciones[numeroBoton] = contFm;
            System.out.printf("%.1f FM guardada en botón %d%n", contFm, numeroBoton);
        }
    }

    public void cargarEstacion(int numeroBoton){
        double estacion = estaciones[numeroBoton];

        if (estacion % 10 == 0) { // AM
            frecuencia = true;
            contAm = estacion;
            System.out.println((int) contAm + " AM");
        } else { // FM
            frecuencia = false;
            contFm = estacion;
            System.out.printf("%.1f FM%n", contFm);
        }
    }

    public void cambiarFM(){
        frecuencia = false;
        System.out.println("Frecuencia FM");
        System.out.printf("%.1f FM%n", contFm);
    }

    public void cambiarAM(){
        frecuencia = true;
        System.out.println("Frecuencia AM");
        System.out.println((int) contAm + " AM");
    }
}

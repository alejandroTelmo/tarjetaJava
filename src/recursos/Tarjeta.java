package recursos;

import java.time.LocalDate;


public abstract class Tarjeta {
    private int numeroFrente;
    private int codigoDeSeguridad;
    private LocalDate fechaDeExpiracion;

    public Tarjeta(int numeroFrente, int codigoDeSeguridad, LocalDate fechaDeExpiracion) {
        this.numeroFrente = numeroFrente;
        this.codigoDeSeguridad = codigoDeSeguridad;
        this.fechaDeExpiracion = fechaDeExpiracion;
    }
    public boolean validacionDeFechaDeExpiracion(){
        if(this.fechaDeExpiracion.compareTo(LocalDate.now())>0)
            return true;

        return false;
    }
    public abstract boolean autorizacion( Double monto);

    public int getNumeroFrente() {
        return numeroFrente;
    }

    public int getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    public LocalDate getFechaDeExpiracion() {
        return fechaDeExpiracion;
    }
}

package recursos;

import java.time.LocalDate;

public class TarjetaCredito extends Tarjeta{
 private Double limite;

    public TarjetaCredito(int numeroFrente, int codigoDeSeguridad, LocalDate fechaDeExpiracion, Double limite) {
        super(numeroFrente, codigoDeSeguridad, fechaDeExpiracion);
        this.limite = limite;
    }

    @Override
    public boolean autorizacion(Double monto) {
        if (limite>monto)
            return  true;
        return false;
    }
    public boolean procesadorCredito(TarjetaCredito credito,Double monto){
        if (validacionDeFechaDeExpiracion()){
            if (autorizacion(monto)){
                limite-=monto;
                return true;
            }
        }
       return  false;
    }

    public Double getLimite() {
        return limite;
    }


}

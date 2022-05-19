package recursos;

import java.time.LocalDate;

public class TarjetaDebito extends Tarjeta{
private Double saldoDisponible;

    public TarjetaDebito(int numeroFrente, int codigoDeSeguridad, LocalDate fechaDeExpiracion, Double saldoDisponible) {
        super(numeroFrente, codigoDeSeguridad, fechaDeExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autorizacion(Double monto) {
        if (this.saldoDisponible>=monto)
            return true;

        return false;
    }
    public boolean procesadorDebito(TarjetaDebito debito,Double monto){

        if(validacionDeFechaDeExpiracion()){
           if(autorizacion(monto)){
               saldoDisponible-=monto;
               return true;
           }
        }
        return false;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }
}

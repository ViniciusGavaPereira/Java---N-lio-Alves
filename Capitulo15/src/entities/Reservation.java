package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exception.DomainException;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reservation() {
    }


    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
         if(!checkOut.after(checkIn)){
            throw new DomainException("Erro na reserva: a data de entrada da atualização precisa ser uma data futura.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getcheckIn() {
        return checkIn;
    }

    public Date getcheckOut() {
        return checkOut;
    }


    public Long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        
    }

    public void updateDates(Date checkIn, Date checkOut ){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String updateDatesString(Date checkIn, Date checkOut ){

        
        Date now = new Date();

        if(checkIn.before(now) || checkOut.before(now)){
            return "Erro na reserva: a data de saida da atualização precisa ser uma data futura.";
        } if(!checkOut.after(checkIn)){
            return "Erro na reserva: a data de entrada da atualização precisa ser uma data futura.";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return "Data atualizada";
    }

    public void updateDatesBom(Date checkIn, Date checkOut ) throws DomainException{

        
        Date now = new Date();

        if(checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Erro na reserva: a data de saida da atualização precisa ser uma data futura.");
        } if(!checkOut.after(checkIn)){
            throw new DomainException("Erro na reserva: a data de entrada da atualização precisa ser uma data futura.");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "ROOM "
        + roomNumber
        + ", check-in: "
        + sdf.format(checkIn)
        + ", checkOut: "
        + sdf.format(checkOut)
        + ", "
        + duration()
        + " nights";
    
    }
}

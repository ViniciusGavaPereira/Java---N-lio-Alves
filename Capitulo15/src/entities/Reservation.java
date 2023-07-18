package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reservation() {
    }


    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }


    public Long duration(){
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        
    }

    public void updateDates(Date checkin, Date checkout ){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String updateDatesString(Date checkIn, Date checkOut ){

        
        Date now = new Date();

        if(checkIn.before(now) || checkOut.before(now)){
            return "Erro na reserva: a data de saida da atualização precisa ser uma data futura.";
        } if(!checkOut.after(checkIn)){
            return "Erro na reserva: a data de entrada da atualização precisa ser uma data futura.";
        }

        this.checkin = checkin;
        this.checkout = checkout;
        return "Data atualizada";
    }

    @Override
    public String toString(){
        return "ROOM "
        + roomNumber
        + ", check-in: "
        + sdf.format(checkin)
        + ", checkout: "
        + sdf.format(checkout)
        + ", "
        + duration()
        + " nights";
    
    }
}

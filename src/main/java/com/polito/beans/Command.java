package com.polito.beans;

import java.util.Date;

public class Command {

    private Date   date;
    private long   ammount;
    private String paimentMode;
    private String statusPaiement;
    private String deliveryMode;
    private String deliveryStatus;

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public long getAmmount() {
        return ammount;
    }

    public void setAmmount( long ammount ) {
        this.ammount = ammount;
    }

    public String getPaimentMode() {
        return paimentMode;
    }

    public void setPaimentMode( String paimentMode ) {
        this.paimentMode = paimentMode;
    }

    public String getStatusPaiement() {
        return statusPaiement;
    }

    public void setStatusPaiement( String statusPaiement ) {
        this.statusPaiement = statusPaiement;
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode( String deliveryMode ) {
        this.deliveryMode = deliveryMode;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus( String deliveryStatus ) {
        this.deliveryStatus = deliveryStatus;
    }

}

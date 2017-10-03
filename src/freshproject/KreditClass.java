/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freshproject;

/**
 *
 * @author user
 */
public class KreditClass {
    private double pokokPinjaman;
    private double uangMuka;
    private double bungaKredit;
    private double lamaKredit;

    public KreditClass() {
    }

    public KreditClass(double pokokPinjaman, double uangMuka, double bungaKredit, double lamaKredit) {
        this.pokokPinjaman = pokokPinjaman;
        this.uangMuka = uangMuka;
        this.bungaKredit = bungaKredit;
        this.lamaKredit = lamaKredit;
    }
    
    public double pokokCicilan() {
        return pokokPinjaman - uangMuka;
    }

    public double bungaCicilan() {
        return pokokCicilan() * (bungaKredit / 100) * (lamaKredit / 12);
    }

    public double totalKredit() {
        return pokokCicilan() + bungaCicilan();
    }

    public double cicilanperBulan() {
        return totalKredit() / lamaKredit;
    }

    public boolean isDisetujui() {
        Person dn = new Person();
        boolean disetujui = false;
        if (dn.limitPinjaman() > cicilanperBulan()) {
            disetujui = true;
        }
        return disetujui;
    }

    /**
     * @return the pokokPinjaman
     */
    public double getPokokPinjaman() {
        return pokokPinjaman;
    }

    /**
     * @param pokokPinjaman the pokokPinjaman to set
     */
    public void setPokokPinjaman(double pokokPinjaman) {
        this.pokokPinjaman = pokokPinjaman;
    }

    /**
     * @return the uangMuka
     */
    public double getUangMuka() {
        return uangMuka;
    }

    /**
     * @param uangMuka the uangMuka to set
     */
    public void setUangMuka(double uangMuka) {
        this.uangMuka = uangMuka;
    }

    /**
     * @return the bungaKredit
     */
    public double getBungaKredit() {
        return bungaKredit;
    }

    /**
     * @param bungaKredit the bungaKredit to set
     */
    public void setBungaKredit(double bungaKredit) {
        this.bungaKredit = bungaKredit;
    }

    /**
     * @return the lamaKredit
     */
    public double getLamaKredit() {
        return lamaKredit;
    }

    /**
     * @param lamaKredit the lamaKredit to set
     */
    public void setLamaKredit(double lamaKredit) {
        this.lamaKredit = lamaKredit;
    }
}

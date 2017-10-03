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
public class Person {

    private String idnasabah;
    private String nama;
    private String alamat;
    private String gender;
    private int umur;
    private Boolean merried;
    private String nohp;
    private String pekerjaan;
    private double penghasilan;
    private int jumlahTanggungan;
//    private String gender;
//    private Boolean merried;
//    private int umur;

    public Person() {
    }
    
    public Person(String idnasabah, String nama){
        this.idnasabah = idnasabah;
        this.nama = nama;
    }

    public Person(String idnasabah, String nama, String alamat, String gender, int umur, Boolean merried, String nohp, String pekerjaan, double penghasilan, int jumlahTanggungan) {
        this.idnasabah = idnasabah;
        this.nama = nama;
        this.alamat = alamat;
        this.gender = gender;
        this.umur = umur;
        this.merried = merried;
        this.nohp = nohp;
        this.pekerjaan = pekerjaan;
        this.penghasilan = penghasilan;
        this.jumlahTanggungan = jumlahTanggungan;
    }
    
    public Person(double penghasilan, int jumlahTanggungan) {
        this.penghasilan = penghasilan;
        this.jumlahTanggungan = jumlahTanggungan;
    }

    public double limitPinjaman() {
        return penghasilan / (jumlahTanggungan + 1);
    }

    /**
     * @return the idnasabah
     */
    public String getIdnasabah() {
        return idnasabah;
    }

    /**
     * @param idnasabah the idnasabah to set
     */
    public void setIdnasabah(String idnasabah) {
        this.idnasabah = idnasabah;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * @return the merried
     */
    public Boolean getMerried() {
        return merried;
    }

    /**
     * @param merried the merried to set
     */
    public void setMerried(Boolean merried) {
        this.merried = merried;
    }

    /**
     * @return the nohp
     */
    public String getNohp() {
        return nohp;
    }

    /**
     * @param nohp the nohp to set
     */
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the penghasilan
     */
    public double getPenghasilan() {
        return penghasilan;
    }

    /**
     * @param penghasilan the penghasilan to set
     */
    public void setPenghasilan(double penghasilan) {
        this.penghasilan = penghasilan;
    }

    /**
     * @return the jumlahTanggungan
     */
    public int getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    /**
     * @param jumlahTanggungan the jumlahTanggungan to set
     */
    public void setJumlahTanggungan(int jumlahTanggungan) {
        this.jumlahTanggungan = jumlahTanggungan;
    }

}

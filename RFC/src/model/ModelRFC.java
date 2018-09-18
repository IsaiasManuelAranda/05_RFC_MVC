
package model;

public class ModelRFC {
    public String nombre1;
    public String nombre2;
    public String ape_pat;
    public String ape_mat;
    public String year;
    public String month;
    public String day;
    
    
    

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApe_pat() {
        return ape_pat;
    }

    public void setApe_pat(String ape_pat) {
        this.ape_pat = ape_pat;
    }

    public String getApe_mat() {
        return ape_mat;
    }

    public void setApe_mat(String ape_mat) {
        this.ape_mat = ape_mat;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    
    
    
    public String resultRFC(){
        this.ape_pat = this.ape_pat.trim().substring(0,2);
        this.ape_mat = this.ape_mat.trim().substring(0,1);
        this.nombre1 = this.nombre1.trim().substring(0,1);
        this.year = this.year.substring(2,4);
        this.day = this.day.substring(0,2);
        String RFC = this.ape_pat + this.ape_mat + this.nombre1 + this.year + this.month + this.day;
        return RFC.toUpperCase();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayesian;

/**
 *
 * @author zap
 */
public class Data {
    private String cuaca;
    private String temp;
    private String angin;
    private String olahraga;

    public Data(String cuaca, String temp, String angin, String olahraga) {
        this.cuaca = cuaca;
        this.temp = temp;
        this.angin = angin;
        this.olahraga = olahraga;
    }

    public String getCuaca() {
        return cuaca;
    }

    public void setCuaca(String cuaca) {
        this.cuaca = cuaca;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getAngin() {
        return angin;
    }

    public void setAngin(String angin) {
        this.angin = angin;
    }

    public String getOlahraga() {
        return olahraga;
    }

    public void setOlahraga(String olahraga) {
        this.olahraga = olahraga;
    }
    
}

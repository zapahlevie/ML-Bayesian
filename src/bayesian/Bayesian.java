/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayesian;

import java.util.ArrayList;

/**
 *
 * @author zap
 */
public class Bayesian {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Data> fact = new ArrayList<Data>();

    public static void main(String[] args) {
        // TODO code application logic here
        fact.add(new Data("Cerah", "Normal", "Pelan", "Ya"));
        fact.add(new Data("Cerah", "Normal", "Pelan", "Ya"));
        fact.add(new Data("Hujan", "Tinggi", "Pelan", "Tidak"));
        fact.add(new Data("Cerah", "Normal", "Kencang", "Ya"));
        fact.add(new Data("Hujan", "Tinggi", "Kencang", "Tidak"));
        fact.add(new Data("Cerah", "Normal", "Pelan", "Ya"));

        Data dataTest = new Data("Cerah", "Normal", "Pelan", "");
        probability(dataTest, fact);
    }

    public static void probability(Data data, ArrayList<Data> fact) {
        float cuacaYa = 0, cuacaTidak = 0, tempYa = 0, tempTidak = 0,
                anginYa = 0, anginTidak = 0, ya = 0, tidak = 0;

        for (Data d : fact) {
            if (d.getCuaca().equals(data.getCuaca()) && d.getOlahraga().equals("Ya")) {
                cuacaYa++;
            }
            if (d.getCuaca().equals(data.getCuaca()) && d.getOlahraga().equals("Tidak")) {
                cuacaTidak++;
            }

            if (d.getTemp().equals(data.getTemp()) && d.getOlahraga().equals("Ya")) {
                tempYa++;
            }
            if (d.getTemp().equals(data.getTemp()) && d.getOlahraga().equals("Tidak")) {
                tempTidak++;
            }

            if (d.getAngin().equals(data.getAngin()) && d.getOlahraga().equals("Ya")) {
                anginYa++;
            }
            if (d.getCuaca().equals(data.getCuaca()) && d.getOlahraga().equals("Tidak")) {
                anginTidak++;
            }

            if (d.getOlahraga().equals("Ya")) {
                ya++;
            } else {
                tidak++;
            }
        }
        
        float probYa = ya / fact.size();
        float probTidak = tidak / fact.size();
        
        if(!(data.getCuaca().equals(""))){
            probYa *= (cuacaYa / ya);
            probTidak *= (cuacaTidak / tidak);
        }
        if(!(data.getTemp().equals(""))){
            probYa *= (tempYa / ya);
            probTidak *= (tempTidak / tidak);
        }
        if(!(data.getAngin().equals(""))){
            probYa *= (anginYa / ya);
            probTidak *= (anginTidak / tidak);
        }
        
        System.out.println("Probabilitas Ya = " + probYa);
        System.out.println("Probabilitas Tidak = " + probTidak);
    }
}

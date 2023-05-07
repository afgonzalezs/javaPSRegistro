package com.ps.registro.ulitidades;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@UtilityClass
public class utilities {

    public String selectionDay(int day){

        String resultado = null;

        switch(day){
            case 1:
                resultado = "lunes";
                break;
            case 2:
                resultado = "martes";
                break;
            case 3:
                resultado = "miércoles";
                break;
            case 4:
                resultado = "jueves";
                break;
            case 5:
                resultado = "viernes";
                break;
            case 6:
                resultado = "sábado";
                break;
            case 7:
                resultado = "domingo";
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> edades = new ArrayList<>();
        edades.add(25);
        edades.add(34);
        edades.add(65);
        edades.add(19);
        edades.add(29);
        edades.add(38);
        edades.add(46);
        edades.add(36);
        System.out.println(contarEdadTrabajadores(edades));

    }

    public static double contarEdadTrabajadores(List<Integer> edadesDeTrabajadores){
        double resultado = 0;

        for(int edad: edadesDeTrabajadores){
            resultado += edad;
        }
        resultado = resultado/edadesDeTrabajadores.size();

        return resultado;
    }
}


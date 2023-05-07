package com.ps.registro.services;

import com.ps.registro.modelo.Registro;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {

    public Registro guardar(Registro registro) throws Exception{

        if(registro.getId()<=0){
            throw new Exception("El número de registro no puede ser menor o igual a cero");
        }
        if(registro.getRegistro()==null){
            throw new Exception("El registro no puede estar vacío");
        }
        return registro;
    }

}

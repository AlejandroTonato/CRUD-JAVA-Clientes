package com.clientes.clientes.service;

import com.clientes.clientes.model.FormatoTh;
import com.clientes.clientes.repository.IFormatoThRepository;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class FormatoThService implements IFormatoThService {

    @Autowired
    private IFormatoThRepository formatoThRepo;
    @Override
    public List<FormatoTh> findAll() {
        return formatoThRepo.findAll();
    }
    @Override
    public FormatoTh create(FormatoTh formatoTh) {
        return formatoThRepo.save(formatoTh);
    }
    public void cargarJson() {
        JSONParser parser = new JSONParser();
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Formato\\sk_formato.json");
            Object obj = parser.parse(reader);
            JSONObject pJsonObj = (JSONObject)obj;
            JSONArray array = (JSONArray)pJsonObj.get("sk_formato");
            System.out.println( "\nLos Beneficios Json son: ");
            for(int i = 0; i < array.size(); i++){
                JSONObject formato = (JSONObject)array.get(i);
                String beneficio = (String) formato.get("beneficio");
                System.out.println( "Beneficio: " + beneficio);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}

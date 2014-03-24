/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import modelo.Carro;

/**
 *
 * @author lulu
 */
@ManagedBean
@ViewScoped
public class CtrlCarro {
    
    private Carro carro;
    private ArrayList<Carro> carros;

    public CtrlCarro() {
       carro = new Carro();
       carros = new ArrayList<Carro>();
       
       carros.add(new Carro ("Ford", "Ka", 2009, 15000));
       carros.add(new Carro ("Peugeot", "206", 2005, 18000));
       carros.add(new Carro ("Fiat", "Palio", 2010, 17000));
       carros.add(new Carro ("Volks", "Gol", 2014, 35000));
       carros.add(new Carro ("Chevrolet", "Celta", 2009, 12000));
       carros.add(new Carro ("Renault", "Clio", 2001, 11000));
       carros.add(new Carro ("Hiunday", "HB20", 2013, 25000));
       carros.add(new Carro ("Ford", "Eco", 2009, 15000));
       
    }  

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }
    
        
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    
}

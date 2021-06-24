/*
 * To change this license header, choose L/*
icense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2257;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.PuertaDeSeguridad;
import ico.fes.objetos.Ventana;
import ico.fes.partes.Muro;
import java.awt.Color;

/**
 *
 * @author PC AXEL
 */
public class Composicion2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Muro muroNorte=new Muro();
        muroNorte.setPuerta(new Puerta("Madera",Color.white,true));
        Ventana[] tmpVentanas= new Ventana[2];
        tmpVentanas[0]=new Ventana("madera", Color.yellow, 0.5f, 1.0f);
        tmpVentanas[1]=new Ventana("madera", Color.green, 0.5f, 1.0f); 
        muroNorte.setVentanas(tmpVentanas);
        
        System.out.println(muroNorte);
        System.out.println(muroNorte.getVentanas()[0]);
        System.out.println(muroNorte.getVentanas()[1]);
        muroNorte.getPuerta().setMaterial("Aluminio");
        System.out.println(muroNorte);
        muroNorte.getVentanas()[1].setMaterial("Aluminio");
        System.out.println(muroNorte.getVentanas()[1]);
        
        
        Muro muroSur= new Muro(5.0f, 4.5f, 2.5f, Color.blue, new Puerta("Aluminio", Color.white, false),null);
        
        System.out.println("--------EJEMPLOS DE HERENCIA------");
        PuertaDeSeguridad puer1= new PuertaDeSeguridad();
        puer1.abrir();
        puer1.cerrar();
        puer1.setColor(Color.gray);
        System.out.println("la puerta de seguridad es de color: "+puer1.getColor());
        
        PuertaDeSeguridad puer2=new PuertaDeSeguridad("Chapa electronica", "1234", "metal", Color.gray, false);
        
        System.out.println(puer2.toString());
        
        System.out.println("-.-.-.-refundido-.-.-.-");
        
        Puerta nueva= (Puerta)puer2;
        System.out.println(nueva.getColor());
        System.out.println(puer2.getMecanismo());
        //System.out.println((Puerta)nueva).toString());
        puer2.abrir();
        System.out.println(".-.-.llamando al metodo de la clase base"); 
        ((Puerta)puer2).abrir();
    }
    
}

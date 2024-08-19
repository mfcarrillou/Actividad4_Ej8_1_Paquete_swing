package ej8_1_paquete_swing;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
    protected List<Persona> lista;
    
    protected ListaPersonas(){
        lista = new ArrayList<>();
    }
    
    protected void añadirPersona(Persona persona){
        lista.add(persona);
    }
   
    protected void eliminarPersona(int i){
        lista.remove(i);
    }
    
    protected void borrarLista(){
        lista.clear();
    }
    
}
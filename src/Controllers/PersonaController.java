package Controllers;

import Models.Persona;

public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas){
        /* 
        for(int i=0; i<personas.length; i++){
            int mid = i;
            for(int j=i+1; j<personas.length; j++){
                if(personas[j].getCodigoDireccion() >  personas[mid].getCodigoDireccion()){
                    mid = j;
                }
                if (mid != i){
                    Persona temp = personas[mid];
                    personas[mid] = personas[i];
                    personas[i] = temp;
                }
            }
        }
        */
        for(int i=0; i<personas.length; i++){
            int mid = i;
            for(int j=i+1; j<personas.length; j++){
                if(personas[j].equalByCodeDireccion(personas[mid])){
                    mid = j;
                }
                if (mid != i){
                    Persona temp = personas[mid];
                    personas[mid] = personas[i];
                    personas[i] = temp;
                }
            }
        }
        
    }

    
    public Persona findByCodigo(Persona[] personas, int codigo){
        int bajo = 0;
        int alto = personas.length - 1;
        while(bajo <= alto){
            int central = bajo + (alto-bajo)/2;
            int valorCentro = personas[central].getCodigoDireccion();
            if(valorCentro == codigo){//(personas[central].equalByCodeDireccion(codigo))
                return personas[central];
            }
            if(valorCentro >codigo){
                bajo = central + 1;
            }
            else{
                alto = central - 1;
            }
        }
        return null;
    }

    
}

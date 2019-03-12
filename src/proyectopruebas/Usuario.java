package proyectopruebas;

import java.io.Serializable;


/**
 *
 * @author cromerofajar
 */
public class Usuario implements Serializable{
    String nombre, rango,contraseña;
    int elo;

    public Usuario() {
        
    }


    public Usuario(String nombre,String contraseña, String rango, int elo) {
        this.nombre = nombre;
        this.contraseña=contraseña;
        this.rango = rango;
        this.elo = elo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRango() {
        return rango;
    }

    public int getElo() {
        return elo;
    }
    public void rangElo(int elo){ //Metodo que recibe tu Elo tras la partida que te asigna tu nuevo elo y te cambia el rango en caso de cumplir el requisito.
        this.elo=elo;
        if (elo<=100){ //If else con las condiciones de cambio de rango.
            this.rango="bronce";
        }else if(elo>100 && elo<=200){
            this.rango="plata";
        }else if(elo>200 && elo<=300){
            this.rango="oro";
        }else if(elo>300 && elo<=400){
            this.rango="platino";
        }else if(elo>400 && elo<=500){
            this.rango="diamante";
        }else if(elo>500 && elo<=600){
            this.rango="maestro";
        }else if(elo>600 && elo<=700){
            this.rango="gran maestro";
        }else if(elo>700){
            this.rango="aspirante";
        }
    }
    @Override
    public String toString() { //toString de los datos del Usuario excepto la contraseña.
        return "Jugador"+"\nnombre=" + nombre + "\nrango=" + rango + "\nelo=" + elo;
    }
    
    
    
}

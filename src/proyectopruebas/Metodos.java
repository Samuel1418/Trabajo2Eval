package proyectopruebas;

import Utilidades.PedirDatos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author cromerofajar
 */
public class Metodos {
    
    public void crearUsuario(ArrayList<Usuario>lista) throws IOException{ //Metodo que recive el un ArrayList de tipo Usuario
        
        String nombre=PedirDatos.texto("Introduce tu nombre de Usuario"); //Variable de tipo String que se le introduce el nombre de usuario
        for(Usuario list:lista){ //Bucle For each que recorre el ArrayList de tipo Usuario.
            while(list.nombre.equals(nombre)){ //Bucle while que impide nombres repetidos para evitar duplicados de usuarios.
                nombre=PedirDatos.texto("Ya existe un usuario con ese nombre");
            }
        }
        String contraseña=PedirDatos.texto("Introduce contraseña"); //Variable de tipo String que lleva la contraseña del usuario.
        String rango=PedirDatos.texto("Introduce tu rango"); //Variable de tipo String que lleva el rango del usuario.
        int elo=PedirDatos.entero("Introduce tu elo actual"); //Variable de tipo Int que lleva el Elo del usuario.
        Usuario al= new Usuario(nombre,contraseña,rango,elo); //Creacion de un objeto usuario con los datos dados.
        lista.add(al); //Añadido del objeto Usuario user ArrayList de usuarios.
        PrintWriter fich = null; //Para poder escribir en el fichero primero creamos una variable fich de tipo PrintWriter.
                            for (Usuario user: lista) { //Bucle for each que recorre el ArrayList de Usuarios.
                                if(nombre.equals(user.nombre)){ //If que en caso de encontrar el nombre de usuario nos guarde la partida.
                                        fich = new PrintWriter(new FileWriter("Usuarios.txt")); //creacion del fichero empleando el nombre de usuario para el String nom.
                                        JOptionPane.showMessageDialog(null,user); //JOptionPane que nos muestra nuestras estadisticas tras la partida.
                                        fich.println(user); //Escritura en el fichero de los datos del usuario.
                                        fich.close(); //Cierre del fichero.
                                }
                            }
                        
        
    }
    
    
    
    public int mediaFarmeo(ArrayList<Partida>part,ArrayList<Rivales>riv){
        int puntuacion=0;
        int tuFarm=0;
        int diferencia;
        int mediaRivFarm=0;
        for(Partida parti:part){
            tuFarm=parti.getMinions();
        }
        for(Rivales riva:riv){
            mediaRivFarm=mediaRivFarm+riva.getFarmeo();
        }
        mediaRivFarm=mediaRivFarm/5;
        if(tuFarm>mediaRivFarm){
            diferencia=tuFarm-mediaRivFarm;
            if(diferencia>10&&diferencia<20){
                puntuacion=puntuacion+1;
            }
            else if(diferencia>=20&&diferencia<30){
                puntuacion=puntuacion+3;
            }
            else if(diferencia>=30){
                puntuacion=puntuacion+5;
            }
            else{
                puntuacion=0;
            }
        }
        return puntuacion;
    }
    
    public int mediaVision(ArrayList<Partida>part,ArrayList<Rivales>riv){
        int puntuacion=0;
        int tuVision=0;
        int diferencia;
        int mediaRivVision=0;
        for(Partida parti:part){
            tuVision=parti.getVision();
        }
        for(Rivales riva:riv){
            mediaRivVision=mediaRivVision+riva.getVision();
        }
        mediaRivVision=mediaRivVision/5;
        if(tuVision>mediaRivVision){
            diferencia=tuVision-mediaRivVision;
            if(diferencia>10&&diferencia<20){
                puntuacion=puntuacion+1;
            }
            else if(diferencia>=20&&diferencia<30){
                puntuacion=puntuacion+3;
            }
            else if(diferencia>=30){
                puntuacion=puntuacion+5;
            }
            else{
                puntuacion=0;
            }
        }
        return puntuacion;
    }
    
    public int mediaAsesinatos(ArrayList<Partida>part,ArrayList<Rivales>riv){
        int puntuacion=0;
        int tuAsesi=0;
        int diferencia;
        int mediaRivAsesi=0;
        for(Partida parti:part){
            tuAsesi=parti.getAsesinatos();
        }
        for(Rivales riva:riv){
            mediaRivAsesi=mediaRivAsesi+riva.getAsesinatos();
        }
        mediaRivAsesi=mediaRivAsesi/5;
        if(tuAsesi>mediaRivAsesi){
            diferencia=tuAsesi-mediaRivAsesi;
            if(diferencia>2&&diferencia<4){
                puntuacion=puntuacion+1;
            }
            else if(diferencia>=4&&diferencia<5){
                puntuacion=puntuacion+3;
            }
            else if(diferencia>=5){
                puntuacion=puntuacion+5;
            }
            else{
                puntuacion=0;
            }
        }
        return puntuacion;
    }
    public int mediaMuertes(ArrayList<Partida>part,ArrayList<Rivales>riv){
        int puntuacion=0;
        int tuEliminado=0;
        int diferencia;
        int mediaRivEliminados=0;
        for(Partida parti:part){
            tuEliminado=parti.getMuertes();
        }
        for(Rivales riva:riv){
            mediaRivEliminados=mediaRivEliminados+riva.getMuertes();
        }
        mediaRivEliminados=mediaRivEliminados/5;
        if(tuEliminado>mediaRivEliminados){
            diferencia=tuEliminado-mediaRivEliminados;
            if(diferencia>=6){
                puntuacion=puntuacion-5;
            }
            else if(diferencia>=4&&diferencia<6){
                puntuacion=puntuacion-3;
            }
            else if(diferencia>2){
                puntuacion=puntuacion-1;
            }
            else{
                puntuacion=0;
            }
        }
        return puntuacion;
    }
    public int mediaAsistencias(ArrayList<Partida>part,ArrayList<Rivales>riv){
        int puntuacion=0;
        int tuAsis=0;
        int diferencia;
        int mediaRivAsis=0;
        for(Partida parti:part){
            tuAsis=parti.getVision();
        }
        for(Rivales riva:riv){
            mediaRivAsis=mediaRivAsis+riva.getVision();
        }
        mediaRivAsis=mediaRivAsis/5;
        if(tuAsis>mediaRivAsis){
            diferencia=tuAsis-mediaRivAsis;
            if(diferencia>2&&diferencia<4){
                puntuacion=puntuacion+1;
            }
            else if(diferencia>=4&&diferencia<5){
                puntuacion=puntuacion+3;
            }
            else if(diferencia>=5){
                puntuacion=puntuacion+5;
            }
            else{
                puntuacion=0;
            }
        }
        return puntuacion;
    }
    
    public void borrarUser(String nombre,String contraseña,ArrayList<Usuario>lista){
    if(lista.isEmpty()==true)
        JOptionPane.showMessageDialog(null,"Introduzca usuarios");
    else{
    for(Usuario al:lista){
    if(nombre.equals(al.getNombre())){
        if(contraseña.equals(al.getContraseña())){
    lista.remove(al);
    String nombrefich=nombre+"ultima.txt";
    File fich=new File(nombrefich);
    fich.delete();
    JOptionPane.showMessageDialog(null,"Usuario "+nombre+ " Borrado");
    break;
        }}}}}
    
    public void verUsers(ArrayList<Usuario>lista){
    if(lista.isEmpty()==true)
        JOptionPane.showMessageDialog(null,"No existen usuarios");
    else{
    for(Usuario al:lista){
    JOptionPane.showMessageDialog(null,al);
    }
    }
    }
    
    
    
    
}
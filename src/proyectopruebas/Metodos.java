package proyectopruebas;

import Utilidades.PedirDatos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author cromerofajar
 */
public class Metodos {
    
    public void crearUsuario() throws IOException{ //Metodo que recive el un ArrayList de tipo Usuario
        ObjectOutputStream fich = null;
        FileOutputStream f = null;
        
        String nombre=PedirDatos.texto("Introduce tu nombre de Usuario"); //Variable de tipo String que se le introduce el nombre de usuario
//        for(Usuario list:lista){ //Bucle For each que recorre el ArrayList de tipo Usuario.
//            while(list.nombre.equals(nombre)){ //Bucle while que impide nombres repetidos para evitar duplicados de usuarios.
//                nombre=PedirDatos.texto("Ya existe un usuario con ese nombre");
//            }
//        }
        try{
    f= new FileOutputStream(nombre+".dat");
    fich= new ObjectOutputStream(f);
   Usuario al= new Usuario(nombre,PedirDatos.texto("contraseña"),PedirDatos.texto("rango"),PedirDatos.entero("elo"));
   fich.writeObject(al);
            } catch (FileNotFoundException ex) {
                System.out.println("erro 1"+ex.getMessage());
    }catch(IOException ex){
System.out.println("erro 2"+ex.getMessage());
}finally{
            try {
                fich.close();
                f.close();
            } catch (IOException ex) {
                System.out.println("erro 3"+ex.getMessage());
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
    
    public void verUsers(ArrayList<Usuario>lita){
    try {
        ObjectInputStream ler;
    FileInputStream f; 
    String nome= PedirDatos.texto("Nombre del usuario que desea ver");
        f= new FileInputStream(nome+".dat");
            ler= new ObjectInputStream(f);
           Usuario al= (Usuario) ler.readObject();
           ArrayList lista = new ArrayList();
           if(al!=null){
               while(al!=null){
                   try{
               System.out.println(al);
               al=(Usuario) ler.readObject();
               lista.add(al);
               }catch (Exception ex) {
                   break;
               }
           }
           }
           
           
        } catch (FileNotFoundException ex) {
            System.out.println("erro 4"+ex.getMessage());
        }catch(IOException ex) {
                System.out.println("erro 5"+ex.getMessage());
     
    }   catch (ClassNotFoundException ex) {
            System.out.println("erro 6"+ex.getMessage());
        }
}
}
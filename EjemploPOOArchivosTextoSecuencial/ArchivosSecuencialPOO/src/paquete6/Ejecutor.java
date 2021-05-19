/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author USUARIO PC
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.txt";
        Hospital hospital =  new  Hospital ( " Hospital de Loja" , 42 , 758.32 );
        Hospital hospital1 =  new  Hospital ( " Hospital de Cuenca " , 785 ,785.2 );
        Hospital hospital2 =  new  Hospital ( " Hospital de Seguro" , 125, 200.23 );

        Hospital [] listaH = {hospital, hospital1, hospital2};

        ArchivoEs archivo =  new  ArchivoEs (nombreArchivo);

        for ( int i =  0 ; i < listaH.length; i ++ ) {      
            archivo.establecerRegistro (listaH [i]);       
            archivo.establecerSalida ();
        }
        archivo. cerrarArchivo ();
        
        ArchivoL lectura =  new  ArchivoL (nombreArchivo );
        lectura.establecerLista ();
         System.out.println(lectura);
        lectura.cerrarArchivo ();
    }
}

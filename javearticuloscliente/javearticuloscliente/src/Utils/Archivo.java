/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import submision.ApiSubmision;
import submision.ApiSubmisionService;

/**
 *
 * @author USER
 */
public abstract class Archivo {
    public static void upload(String path, String correo){
        ApiSubmision apiS;
        ApiSubmisionService servicioS;
        
        servicioS = new ApiSubmisionService();
        apiS = servicioS.getApiSubmisionPort();
         
        File file = new File(path);
        
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            byte[] imageBytes = new byte[(int) file.length()];
            inputStream.read(imageBytes);
             
            apiS.upload(file.getName(), imageBytes, correo);
 
            inputStream.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }   
    }
    
    public static void download(String fileName){
        ApiSubmision apiS;
        ApiSubmisionService servicioS;
        
        servicioS = new ApiSubmisionService();
        apiS = servicioS.getApiSubmisionPort();
        
        String rutaProyecto = new File (".").getAbsolutePath ();
    	rutaProyecto = rutaProyecto.substring(0, rutaProyecto.length()-1) + "files/"+ fileName;
        System.out.println(rutaProyecto);
        byte[] fileBytes = apiS.download(fileName);
         
        try {
            FileOutputStream fos = new FileOutputStream(rutaProyecto);
            BufferedOutputStream outputStream = new BufferedOutputStream(fos);
            outputStream.write(fileBytes);
            outputStream.close();
             
            System.out.println("File downloaded: " + rutaProyecto);
        } catch (IOException ex) {
            System.err.println(ex);
        }
        
        try{
            File path = new File (rutaProyecto);
            Desktop.getDesktop().open(path);
        }catch(Exception ex2){
            System.out.println(ex2.toString());
        }
        
        
    }
    
}

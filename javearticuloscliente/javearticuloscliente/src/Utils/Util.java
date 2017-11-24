/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author USER
 */
public abstract class Util {
    public static XMLGregorianCalendar stringToXMLGC(String dat) throws ParseException, DatatypeConfigurationException{
        DateFormat df = new SimpleDateFormat("dd MM yyyy");
        Date date = df.parse(dat);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        return date2;
    }
    
    public static void mostrarMensaje(String output){
        JOptionPane.showMessageDialog(null, output);
    }
    
    public static String XMLGCToString(XMLGregorianCalendar dat){
        return dat.getDay()+" "+dat.getMonth()+" "+dat.getYear();
    }
}

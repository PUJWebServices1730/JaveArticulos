/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import javax.xml.ws.Endpoint;

import api.ApiAuth;
import api.ApiSubmision;
import api.ApiUsuarios;
/**
 *
 * @author HP
 */
public class Main {
	
	
	
	public void something(){
		
	}
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Endpoint.publish("http://localhost:9990/ws/javearticulos/auth", new ApiAuth());
    	Endpoint.publish("http://localhost:9990/ws/javearticulos/usuario", new ApiUsuarios());
    	Endpoint.publish("http://localhost:9990/ws/javearticulos/submision", new ApiSubmision());
    }
    
}

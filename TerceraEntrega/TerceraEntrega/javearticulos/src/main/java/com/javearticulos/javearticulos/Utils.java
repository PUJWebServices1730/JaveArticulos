package com.javearticulos.javearticulos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class Utils {
	
	public static void guardarPfd(MultipartFile file) throws IOException{
		 File convFile = new File("./"+file.getOriginalFilename());
		 convFile.createNewFile(); 
		 FileOutputStream fos = new FileOutputStream(convFile); 
		 fos.write(file.getBytes());
		 fos.close(); 
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Ale
 */ 
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.shape.Shape;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.IOUtils;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import restcliente.RestClient;

 
 
/**
 * A Swing application that uploads files to a HTTP server.
 * @author www.codejava.net
 *
 */
public class SwingFileUploadHTTP extends JFrame implements
        PropertyChangeListener {
    
    private RestClient cliente;
    private String token;
    private JFilePicker filePicker = new JFilePicker("Choose a file: ",
            "Browse");
 
    private JButton buttonUpload = new JButton("Upload");
 
    private JLabel labelProgress = new JLabel("Progress:");
    private JProgressBar progressBar = new JProgressBar(0, 100);
 
    public SwingFileUploadHTTP(String token) {
        super("Swing File Upload to HTTP server");
            cliente = new RestClient();
            this.token = token;
        // set up layout
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);
 
        // set up components
        filePicker.setMode(JFilePicker.MODE_OPEN);
 
        buttonUpload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    buttonUploadActionPerformed(event);
                } catch (IOException ex) {
                    Logger.getLogger(SwingFileUploadHTTP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
 
        progressBar.setPreferredSize(new Dimension(200, 30));
        progressBar.setStringPainted(true);
 
        // add components to the frame
     
 
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.weightx = 0.0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        add(filePicker, constraints);
 
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        add(buttonUpload, constraints);
 
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.WEST;
        add(labelProgress, constraints);
 
        constraints.gridx = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(progressBar, constraints);
 
        pack();
        setLocationRelativeTo(null);    // center on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    /**
     * handle click event of the Upload button
     */
    private void buttonUploadActionPerformed(ActionEvent event) throws MalformedURLException, IOException {
        System.out.println("Upload");
        File file = new File(filePicker.getSelectedFilePath());
        System.out.println(file.getAbsolutePath());
        File o = new File("C:\\Users\\Ale\\Desktop\\prueba2.pdf");
        o.createNewFile();
        InputStream in = new FileInputStream(file);
        OutputStream out = new FileOutputStream(o);
        IOUtils.copy(in,out);
        in.close();
        out.close();
        /*DiskFileItem fileItem = new DiskFileItem("file", MediaType.MULTIPART_FORM_DATA, true, o.getAbsolutePath(), (int) o.length() , o.getParentFile());
         OutputStream buffer = fileItem.getOutputStream();
         buffer.close();*/
       FormDataMultiPart multipartFile =  new FormDataMultiPart().field("file", o, MediaType.APPLICATION_OCTET_STREAM_TYPE);
        System.out.println("hhhh");
        System.out.println(multipartFile.getField("file").getContentDisposition().getFileName());
       // System.out.println(multipartFile.getOriginalFilename());
        cliente.pdf(token, multipartFile);
        
        
        

    }
 
    /**
     * Update the progress bar's state whenever the progress of upload changes.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            progressBar.setValue(progress);
        }
    }
 
}
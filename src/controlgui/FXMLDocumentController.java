/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 *
 * @author sergio_a.gomez
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Canvas lienzo;
    
    GraphicsContext g; 
    GraphicsContext p; 
            
    @FXML
    private void crearcirculo(ActionEvent event) {
        g.setStroke(Color.BLUE);
         g.setFill(Color.PINK);
        g.setLineWidth(3);
        g.strokeOval(3, 3, 100, 100);
        g.fillOval(3, 3, 100, 100);
        
    }
    @FXML
    private void creartriangulo(ActionEvent event) {
        g.setStroke(Color.BLUE);
        g.setFill(Color.ORANGE);
        g.setLineWidth(3);
        g.strokeRect(100, 100, 100, 100);
        g.fillRect(100, 100, 100, 100);
      
    }
     @FXML
    private void crearectangulo(ActionEvent event) {
        g.setStroke(Color.BLUE);
        g.setFill(Color.BROWN);
        g.setLineWidth(10);
        g.strokeRect(250,200, 100, 200);
        g.fillRect(250, 200, 100, 200);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        g = lienzo.getGraphicsContext2D();
        
        double h = lienzo.getHeight();
        double w = lienzo.getWidth();
        
        g.setStroke(Color.AQUAMARINE);
        g.setLineWidth(w);
        g.strokeRect(0, 0, w, h);
    }    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package benjaddi.ayoub.ejerciciosclase.TableView1;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author alumno
 */
public class Ejercicio1Controller implements Initializable {
    
    @FXML TableView tablaPersonas;
    @FXML   TableColumn colEdad; 
    @FXML TableColumn colNombre;
    @FXML TableColumn colApellidos; 
    @FXML TextField nombreTexto;
    @FXML TextField apellidosTexto;
    @FXML TextField edadTexto;
    @FXML Button botonModificar;
    @FXML Button botonEliminar;
    @FXML Button botonAgergar;
    private List<Persona> lista;
    
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void agregarPersona(ActionEvent action){
        
    }
    
    public void modificar(ActionEvent action){
        
    }
    
    public void eliminar(ActionEvent action){
        
    }
    
    
    
}

package tp1;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class TestMenuBar extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
    	
        MenuBar menubar = new MenuBar();
        Menu fichier = new Menu("Fichiers");
        Menu affichage= new Menu("Affichage");
        
        MenuItem nouveau = new MenuItem("Nouveau"); 
        MenuItem ouvrir= new MenuItem("Ouvrir"); 
        
        MenuItem pleinEcran = new MenuItem("Plein écran");
        Menu couleurs = new Menu("Couleur");
        
        MenuItem rouge = new MenuItem("Rouge");
        MenuItem bleu= new MenuItem("Bleur");
        
        
        fichier.getItems().addAll(nouveau, ouvrir);
        couleurs.getItems().addAll(rouge, bleu);
        affichage.getItems().addAll(pleinEcran, couleurs);
        
        
        
        
        
    	
    	
    	menubar.getMenus().addAll(fichier ,affichage);
    	
        VBox root = new VBox();
        root.getChildren().add(menubar);
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}
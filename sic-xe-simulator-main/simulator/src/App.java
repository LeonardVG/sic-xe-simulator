import Mem.Memoria;
import Regs.Registradores;
import Carregador.AbsoluteLoader;
import Ligador.Ligador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static Memoria memoria;
    private static Registradores registradores;
    private static Ligador ligador;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Inicializa Memória e Registradores
        memoria = new Memoria();
        registradores = new Registradores();
        ligador = new Ligador();

        // Carrega a interface gráfica
        FXMLLoader loaderFXML = new FXMLLoader(getClass().getResource("style.fxml"));
        Parent root = loaderFXML.load();

        Controller controller = loaderFXML.getController();
        controller.setStage(primaryStage);
        controller.updateRegistradores(registradores);
        controller.updateMemoria(memoria);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styless.css").toExternalForm());
        primaryStage.setTitle("Simulador SIC");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void LII(){
        System.out.println("--- Memória antes da execução ---");
        ligador.printMemory(memoria, 0, 10);
        
        ligador.pass1();
        ligador.pass2(memoria);
        
        System.out.println("--- Memória depois da execução ---");
        ligador.printMemory(memoria, 0, 200);

    }
}

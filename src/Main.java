import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Construct and add actions to our controls
        Label label1 = new Label("Let's add some GUI controls !");
        Label label2 = new Label("How can we do this?");
        Label label3 = new Label("We'll start with Labels.");
        Label label4 = new Label("We'll start with Button.");
        label1.setFont(new Font("Arial", 24));
        Button pressMe = new Button("Press Me!");
        pressMe.setOnAction(actionEvent ->  {
            label2.setText("We did it!");
        });
        TextField typeHere = new TextField("Please type here!");
        typeHere.setOnAction(actionEvent ->  {
            label3.setText(typeHere.getText());
        });

        // Layout our scene
        VBox vBox1 = new VBox(label2, label3, label4);
        vBox1.setAlignment(Pos.BASELINE_CENTER);
        vBox1.setSpacing(20);
        VBox vBox2 = new VBox(label1, pressMe, typeHere);
        HBox myHbox = new HBox(40, vBox2, vBox1);
        Scene scene = new Scene(myHbox, 800, 600);

        // Display our stage
        primaryStage.setTitle("Hello class!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}
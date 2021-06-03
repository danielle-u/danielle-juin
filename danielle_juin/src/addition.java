
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
/*import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;*/
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class addition extends Application {

	@Override
	public void start(Stage primaryStage) 
	{
		Group group = new Group();
		Scene scene = new Scene(group, 400, 400);
		
		TextField txt1 = new TextField();
		txt1.setLayoutX(20);
		txt1.setLayoutY(20);
		
		TextField txt2 = new TextField();
		txt2.setLayoutX(20);
		txt2.setLayoutY(80);
		
		Label lbl1 = new Label();
		
		lbl1.setLayoutX(20);
		lbl1.setLayoutY(160);
		
		lbl1.textProperty().bind(txt1.textProperty());
		
		Label lbl2 = new Label("+");
		
		lbl2.setLayoutX(40);
		lbl2.setLayoutY(160);
		
		Label lbl3 = new Label();
		
		lbl3.setLayoutX(60);
		lbl3.setLayoutY(160);
		
		lbl3.textProperty().bind(txt2.textProperty());
		
		Label lbl4 = new Label("=");
		
		lbl4.setLayoutX(80);
		lbl4.setLayoutY(160);
		
		Label lbl5 = new Label();
		
		lbl5.setLayoutX(100);
		lbl5.setLayoutY(160);
		
		lbl5.textProperty().bind(lbl1.textProperty());
		lbl5.textProperty().bind(lbl3.textProperty());
		
		group.getChildren().add(txt1);
		group.getChildren().add(txt2);
		group.getChildren().add(lbl1);
		group.getChildren().add(lbl2);
		group.getChildren().add(lbl3);
		group.getChildren().add(lbl4);
		group.getChildren().add(lbl5);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		
		/*
		 * IntegerProperty a=new SimpleIntegerProperty(); IntegerProperty b=new
		 * SimpleIntegerProperty();
		 * 
		 * b.bind(a);
		 */
		
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
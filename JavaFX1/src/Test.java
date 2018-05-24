import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application
{
	Label lb_text;
	Button btn_click;
	int count = 0;
	
	public static void main(String[]args)
	{
		launch(args);
	}
	
	public void start(Stage stage) throws Exception
	{
		lb_text = new Label("Here some Text");
		btn_click = new Button("Click it");
		
		btn_click.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent arg0)
					{
						if(count%2 == 0)
						{
							lb_text.setText("Yes");
							btn_click.setText("Set To No");
							count++;
						}
						else
						{
							lb_text.setText("No");
							btn_click.setText("Set To Yes");
							count++;
						}
						
					}
				});
		
		VBox root = new VBox();
		root.getChildren().add(lb_text);
		root.getChildren().add(btn_click);
		
		Scene scene = new Scene(root, 500, 500); //size of the window
		stage.setScene(scene);
		
		stage.show();
	}
}

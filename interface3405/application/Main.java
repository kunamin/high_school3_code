package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Main extends Application {
	
	Circle c[];
	Pane root;
	long t;
	
	public void start(Stage ps) {
		try {
			root = new Pane();
			Scene scene = new Scene(root,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			c= new Circle[30];
			t=System.currentTimeMillis();
			makeCircle();
			
			scene.setOnMouseClicked(new EventHandle(this) );
			ps.setTitle("3405 πŒ∞Ê»∆ ∏∂øÏΩ∫¿Ã∫•∆Æ");
			ps.setScene(scene);
			ps.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void makeCircle() {
		for(int i=0; i<30; i++) {
			c[i]=new Circle((int)(800*Math.random()), (int)(800*Math.random()) , 30+(int)(150*Math.random()) , Color.rgb((int)(255*Math.random()), (int)(255*Math.random()), (int)(255*Math.random())));
			root.getChildren().add(c[i]);
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

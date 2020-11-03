package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	public void start(Stage ps) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,640,464);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Label l1 =new Label("계산기");
			l1.setId("msg");
			root.add(l1, 0, 0, 4, 1);
			
			
			Label l2 =new Label("값1");
			TextField t1=new TextField();
			root.add(l2, 0, 1, 1, 1);
			root.add(t1, 1, 1, 3, 1);
			
			Label l3 =new Label("값2");
			TextField t2=new TextField();
			root.add(l3, 0, 2);
			root.add(t2, 1, 2, 3, 1);
			
			Button bt1= new Button("+");
			Button bt2= new Button("-");
			Button bt3= new Button("x");
			Button bt4= new Button("/");
			root.add(bt1, 0, 3, 1, 1);
			root.add(bt2, 1, 3, 1, 1);
			root.add(bt3, 2, 3, 1, 1);
			root.add(bt4, 3, 3, 1, 1);
			
			Label l4 =new Label();
			root.add(l4, 0, 4, 4, 1);
			bt1.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent arg0) {
					int a=Integer.parseInt(t1.getText());
					int b=Integer.parseInt(t2.getText());
					int c=a+b;
					String L="결과: "+Integer.toString(c);
					l4.setText(L);
				}
				
			});
			bt2.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent arg0) {
					int a=Integer.parseInt(t1.getText());
					int b=Integer.parseInt(t2.getText());
					int c=a-b;
					String L="결과: "+Integer.toString(c);
					l4.setText(L);
				}
				
			});
			bt3.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent arg0) {
					int a=Integer.parseInt(t1.getText());
					int b=Integer.parseInt(t2.getText());
					int c=a*b;
					String L="결과: "+Integer.toString(c);
					l4.setText(L);
				}
				
			});
			bt4.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent arg0) {
					int a=Integer.parseInt(t1.getText());
					int b=Integer.parseInt(t2.getText());
					double d=b/1;
					double c=a/d;
					String L="결과: "+Double.toString(c);
					l4.setText(L);
				}
				
			});
			
			ps.setScene(scene);
			ps.setTitle("3405 민경훈 미니계산기");
			ps.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;
	
import java.util.Random;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	Random r=new Random();
	Scene scene;
	BorderPane root;
	Label l;
	int tt=-1;
	int t=0;
	boolean stop = true;
	String time;
	
	public void start(Stage ps) {
		try {
			root = new BorderPane();
			scene = new Scene(root,400,230);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Button b1=new Button("½ÃÀÛ");
			b1.setPrefHeight(200);
			root.setLeft(b1);
			Button b2=new Button("¸ØÃã");
			b2.setPrefHeight(200);
			root.setRight(b2);
			Button b3=new Button("ÃÊ±âÈ­");
			b3.setPrefHeight(30);
			b3.setPrefWidth(400);
			root.setBottom(b3);
			l=new Label("00:00:00.00");
			root.setCenter(l);
			b1.setOnAction(a -> bs(a));
			b2.setOnAction(b -> bp(b));
			b3.setOnAction(c -> bi(c));
			
			ps.setTitle("3405 ¹Î°æÈÆ Timer");
			ps.setScene(scene);
			ps.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void bs(ActionEvent a) {
		int ttt=r.nextInt(5);
		if(t!=ttt) t=ttt;
		Image image = new Image (getClass().getResourceAsStream("Image"+t+".jpg"));
        root.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.REPEAT,
                                                                  BackgroundRepeat.REPEAT,
                                                                  BackgroundPosition.DEFAULT,
                                                                  BackgroundSize.DEFAULT)));
		if(stop) { Thread t = new Thread(() -> {
			stop=false;
			while(!stop) {
				tt++;
				int h=tt/360000;
				int m=tt%360000/6000;
				int s=tt/100%60;
				int ss=tt%100;
				if(h/10==0 && m/10==0 && s/10==0 && ss/10==0) time="0"+h+":0"+m+":0"+s+".0"+ss;
				if(h/10==0 && m/10==0 && s/10==0 && ss/10>0) time="0"+h+":0"+m+":0"+s+"."+ss;
				if(h/10==0 && m/10==0 && s/10>0 && ss/10==0) time="0"+h+":0"+m+":"+s+".0"+ss;
				if(h/10==0 && m/10==0 && s/10>0 && ss/10>0) time="0"+h+":0"+m+":"+s+"."+ss;
				if(h/10==0 && m/10>0 && s/10==0 && ss/10==0) time="0"+h+":"+m+":0"+s+".0"+ss;
				if(h/10==0 && m/10>0 && s/10==0 && ss/10>0) time="0"+h+":"+m+":0"+s+"."+ss;
				if(h/10==0 && m/10>0 && s/10>0 && ss/10==0) time="0"+h+":"+m+":"+s+".0"+ss;
				if(h/10==0 && m/10>0 && s/10>0 && ss/10>0) time="0"+h+":"+m+":"+s+"."+ss;
				if(h/10>0 && m/10==0 && s/10==0 && ss/10==0) time=h+":0"+m+":0"+s+".0"+ss;
				if(h/10>0 && m/10==0 && s/10==0 && ss/10>0) time=h+":0"+m+":0"+s+"."+ss;
				if(h/10>0 && m/10==0 && s/10>0 && ss/10==0) time=h+":0"+m+":"+s+".0"+ss;
				if(h/10>0 && m/10==0 && s/10>0 && ss/10>0) time=h+":0"+m+":"+s+"."+ss;
				if(h/10>0 && m/10>0 && s/10==0 && ss/10==0) time=h+":"+m+":0"+s+".0"+ss;
				if(h/10>0 && m/10>0 && s/10==0 && ss/10>0) time=h+":"+m+":0"+s+"."+ss;
				if(h/10>0 && m/10>0 && s/10>0 && ss/10==0) time=h+":"+m+":"+s+".0"+ss;
				if(h/10>0 && m/10>0 && s/10>0 && ss/10>0) time=h+":"+m+":"+s+"."+ss;
				Platform.runLater( () ->  { l.setText(time);});
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}
		);

		t.start();
		}

		
	}
	
	public void bp(ActionEvent b) {
		int ttt=r.nextInt(5);
		if(t!=ttt) t=ttt;
		Image image = new Image (getClass().getResourceAsStream("Image"+t+".jpg"));
        root.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.REPEAT,
                                                                  BackgroundRepeat.REPEAT,
                                                                  BackgroundPosition.DEFAULT,
                                                                  BackgroundSize.DEFAULT)));
		stop = true;
	}
	
	public void bi(ActionEvent c) {
		int ttt=r.nextInt(5);
		if(t!=ttt) t=ttt;
		Image image = new Image (getClass().getResourceAsStream("Image"+t+".jpg"));
        root.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.REPEAT,
                                                                  BackgroundRepeat.REPEAT,
                                                                  BackgroundPosition.DEFAULT,
                                                                  BackgroundSize.DEFAULT)));
		tt=-1;
		l.setText("00:00:00.00");
	}
	public static void main(String[] args) {
		launch(args);
	}
}

package application;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class EventHandle implements EventHandler<MouseEvent> {
	Main m;
	
	public EventHandle(Main m) {
		this.m=m;
	}

	public void handle(MouseEvent e) {
		System.out.println("x ÁÂÇ¥ : "+e.getX()+"y ÁÂÇ¥ : "+e.getY());
		for(int i=0; i<29; i++) {
			if(m.c[i].getRadius()*m.c[i].getRadius()>=(m.c[i].getCenterX()-e.getX())*(m.c[i].getCenterX()-e.getX())+(m.c[i].getCenterY()-e.getY())*(m.c[i].getCenterY()-e.getY())))
				
		}
	}

}

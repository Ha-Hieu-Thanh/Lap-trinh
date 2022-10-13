package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {
	
	@FXML
	private Canvas canvas;
	@FXML
	private Pane pane = new Pane();
	
	private int i;
	public void initialize() {
		pane.setOnMouseClicked(e->{
			i++;
			double x = e.getX();
			double y = e.getY();
			pane.getChildren().add(new Circle(x,y,20));
		});
		
	//	 GraphicsContext g = canvas.getGraphicsContext2D();
	//	canvas.setOnMouseClicked(e->{
	//		i++;
	//		double x = e.getX();
	//		double y = e.getY();
	//		g.setFill(Color.BLACK);
	//		g.strokeOval(x-25/2, y-25/2, 25, 25);
	//		g.fillText(""+i,x-5,y+5);
			
		};
		
	
		
		
	}


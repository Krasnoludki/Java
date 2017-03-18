package pakiet;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Car {

	GraphicsContext gc;

	public Car(GraphicsContext gc) {
		super();
		this.gc = gc;
	}

	public void drawCar(double x, double y, Color color) {
		wheel1(x,y+30,Color.BLACK);
		wheel2(x+55,y+30,Color.BLACK);
		maska(x+40,y,Color.FIREBRICK);
		drzwi(x+10,y-15,Color.FIREBRICK);
		bagaznik(x-10,y,Color.FIREBRICK);

	}
	
	public void drawShadow(double x,double y){
		wheel1(x,y+30,Color.LIGHTSTEELBLUE);
		wheel2(x+55,y+30,Color.LIGHTSTEELBLUE);
		maska(x+40,y,Color.ROSYBROWN);
		drzwi(x+10,y-15,Color.ROSYBROWN);
		bagaznik(x-10,y,Color.ROSYBROWN);
	
	}
	

	public void clearCar(double x, double y) {
		gc.setFill(Color.WHITE);
		wheel3(x,y+29,Color.WHITE);
		wheel4(x+55,y+29,Color.WHITE);
		maska(x+40,y,Color.WHITE);
		drzwi(x+10,y-15,Color.WHITE);
		bagaznik(x-10,y,Color.WHITE);

		


	}
	public void moves(int moves){
		gc.fillText("Liczba ruchów: "+ moves, 400, 20);
	}
	public void text(int moves)
	{
		gc.setFill(Color.BLACK);
		gc.fillText("Gratulacje uda³o ci siê ukoñczyæ grê w "+moves+" ruchach", 10, 20);
	}
	public void clearAll(){
		gc.setFill(Color.WHITE);
		gc.fillRect(0, 0, 500, 500);
	}

	public void wheel1(double x, double y, Color color) {
		gc.setFill(color);
		gc.fillRect(x, y, 15, 15);

	}

public void wheel2(double x, double y, Color color) {
	gc.setFill(color);
	gc.fillRect(x, y, 15, 15);

}

	public void maska(double x, double y, Color color) {
		gc.setFill(color);
		gc.fillRect(x, y, 35, 35);

	}

	public void drzwi(double x, double y, Color color) {
		gc.setFill(color);
		gc.fillRect(x, y, 50, 50);

	}

	public void bagaznik(double x, double y, Color color) {
		gc.setFill(color);
		gc.fillRect(x, y, 35, 35);
		
	}
	public void wheel3(double x, double y, Color color) {
		gc.setFill(color);
		gc.fillOval(x, y, 18, 18);

	}
	public void wheel4(double x, double y, Color color) {
		gc.setFill(color);
		gc.fillOval(x, y, 18, 18);

	}
	
}

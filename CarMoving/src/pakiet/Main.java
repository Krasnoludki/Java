package pakiet;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;


import java.util.Random;
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	
	Car car;
	int axisXCar;
	int axisYCar;
	int axisXShadow;
	int axisYShadow;
	int moves = 0;
	
	@Override
	public void start(Stage primary) throws Exception {
		
		
		
		
		
		
		primary.setTitle("Game");
		Group root = new Group();
		Canvas canvas = new Canvas(500, 500);
		root.getChildren().add(canvas);	
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		Random random = new Random();
		car = new Car(gc);
		
		
		
		axisXCar  = random.nextInt(400);
		axisYCar = random.nextInt(400);		
		axisXShadow = random.nextInt(400);
		axisYShadow = random.nextInt(400);
		car.drawShadow(axisXShadow, axisYShadow);
		car.drawCar(axisXCar, axisYCar, Color.FIREBRICK);
		car.moves(moves);
		
		
		Scene scene = new Scene(root, 500, 500);
		scene.setOnKeyPressed(createKeyEventHandler());
		primary.setScene(scene);
		primary.show();

	}
	private EventHandler<KeyEvent> createKeyEventHandler() {				
		return new EventHandler<KeyEvent>() {
			public void handle(KeyEvent ke) {
				if (ke.getCode() == KeyCode.A) {
					axisXCar = axisXCar - 10;
			 		car.clearAll();
					car.drawShadow(axisXShadow, axisYShadow);
					car.drawCar(axisXCar,axisYCar, Color.FIREBRICK);
					moves = moves +1;
					car.moves(moves);
					if(axisXCar == axisXShadow && axisYCar == axisYShadow ){						
						car.text(moves);												
					}
				}
				else if (ke.getCode()==KeyCode.D){
					axisXCar = axisXCar + 10;
					car.clearAll();
					car.drawShadow(axisXShadow, axisYShadow);
					car.drawCar(axisXCar,axisYCar, Color.FIREBRICK);
					moves = moves +1;
					car.moves(moves);
					if(axisXCar == axisXShadow && axisYCar == axisYShadow ){						
						car.text(moves);												
					}
				}
				else if (ke.getCode()==KeyCode.S){
					axisYCar = axisYCar + 10;
					car.clearAll();
					car.drawShadow(axisXShadow, axisYShadow);
					car.drawCar(axisXCar,axisYCar, Color.FIREBRICK);
					moves = moves +1;
					car.moves(moves);
					if(axisXCar == axisXShadow && axisYCar == axisYShadow ){						
						car.text(moves);												
					}
				}
				else if (ke.getCode()==KeyCode.W){
					axisYCar = axisYCar - 10;
					car.clearAll();
					car.drawShadow(axisXShadow, axisYShadow);
					car.drawCar(axisXCar,axisYCar, Color.FIREBRICK);
					moves = moves +1;
					car.moves(moves);
					if(axisXCar == axisXShadow && axisYCar == axisYShadow ){						
						car.text(moves);												
					}
				}
				else if (ke.getCode()==KeyCode.RIGHT){
					axisXCar = axisXCar + 1;
					car.clearAll();
					car.drawShadow(axisXShadow, axisYShadow);
					car.drawCar(axisXCar,axisYCar, Color.FIREBRICK);
					moves = moves +1;
					car.moves(moves);
					if(axisXCar == axisXShadow && axisYCar == axisYShadow ){						
						car.text(moves);												
					}
				}
				else if (ke.getCode()==KeyCode.DOWN){
					axisYCar = axisYCar + 1;
					car.clearAll();
					car.drawShadow(axisXShadow, axisYShadow);
					car.drawCar(axisXCar,axisYCar, Color.FIREBRICK);
					moves = moves +1;
					car.moves(moves);
					if(axisXCar == axisXShadow && axisYCar == axisYShadow ){						
						car.text(moves);												
					}
				}
				else if (ke.getCode()==KeyCode.UP){
					axisYCar = axisYCar - 1;
					car.clearAll();
					car.drawShadow(axisXShadow, axisYShadow);
					car.drawCar(axisXCar,axisYCar, Color.FIREBRICK);
					moves = moves +1;
					car.moves(moves);
					if(axisXCar == axisXShadow && axisYCar == axisYShadow ){						
						car.text(moves);												
					}
				}
				else if (ke.getCode()==KeyCode.LEFT){
					axisXCar = axisXCar - 1;
					car.clearAll();
					car.drawShadow(axisXShadow, axisYShadow);
					car.drawCar(axisXCar,axisYCar, Color.FIREBRICK);
					moves = moves +1;
					car.moves(moves);
					if(axisXCar == axisXShadow && axisYCar == axisYShadow ){						
						car.text(moves);												
					}
				}
				
				
			}

		};
	}
	

}


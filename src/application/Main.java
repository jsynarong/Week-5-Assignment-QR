package application;

import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	int rowNum = 60;

	int colNum = 60;

	int gridHeight = 10; 

	int gridWidth = 10;

	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane grid = new GridPane();

			Random rand = new Random();
//Random black and white pixels
			Color[] colors = { Color.BLACK, Color.WHITE };

			for (int row = 0; row < rowNum; row++) {

				for (int col = 0; col < colNum; col++) {

					int n = rand.nextInt(2);

					Rectangle rec = new Rectangle();

					rec.setWidth(10);

					rec.setHeight(10);

					rec.setFill(colors[n]);

					GridPane.setRowIndex(rec, row);

					GridPane.setColumnIndex(rec, col);

					grid.getChildren().addAll(rec);

				}
			}
			//QR code like image top left
			Rectangle q = new Rectangle(20, 5, 200, 200);
			q.setFill(Color.BLACK);
			q.setStroke(Color.WHITE);
			Rectangle q1 = new Rectangle(45, 25, 150, 150);
			q1.setFill(Color.WHITE);
			q1.setStroke(Color.BLACK);
			Rectangle q3 = new Rectangle(70, 55, 95, 95);
			q3.setFill(Color.BLACK);
			q3.setStroke(Color.WHITE);
			Group lc = new Group(q, q1, q3);
			grid.add(lc, 0, 0, 20, 20);

			//QR code like image bottom left
			
			Rectangle q4 = new Rectangle(20, 5, 200, 200);
			q4.setFill(Color.BLACK);
			q4.setStroke(Color.WHITE);
			Rectangle q5 = new Rectangle(45, 25, 150, 150);
			q5.setFill(Color.WHITE);
			q5.setStroke(Color.BLACK);
			Rectangle q6 = new Rectangle(70, 55, 95, 95);
			q6.setFill(Color.BLACK);
			q6.setStroke(Color.WHITE);
			Group lq = new Group(q4, q5, q6);
			grid.add(lq, 0, 40, 20, 20);
			
			//QR code like image top right
			
			Rectangle q7 = new Rectangle(20, 5, 200, 200);
			q7.setFill(Color.BLACK);
			q7.setStroke(Color.WHITE);
			Rectangle q8 = new Rectangle(45, 25, 150, 150);
			q8.setFill(Color.WHITE);
			q8.setStroke(Color.BLACK);
			Rectangle q9 = new Rectangle(70, 55, 95, 95);
			q9.setFill(Color.BLACK);
			q9.setStroke(Color.WHITE);
			Group lw = new Group(q7, q8, q9);
			grid.add(lw, 40, 0, 20, 20);
			
			//QR code like image bottom right
			
			Rectangle q10 = new Rectangle(20, 5, 100, 100);
			q10.setFill(Color.BLACK);
			q10.setStroke(Color.WHITE);
			Rectangle q11 = new Rectangle(35, 22, 70, 70);
			q11.setFill(Color.WHITE);
			q11.setStroke(Color.BLACK);
			Rectangle q12 = new Rectangle(58, 45, 25, 25);
			q12.setFill(Color.BLACK);
			q12.setStroke(Color.WHITE);
			Group lx = new Group(q10, q11, q12);
			grid.add(lx, 40, 40, 20, 20);

			Scene scene = new Scene(grid, 600, 600);

			primaryStage.setTitle("QR Code Sample");

			primaryStage.setScene(scene);

			primaryStage.show();

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

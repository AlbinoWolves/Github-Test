import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    protected static int speed = 7;
    protected static int GWidth = 0;
    protected static int GLength = 0;
    protected static int yFood = 0;
    protected static int xFood = 0;
    protected static boolean gameOver = false;
    protected static Random random = new Random();
    static Direction direction = Direction.RIGHT;



    enum Direction {
        LEFT,
        RIGHT,
        UP,
        DOWN,
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Snake Game");
        Button btn = new Button();
        btn.setText("Start Game'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
    }

    public static void spawnFood() {
        while (start == true) { 

        }

    }
    
    public static void direction() {

    }

    
            
        
        
        
    
}
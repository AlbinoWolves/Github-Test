import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    protected static int speed = 7;
    protected static int GWidth = 0;
    protected static int GLength = 0;
    protected static int yFood = 0;
    protected static int xFood = 0;
    protected static boolean gameOver = false;
    protected static Random random = new Random();
    protected static int cornerSize = 30;
    protected static List<Corner> snake = new ArrayList<>();
    static Direction direction = Direction.RIGHT;

    enum Direction {
        LEFT, RIGHT, UP, DOWN,
    }

    Corner corner = new Corner();
    int x = corner.getX();
    int y = corner.getY();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Button btn = new Button();
        btn.setText("Start Game");
        primaryStage.setTitle("Snake Game");

        Canvas canvas = new Canvas(GWidth * cornerSize, GLength * cornerSize);
        root.getChildren().add(canvas);
        root.getChildren().add(btn);

        new AnimationTimer() {
            long lastTick = 0;

            public void handle(long now) {
                if (lastTick == 0) {
                    lastTick = now;
                    return;
                }

                if (now - lastTick > 1000000000 / speed) {
                    lastTick = now;

                }
            }

        }.start();

        Scene scene = new Scene(root, GWidth * cornerSize, GLength * cornerSize);

        // Movement commands

        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();

    }

    public static void spawnFood() {

    }

    public static void direction() {

    }

}
package view;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Hanbeen Kim
 * @version 1.0
 */
public class iPod extends Application {
    public static Stage primaryStage;
    final private int DEFAULT_WIDTH = 1300;
    final private int DEFAULT_HEIGHT = 950;

    /**
     * this method is called upon running/launching the application
     * this method should display a scene on the stage
     * @param ps The primary Stage
     */
    public void start(Stage ps) {
        primaryStage = ps;
        /*
        TODO: - Display the MainScreen
              - Set the name of the stage
         */
    }

    /**
     * This is called by MainScreen
     */
    public void playlists() {
        /*
        TODO:
         */
    }

    /**
     * This is called by MainScreen
     */
    public void artists() {
        /*
        TODO:
         */
    }

    /**
     * This is called by MainScreen
     */
    public void albums() {
        /*
        TODO:
         */
    }

    /**
     * This is called by MainScreen
     */
    public void songs() {
        /*
        TODO:
         */
    }

    /**
     * This is the main method that launches the javafx application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

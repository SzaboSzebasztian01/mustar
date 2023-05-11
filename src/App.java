/*
 * File:App.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-05-11
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

import controllers.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import views.MainPanel;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        MainController mainController = new MainController();
        MainPanel mainPanel = mainController.getMainPanel();

        Scene scene = new Scene(mainPanel, 400, 300);
        stage.setScene(scene);
        stage.show();
        
    }
}

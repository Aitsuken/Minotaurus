package sample;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.File;

import static javafx.application.Platform.exit;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Font font = Font.font("Times New Roman", FontWeight.BOLD, 48);

        //System.out.println("Working Directory = " + System.getProperty("user.dir"));
        String playClick = System.getProperty("user.dir") + "/src/sounds/select.wav";
        String picture = System.getProperty("user.dir") + "/src/minotaur.png";
        Media click = new Media(new File(playClick).toURI().toString());
        BackgroundImage backGr = new BackgroundImage(new Image("https://imgur.com/a/A091Cye",1280,720,false,true),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Image image = new Image("/sample/minotaur.png");
        ImageView view = new ImageView(image);

        MediaPlayer clickPlayer = new MediaPlayer(click);

        //Buttons for menu
        int x = 0;
        Button bStart = new Button("Start");
        Button bSettings = new Button("Settings");
        Button bAbout = new Button("About");
        Button bExit = new Button("Exit");


        bStart.setPrefSize(200, 100);
        bExit.setPrefSize(200, 100);
        bSettings.setPrefSize(200, 100);
        bAbout.setPrefSize(200, 100);

        bStart.setLayoutY(x);
        x+=110;
        bSettings.setLayoutY(x);
        x+=110;
        bAbout.setLayoutY(x);
        x+=110;
        bExit.setLayoutY(x);

        Group root = new Group(view,bStart, bExit, bSettings, bAbout);

        Scene scene = new Scene(root, 1280, 720, Color.BEIGE);
        stage.setTitle("Minotaurus");
        stage.setScene(scene);
        stage.show();

        bStart.setOnAction(actionEvent ->  {
            clickPlayer.play();
            clickPlayer.setOnEndOfMedia(() -> {
                clickPlayer.stop();
            });
        });

        bSettings.setOnAction(actionEvent ->  {
            clickPlayer.play();
            clickPlayer.setOnEndOfMedia(() -> {
                clickPlayer.stop();
            });
        });

        bAbout.setOnAction(actionEvent ->  {
            clickPlayer.play();
            clickPlayer.setOnEndOfMedia(() -> {
                clickPlayer.stop();
            });
        });

        bExit.setOnAction(actionEvent ->  {
            clickPlayer.play();
            clickPlayer.setOnEndOfMedia(() -> {
                exit();
            });

        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}

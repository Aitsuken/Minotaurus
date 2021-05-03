package sample;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class sounds {

    String fileName;
    public static final MediaPlayer player = new MediaPlayer();
/*    file:///" + System.getProperty("user.dir").replace('\\', '/') + "/*/
    sounds(String fileName){
        this.fileName = fileName;
        Media m = new Media(fileName);
        player = new MediaPlayer(m);
    }
    public void play(){
            player.play();
    }
    public void stop(){
        player.stop();
    }
}

package BeautifulFlowers;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class BeautifulFlowersController implements Initializable {
    @FXML
    private ImageView flowersImageView;
    @FXML
    private Label flowersNote;
    @FXML
    private RadioButton roseRadioButton;
    @FXML
    private RadioButton callaLilyRadioButton;
    @FXML
    private RadioButton cannaRadioButton;
    @FXML
    private RadioButton bleedingHeartRadioButton;
    @FXML
    private RadioButton cherryBlossomRadioButton;

    private Image roseIMG;
    private Image bleedingHeartIMG;
    private Image callaLilyIMG;
    private Image cherryBlossomIMG;
    private Image cannaIMG;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // initialize images
        try {
            roseIMG = new Image(new FileInputStream("C:\\SE2203\\Exercise3\\src\\BeautifulFlowers\\Rose.gif"));
            bleedingHeartIMG = new Image(new FileInputStream("C:\\SE2203\\Exercise3\\src\\BeautifulFlowers\\Bleeding Heart.gif"));
            callaLilyIMG = new Image(new FileInputStream("C:\\SE2203\\Exercise3\\src\\BeautifulFlowers\\Calla Lily.gif"));
            cherryBlossomIMG = new Image(new FileInputStream("C:\\SE2203\\Exercise3\\src\\BeautifulFlowers\\Cherry Blossom.gif"));
            cannaIMG = new Image(new FileInputStream("C:\\SE2203\\Exercise3\\src\\BeautifulFlowers\\Canna.gif"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void roseRadioButtonListener() {
        // If this radio button is selected,
        // display image and data for Rose.
        if(roseRadioButton.isSelected()){
            flowersImageView.setImage(roseIMG);
            flowersNote.setText("This beautiful flower and symbol of love belongs the genus Rosa. The family name of this\n" +
                    "flower is Rosaceae and it contains different other species in almost all parts of the world. The\n" +
                    "flower of rose vary in size from each other depending upon the species to which they belong.\n" +
                    "A large number of species of this flower are found in different parts of Asia.");
        }
    }

    public void callaLilyRadioButtonListener() {
        // If this radio button is selected,
        // display image and data for Calla Lily.
        if(callaLilyRadioButton.isSelected()){
            flowersImageView.setImage(callaLilyIMG);
            flowersNote.setText("One simple and common name of this beautiful flower is arum lily and this flowering plant\n" +
                    "belongs to the family known as Araceae. This flowering plant is grown well in areas which\n" +
                    "have reasonable rainfall and moderate temperatures.");
        }
    }

    public void cannaRadioButtonListener() {
        // If this radio button is selected,
        // display image and data for Canna
        if(cannaRadioButton.isSelected()){
            flowersImageView.setImage(cannaIMG);
            flowersNote.setText("This beautiful flowering plant belongs to a genus that contain around 10 species and its family\n" +
                    "is known as Cannaceae. This flower plant also provides large quantity of starch which is\n" +
                    "further used for different purposes. This flower is mostly found in tropical regions of the\n" +
                    "world. The flowers of this plant have three sepals and three petals.\n");
        }
    }

    public void bleedingHeartRadioButtonListener() {
        // If this radio button is selected,
        // display image and data for Bleeding Heart.
        if(bleedingHeartRadioButton.isSelected()){
            flowersImageView.setImage(bleedingHeartIMG);
            flowersNote.setText("The bleeding heart flower belongs to the family known as Papaveraceae. This heart shaped\n" +
                    "flower is famous all over the world due to its unique beauty and is found in great numbers in\n" +
                    "Siberia and China. Blooming season of this flower starts in spring when there spread beautiful\n" +
                    "pink heart-shaped flowers in gardens. Lady-in-a-bath is also a common name of this flower.");
        }
    }

    public void cherryBlossomRadioButtonListener() {
        // If this radio button is selected,
        // display image and data for cherry blossom.
        if(cherryBlossomRadioButton.isSelected()){
            flowersImageView.setImage(cherryBlossomIMG);
            flowersNote.setText("Cherry blossom, a beautiful flowering plant is found in different parts of the world including\n" +
                    "the Northern Hemisphere. It is found in those areas which have moderate climate. All species\n" +
                    "of this flowering plant do not produce cherries as there are special species of this flower that\n" +
                    "produce edible cherries.");
        }
    }

}
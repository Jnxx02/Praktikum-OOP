package kalkulator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToReamur(double celsius) {
        return celsius * 4 / 5;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}

public class App extends Application {
    private Stage stage;
    
    @Override
    public void start(Stage mainStage) {
        stage = mainStage;
        
        //Stage
        stage.setTitle("Celcius Converter");
        stage.setScene(getScene1());
        stage.show();
    }

    private Scene getScene1() {
        //Set Image
        ImageView ivBanner = new ImageView("/image/Kalkulator.png");
        ivBanner.setFitWidth(180);
        ivBanner.setFitHeight(320);
        ivBanner.setPreserveRatio(true);

        //Label (Nama Aplikasi)
        Label tTitle = new Label("Konversi Celcius");

        //Button 1
        Button bMulai = new Button("MULAI");
        bMulai.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        //Section 1
        VBox section1 = new VBox(ivBanner, tTitle, bMulai);
        section1.setAlignment(Pos.CENTER);
        section1.setSpacing(8);

        //Scene 1
        Scene scene = new Scene(section1, 360, 640);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        return scene;
    }

    private Scene getScene2() {
        //Label (Pilih Menu)
        Label tSpace = new Label();
        Label tMenu = new Label("PILIH MENU");

        //Button 2
        Button bCalc1 = new Button("Celcius to Fahrenheit");
        bCalc1.setOnAction(v -> {
            stage.setScene(getScene3());
        });
        
        //Button 3
        Button bCalc2 = new Button("Celcius to Kelvin");
        bCalc2.setOnAction(v -> {
            stage.setScene(getScene4());
        });

        //Button 4
        Button bCalc3 = new Button("Celcius to Reamur");
        bCalc3.setOnAction(v -> {
            stage.setScene(getScene5());
        });

        //Button Extra
        Button bTitle = new Button("Back to Title");
        bTitle.setOnAction(v -> {
            stage.setScene(getScene1());
        });

        //Section 2
        VBox section2 = new VBox(tSpace, tMenu, bCalc1, bCalc2, bCalc3, bTitle);
        section2.setAlignment(Pos.TOP_CENTER);
        section2.setSpacing(8);

        //Scene 2
        Scene scene = new Scene(section2, 360, 640);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        return scene;
    }

    private Scene getScene3() {
        //Label (Hasil)
        Label hasil = new Label("Hasil");
        TextField tfhasil = new TextField();
        tfhasil.setEditable(false);

        //Label (Jenis Kalkulator)
        Label tSpace = new Label();
        Label tCalc1 = new Label("Celcius to Fahrenheit");
        TextField tfinput1 = new TextField();
        tfinput1.setPromptText("Input");
        tfinput1.textProperty().addListener((observable, oldValue, newValue) -> {
            double input1 = Double.parseDouble(newValue);
            double result = TemperatureConverter.celsiusToReamur(input1);

            tfhasil.setText(String.valueOf(result));
        });

        //Button 5
        Button bClear = new Button("Clear");
        bClear.setOnAction(v -> {
            tfinput1.clear();
            tfhasil.clear();
        });

        //Button 7
        Button bHome = new Button("Back to Home");
        bHome.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        //Section 4
        VBox section4 = new VBox(tSpace, tCalc1, tfinput1, hasil, tfhasil, bClear, bHome);
        section4.setAlignment(Pos.TOP_CENTER);
        section4.setSpacing(8);

        //Scene 3
        Scene scene = new Scene(section4, 360, 640);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        section4.requestFocus();
        return scene;
    }

    private Scene getScene4() {
        //Label (Hasil)
        Label hasil = new Label("Hasil");
        TextField tfhasil = new TextField();
        tfhasil.setEditable(false);

        //Label (Jenis Kalkulator)
        Label tSpace = new Label();
        Label tCalc1 = new Label("Celcius to Kelvin");
        TextField tfinput1 = new TextField();
        tfinput1.setPromptText("Input");
        tfinput1.textProperty().addListener((observable, oldValue, newValue) -> {
            double input1 = Double.parseDouble(newValue);
            double result = TemperatureConverter.celsiusToReamur(input1);

            tfhasil.setText(String.valueOf(result));
        });

        //Button 5
        Button bClear = new Button("Clear");
        bClear.setOnAction(v -> {
            tfinput1.clear();
            tfhasil.clear();
        });

        //Button 7
        Button bHome = new Button("Back to Home");
        bHome.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        //Section 4
        VBox section4 = new VBox(tSpace, tCalc1, tfinput1, hasil, tfhasil, bClear, bHome);
        section4.setAlignment(Pos.TOP_CENTER);
        section4.setSpacing(8);

        //Scene 3
        Scene scene = new Scene(section4, 360, 640);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        section4.requestFocus();
        return scene;
    }

    private Scene getScene5() {
        //Label (Hasil)
        Label hasil = new Label("Hasil");
        TextField tfhasil = new TextField();
        tfhasil.setEditable(false);

        //Label (Jenis Kalkulator)
        Label tSpace = new Label();
        Label tCalc1 = new Label("Celcius to Reamur");
        TextField tfinput1 = new TextField();
        tfinput1.setPromptText("Input");
        tfinput1.textProperty().addListener((observable, oldValue, newValue) -> {
            double input1 = Double.parseDouble(newValue);
            double result = TemperatureConverter.celsiusToReamur(input1);

            tfhasil.setText(String.valueOf(result));
        });

        //Button 5
        Button bClear = new Button("Clear");
        bClear.setOnAction(v -> {
            tfinput1.clear();
            tfhasil.clear();
        });

        //Button 7
        Button bHome = new Button("Back to Home");
        bHome.setOnAction(v -> {
            stage.setScene(getScene2());
            
        });

        //Section 4
        VBox section4 = new VBox(tSpace, tCalc1, tfinput1, hasil, tfhasil, bClear, bHome);
        section4.setAlignment(Pos.TOP_CENTER);
        section4.setSpacing(8);

        //Scene 3
        Scene scene = new Scene(section4, 360, 640);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        section4.requestFocus();
        return scene;
    }
    public static void main(String[] args) {
        launch();
    }
}

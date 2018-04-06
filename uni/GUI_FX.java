package uni;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI_FX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI_FX.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Uni");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void grade(ActionEvent e){
        System.out.println("Grade");
    }

    @FXML
    private void gradeAll(ActionEvent e){
        System.out.println("Grade all");
    }

    @FXML
    private void gradeAllInGroup(ActionEvent e){
        System.out.println("Grade group");
    }

    @FXML
    private void addStudent(ActionEvent e){
        System.out.println("Add student");
    }

    @FXML
    private void removeStudent(ActionEvent e){
        System.out.println("rm student");
    }

    @FXML
    private void addGroup(ActionEvent e){
        System.out.println("add gr");
    }

    @FXML
    private void removeGroup(ActionEvent e){
        System.out.println("rm gr");
    }

}
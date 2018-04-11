package uni;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GUI_FX extends Application {

    private List<Group> groupList = new ArrayList<Group>();

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
    private void gradeAll(ActionEvent e) {
        for(Group g : groupList){
            g.evaluateAll();
        }
    }

    @FXML
    private void addStudent(ActionEvent e) {
        try {
            ChoiceDialog<Group> dialog = new ChoiceDialog<Group>(groupList.get(0), groupList);
            dialog.setTitle("Add student");
            dialog.setHeaderText("Select group");

            Optional<Group> result = dialog.showAndWait();
            Group group = result.get();
            if (result.isPresent()) {
                TextInputDialog dialog2 = new TextInputDialog();
                dialog.setTitle("Add student");
                dialog.setHeaderText("Enter student's credentials");

                Optional<String> result2 = dialog2.showAndWait();
                if (result.isPresent()) {
                    Student s = new Student("", "");
                    s.setName(result2.get());
                    group.addStudent(s);
                }
            }
        } catch (IndexOutOfBoundsException ioobe)
        {
            System.out.println("Group list empty!");
        }

    }

    @FXML
    private void removeStudent(ActionEvent e) {
        try {
            ChoiceDialog<Group> dialog = new ChoiceDialog<Group>(groupList.get(0), groupList);
            dialog.setTitle("Remove student");
            dialog.setHeaderText("Select group");

            Optional<Group> result = dialog.showAndWait();
            Group group = result.get();

            if (result.isPresent()) {
                List<Student> list = group.getStudentList();

                ChoiceDialog<Student> dialog2 = new ChoiceDialog<Student>(list.get(0), list);
                dialog.setTitle("Remove student");
                dialog.setHeaderText("Select student to remove");

                Optional<Student> result2 = dialog2.showAndWait();
                if (result.isPresent()) {
                    group.removeStudent(result2.get());
                }
            }
        } catch (IndexOutOfBoundsException ioobe)
            {
                System.out.println("Student list or group list empty!");
            }

        }

    @FXML
    private void addGroup(ActionEvent e) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add group");
        dialog.setHeaderText("Enter the group's name");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            groupList.add(new Group(result.get()));
        }
    }

    @FXML
    private void removeGroup(ActionEvent e) {
        try {
            ChoiceDialog<Group> dialog = new ChoiceDialog<Group>(groupList.get(0), groupList);
            dialog.setTitle("Remove group");
            dialog.setHeaderText("Select group to remove");

            Optional<Group> result = dialog.showAndWait();
            if (result.isPresent()) {
                groupList.remove(result.get());
            }
        } catch (IndexOutOfBoundsException ioobe)
        {
            System.out.println("Group list is empty!");
        }
    }

}
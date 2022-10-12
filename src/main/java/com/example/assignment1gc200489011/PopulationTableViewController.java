package com.example.assignment1gc200489011;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PopulationTableViewController implements Initializable {

    @FXML
    private Button ChangetoGraphView;

    @FXML
    private TableView<People> tableView;

    @FXML
    private TableColumn<People, String> CodeColumn;

    @FXML
    private TableColumn<People, String > ContinentColumn;

    @FXML
    private TableColumn<People, String> NameColumn;

    @FXML
    private TableColumn<People, Integer> PopulationColumn;

    @FXML
    private TableColumn<People, String> RegionColumn;

    @FXML
    void OnChangetoGraphViewClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-graphview.fxml");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CodeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ContinentColumn.setCellValueFactory(new PropertyValueFactory<>("continent"));
        RegionColumn.setCellValueFactory(new PropertyValueFactory<>("region"));
        PopulationColumn.setCellValueFactory(new PropertyValueFactory<>("population"));

        tableView.getItems().addAll(DBUtility.getPopulationFromDB());
    }
}
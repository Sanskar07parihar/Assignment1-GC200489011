package com.example.assignment1gc200489011;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PopulationGraphViewContinentController implements Initializable {

    @FXML
    private Button ChangetoTableView;
    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis categoryAxisC;

    @FXML
    private RadioButton continentC;

    @FXML
    private RadioButton countryC;

    @FXML
    private NumberAxis numberAxisC;

    @FXML
    private RadioButton regionC;
    @FXML
    void OnChangetoTableViewClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-tableview.fxml");
    }

    @FXML
    void OncountryCClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-graphview.fxml");
    }

    @FXML
    void OnregionCClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-graphview-region.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        barChart.getData().addAll((DBUtility.getPopulationByContinent()));

    }

    public void OncontinentClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-graphview-continent.fxml");
    }

    public void OnregionClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-graphview-region.fxml");
    }
}
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

public class PopulationGraphViewRegionController implements Initializable {

    @FXML
    private Button ChangeTableView;
    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis categoryAxisR;

    @FXML
    private RadioButton continentR;

    @FXML
    private RadioButton countryR;

    @FXML
    private NumberAxis numberAxisR;

    @FXML
    private RadioButton regionR;

    @FXML
    void OnchangetoTableViewClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-tableview.fxml");
    }

    @FXML
    void OncontinentRClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-graphview-continent.fxml");
    }

    @FXML
    void OncountryRClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-graphview.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        barChart.getData().addAll((DBUtility.getPopulationByRegion()));

    }
}
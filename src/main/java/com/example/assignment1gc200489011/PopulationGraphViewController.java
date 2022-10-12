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

public class PopulationGraphViewController implements Initializable {

    @FXML
    private Button ChangetoTableView;

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis categoryAxis;

    @FXML
    private RadioButton continent;

    @FXML
    private RadioButton country;

    @FXML
    private NumberAxis numberAxis;

    @FXML
    private RadioButton region;

    public PopulationGraphViewController() {
    }

    @FXML
    void OnChangetoTableViewClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-tableview.fxml");

    }

    @FXML
    void OncontinentClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-graphview-continent.fxml");

    }

    @FXML
    void OnregionClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "population-graphview-region.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        barChart.getData().addAll((DBUtility.getPopulationByCountry()));

    }
}

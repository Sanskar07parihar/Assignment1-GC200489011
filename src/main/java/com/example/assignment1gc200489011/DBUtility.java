package com.example.assignment1gc200489011;

import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static String user = DBCredentials.user;
    private static String password = DBCredentials.password;


    private static String connectURL = "jdbc:mysql://127.0.0.1:3306/world";


    public static ArrayList<People> getPopulationFromDB()
    {
        ArrayList<People> peoples = new ArrayList<>();

        String sql = "SELECT * FROM country;";

        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                String code = resultSet.getString("code");
                String name = resultSet.getString("name");
                String continent = resultSet.getString("continent");
                String region = resultSet.getString("region");
                int population = resultSet.getInt("population");


                peoples.add(new People(code, name, continent, region, population));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return peoples;
    }

    public static XYChart.Series<String, Integer> getPopulationByCountry() {
        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        series.setName("Population");


        String sql = "SELECT Name, Population FROM country order by Population desc limit 10;";



        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                String name = resultSet.getString("name");
                int population = resultSet.getInt("population");

                series.getData().add(new XYChart.Data<>(name, population));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return series;
    }
    public static XYChart.Series<String, Integer> getPopulationByContinent() {
        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        series.setName("Population");


        String sql = " select continent, Population from country order by Population desc limit 10;";



        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                String continent = resultSet.getString("continent");
                int population = resultSet.getInt("population");

                series.getData().add(new XYChart.Data<>(continent, population));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return series;
    }
    public static XYChart.Series<String, Integer> getPopulationByRegion() {
        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        series.setName("Population");


        String sql = " select region, Population from country order by Population desc limit 10;";



        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                String region = resultSet.getString("region");
                int population = resultSet.getInt("population");

                series.getData().add(new XYChart.Data<>(region, population));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return series;
    }


}
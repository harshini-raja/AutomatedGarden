package com.example.garden.Views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GardenUserInterface extends Application {

    private GridPane flowerGrid, treeGrid, vegetableGrid, creeperGrid;
    private VBox monitoringDashboard;
    private StackPane centerPane;

    @Override
    public void start(Stage primaryStage) {
        // Root layout
        BorderPane root = new BorderPane();

        // Center view switcher
        centerPane = new StackPane();
        root.setCenter(centerPane);

        // Create MenuBar
        MenuBar menuBar = new MenuBar();
        Menu gardenMenu = new Menu("Garden Sections");
        MenuItem flowerItem = new MenuItem("Flower Garden");
        MenuItem treeItem = new MenuItem("Tree Section");
        MenuItem vegItem = new MenuItem("Vegetable Patch");
        MenuItem creeperItem = new MenuItem("Creeper Zone");

        gardenMenu.getItems().addAll(flowerItem, treeItem, vegItem, creeperItem);

        Menu monitorMenu = new Menu("Monitoring");
        MenuItem dashboardItem = new MenuItem("Dashboard");

        monitorMenu.getItems().add(dashboardItem);
        menuBar.getMenus().addAll(gardenMenu, monitorMenu);
        root.setTop(menuBar);

        // Create Grids
        flowerGrid = createGrid("Flower Garden");
        treeGrid = createGrid("Tree Section");
        vegetableGrid = createGrid("Vegetable Patch");
        creeperGrid = createGrid("Creeper Zone");

        monitoringDashboard = createMonitoringDashboard();

        // Default view
        switchCenter(flowerGrid);

        // Handle menu actions
        flowerItem.setOnAction(e -> switchCenter(flowerGrid));
        treeItem.setOnAction(e -> switchCenter(treeGrid));
        vegItem.setOnAction(e -> switchCenter(vegetableGrid));
        creeperItem.setOnAction(e -> switchCenter(creeperGrid));
        dashboardItem.setOnAction(e -> switchCenter(monitoringDashboard));

        // Set up scene
        Scene scene = new Scene(root, 1000, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Automated Garden System");
        primaryStage.show();
    }

    private GridPane createGrid(String title) {
        GridPane grid = new GridPane();
        grid.setStyle("-fx-padding: 10; -fx-hgap: 5; -fx-vgap: 5;");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                StackPane cell = new StackPane();
                cell.setMinSize(40, 40);
                String color = (i + j) % 2 == 0 ? "#D0F0C0" : "#90EE90";
                cell.setStyle("-fx-border-color: black; -fx-background-color: " + color + ";");
                grid.add(cell, i, j);
            }
        }
        return grid;
    }

    private VBox createMonitoringDashboard() {
        VBox box = new VBox(10);
        box.setStyle("-fx-padding: 20; -fx-background-color: #F5F5F5;");
        Label title = new Label("Monitoring Dashboard");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        Label placeholder = new Label("🌤 Weather, 🌡️ Temperature, 🌱 Plant Table, 🐛 Pest Logs here...");
        box.getChildren().addAll(title, placeholder);
        return box;
    }

    private void switchCenter(javafx.scene.Node node) {
        centerPane.getChildren().clear();
        centerPane.getChildren().add(node);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

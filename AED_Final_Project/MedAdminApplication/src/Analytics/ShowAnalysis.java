/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytics;

import Business.EcoSystem;
import Business.Order.Patient;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JFrame;

/**
 *
 * @author keshav
 */
public class ShowAnalysis {

    private EcoSystem system;

    public void initAndShowGUI(EcoSystem system) {
        // This method is invoked on the EDT thread
        this.system = system;
        JFrame frame = new JFrame("Analytics");
        final JFXPanel fxPanel = new JFXPanel();
        frame.add(fxPanel);
        frame.setSize(1200, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFX(fxPanel);
            }
        });
    }

    private void initFX(JFXPanel fxPanel) {
        // This method is invoked on the JavaFX thread
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    private Scene createScene() {
        int numberOfInteractions = 0;
        int numberOfInteractionsOverride = 0;
        int numberOfHighRiskPatientsConsulted = 0;
        int numberOfMedicationsReminded = 0;
        int Orders = 0;
        int LabOrders = 0;
        int OrdersPlaced = 0;
        int LabOrdersPlaced = 0;
        int PatientsConsulted = 0;
        
        for (Patient patient : system.getPatientList().getPatientList()) {
            numberOfInteractions = numberOfInteractions + patient.getInteractionCount();
            numberOfInteractionsOverride = numberOfInteractionsOverride + patient.getOverrideCount();
            numberOfHighRiskPatientsConsulted = numberOfHighRiskPatientsConsulted + patient.getHighRiskConsultationCount();
            numberOfMedicationsReminded = numberOfMedicationsReminded + patient.getReminderCount();
        }

        Orders = system.getDrugListObject().getDrugList().size();
        LabOrders = system.getLabListDirectory().getLabList().size();

        PatientsConsulted = system.getPatientList().getPatientList().size();
        for (Patient patient : system.getPatientList().getPatientList()) {
            OrdersPlaced = OrdersPlaced + patient.getOrderList().getOrderList().size();
            LabOrdersPlaced = LabOrdersPlaced + patient.getLabOrderList().getLabOrderList().size();
        }

        HBox root = new HBox();

        Scene scene = new Scene(root, 480, 330);
        CategoryAxis xAxis = new CategoryAxis();

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Instances");

        BarChart barChart = new BarChart(xAxis, yAxis);
        barChart.setTitle("Usability of the components");

        XYChart.Series data = new XYChart.Series();

        data.getData().add(new XYChart.Data("Interactions fired", numberOfInteractions));
        data.getData().add(new XYChart.Data("Interactions override", numberOfInteractionsOverride));
        data.getData().add(new XYChart.Data("High Risk Patients Consulted", numberOfHighRiskPatientsConsulted));
        data.getData().add(new XYChart.Data("Medications Reminded", numberOfMedicationsReminded));;

        barChart.getData().add(data);
        barChart.setLegendVisible(false);

        root.getChildren().add(barChart);

        ObservableList<PieChart.Data> pieChartDataPlaced
                = FXCollections.observableArrayList(
                        new PieChart.Data("Lab Orders(" + String.valueOf(LabOrders) + ")", LabOrders),
                        new PieChart.Data("Drug Orders(" + String.valueOf(OrdersPlaced) + ")", OrdersPlaced),
                        new PieChart.Data("Patients Consulted(" + String.valueOf(PatientsConsulted) + ")", PatientsConsulted));

        PieChart pieChartPlaced = new PieChart(pieChartDataPlaced);
        pieChartPlaced.setTitle("Orders/Lab Orders/ Placed");

        root.getChildren().add(pieChartPlaced);

        ObservableList<PieChart.Data> pieChartDataCreated
                = FXCollections.observableArrayList(
                        new PieChart.Data("Lab Orders(" + String.valueOf(Orders) + ")", Orders),
                        new PieChart.Data("Drug Orders(" + String.valueOf(LabOrders) + ")", LabOrders));

        PieChart pieChartCreated = new PieChart(pieChartDataCreated);
        pieChartCreated.setTitle("Orders/Lab Orders Created");

        root.getChildren().add(pieChartCreated);

        return scene;
    }
}

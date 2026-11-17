package hu.unideb.inf.springdatafx_k10.frontend;

import hu.unideb.inf.springdatafx_k10.SpringDataFxK10Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainPageController {
    public Label nameLabel;
    ConfigurableApplicationContext ctx;

    public void startBackend(ActionEvent actionEvent) {
        ctx = SpringApplication.run(SpringDataFxK10Application.class);
    }

    public void printData(ActionEvent actionEvent) {
        SpringDataFxK10Application app =
                ctx.getBean(SpringDataFxK10Application.class);

        app.printDataBackend();
        System.out.println("Printing data - frontend " + app.getPerson());
        nameLabel.setText(app.getPerson().getName());
    }

    public void stopBackend(ActionEvent actionEvent) {
        ctx.close();
    }
}

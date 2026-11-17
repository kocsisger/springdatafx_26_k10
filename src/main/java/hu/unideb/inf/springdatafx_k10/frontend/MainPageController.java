package hu.unideb.inf.springdatafx_k10.frontend;

import hu.unideb.inf.springdatafx_k10.SpringDataFxK10Application;
import javafx.event.ActionEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainPageController {
    ConfigurableApplicationContext ctx;

    public void startBackend(ActionEvent actionEvent) {
        ctx = SpringApplication.run(SpringDataFxK10Application.class);
    }

    public void printData(ActionEvent actionEvent) {
    }

    public void stopBackend(ActionEvent actionEvent) {
        ctx.close();
    }
}

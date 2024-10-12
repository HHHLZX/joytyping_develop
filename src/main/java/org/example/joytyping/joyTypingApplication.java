package org.example.joytyping;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//本软件仅供学习使用，请勿用作商业用途。
public class joyTypingApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(joyTypingApplication.class.getResource("joyTyping.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("joyTyping");
        stage.setScene(scene);
        // 在关闭请求时处理
        stage.setOnCloseRequest(event -> {
            // 确保安全退出
            Platform.exit(); // 结束 JavaFX 应用程序
            System.exit(0); // 确保 JVM 进程退出
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

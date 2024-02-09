package org.example.joytyping;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
//本软件仅供学习使用，请勿用作商业用途。
public class joyTypingController {
    @FXML
    private Label ListenText;
    @FXML
    private ImageView leftImageView;
    @FXML
    private Circle leftCircle;
    @FXML
    private ImageView rightImageView;
    @FXML
    private Circle rightCircle;
    @FXML
    private StackPane leftStackPane;
    @FXML
    private StackPane rightStackPane;
    private final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

    // 在这里添加一个方法，用于更改图片上点的 XY 值
    public void updatePointPosition(double leftX, double leftY, double rightX, double rightY) {
        // 设置左边图片上点的位置
        Insets leftMargin = new Insets(leftY, 0, 0, leftX);
        StackPane.setMargin(leftCircle, leftMargin);

        // 设置右边图片上点的位置
        Insets rightMargin = new Insets(rightY, 0, 0, rightX);
        StackPane.setMargin(rightCircle, rightMargin);
    }

    @FXML
    protected void onListen() {
        ListenText.setText("Listen joy.");
//        listener.listener(true);
//        updatePointPosition(300, 300, -300, -300);
        listener listener = new listener();
        listener.start();
        executorService.scheduleAtFixedRate(() -> {
            float LX = listener.LX * 290;
            float LY = -listener.LY * 290;
            float RX = listener.RX * 290;
            float RY = -listener.RY * 290;
            Platform.runLater(() -> updatePointPosition(LX, LY, RX, RY));
        }, 0, 20, TimeUnit.MILLISECONDS);
    }

    public void shutdown() {
        executorService.shutdown();
    }
}

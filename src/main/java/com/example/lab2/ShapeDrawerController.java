package com.example.lab2;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class ShapeDrawerController {
    @FXML
    private Canvas canvas;
    @FXML
    private ColorPicker fillColorPicker;
    @FXML
    private ColorPicker strokeColorPicker;
    @FXML
    private Spinner<Double> sizeSpinner;
    @FXML
    private Button circleButton;
    @FXML
    private Button rectangleButton;
    @FXML
    private Button roundedRectangleButton;
    @FXML
    private Button squareButton;
    @FXML
    private Button ellipseButton;

    private GraphicsContext gc;
    private Shape lastDrawnShape;

    @FXML
    public void initialize() {
        gc = canvas.getGraphicsContext2D();

        // Устанавливаем начальное значение Spinner
        sizeSpinner.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(1, 500, 100, 1));
    }

    @FXML
    private void onCircleClick() {
        Double size = sizeSpinner.getValue();
        if (size != null) {
            drawShape(new Circle(fillColorPicker.getValue(), strokeColorPicker.getValue(), 100, 100, size / 2));
        } else {
            System.out.println("Размер круга не установлен.");
        }
    }

    @FXML
    private void onRectangleClick() {
        Double size = sizeSpinner.getValue();
        if (size != null) {
            drawShape(new Rectangle(fillColorPicker.getValue(), strokeColorPicker.getValue(), 100, 100, size, size / 2));
        } else {
            System.out.println("Размер прямоугольника не установлен.");
        }
    }

    @FXML
    private void onRoundedRectangleClick() {
        Double size = sizeSpinner.getValue();
        if (size != null) {
            drawShape(new RoundedRectangle(fillColorPicker.getValue(), strokeColorPicker.getValue(), 100, 100, size, size / 2, 20, 20));
        } else {
            System.out.println("Размер закругленного прямоугольника не установлен.");
        }
    }

    @FXML
    private void onSquareClick() {
        Double size = sizeSpinner.getValue();
        if (size != null) {
            drawShape(new Square(fillColorPicker.getValue(), strokeColorPicker.getValue(), 100, 100, size));
        } else {
            System.out.println("Размер квадрата не установлен.");
        }
    }

    @FXML
    private void onEllipseClick() {
        Double size = sizeSpinner.getValue();
        if (size != null) {
            drawShape(new Ellipse(fillColorPicker.getValue(), strokeColorPicker.getValue(), 100, 100, size, size / 2));
        } else {
            System.out.println("Размер эллипса не установлен.");
        }
    }

    private void drawShape(Shape shape) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        shape.draw(gc);
        lastDrawnShape = shape;
        System.out.println("Last drawn shape: " + lastDrawnShape);
    }
}
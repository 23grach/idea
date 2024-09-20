package com.example.lab2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    public Rectangle(Color fillColor, Color strokeColor, double x, double y, double width, double height) {
        super(fillColor, strokeColor, x, y, width, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(fillColor);
        gc.setStroke(strokeColor);
        gc.fillRect(x, y, width, height);
        gc.strokeRect(x, y, width, height);
    }
}
package com.example.lab2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RoundedRectangle extends Rectangle {
    private double arcWidth;
    private double arcHeight;

    public RoundedRectangle(Color fillColor, Color strokeColor, double x, double y, double width, double height, double arcWidth, double arcHeight) {
        super(fillColor, strokeColor, x, y, width, height);
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(fillColor);
        gc.setStroke(strokeColor);
        gc.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
        gc.strokeRoundRect(x, y, width, height, arcWidth, arcHeight);
    }
}
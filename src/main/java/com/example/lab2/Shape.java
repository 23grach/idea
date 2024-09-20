package com.example.lab2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected Color fillColor;
    protected Color strokeColor;
    protected double x;
    protected double y;
    protected double width;
    protected double height;

    public Shape(Color fillColor, Color strokeColor, double x, double y, double width, double height) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract double getArea();
    public abstract void draw(GraphicsContext gc);
}
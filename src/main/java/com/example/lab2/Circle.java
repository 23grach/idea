package com.example.lab2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape
{
    public Circle(Color fillColor, Color strokeColor, double x, double y, double radius)
    {
        super(fillColor, strokeColor, x, y, radius * 2, radius * 2);
    }

    @Override
    public double getArea()
    {
        return Math.PI * width * height / 4;
    }

    @Override
    public void draw(GraphicsContext gc)
    {
        gc.setFill(fillColor);
        gc.setStroke(strokeColor);
        gc.fillOval(x, y, width, height);
        gc.strokeOval(x, y, width, height);
    }
}
package com.example.lab2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ellipse extends Shape
{
    public Ellipse(Color fillColor, Color strokeColor, double x, double y, double width, double height)
    {
        super(fillColor, strokeColor, x, y, width, height);
    }

    @Override     public double getArea()
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
package com.example.lab2;

import javafx.scene.paint.Color;

public class Square extends Rectangle {
    public Square(Color fillColor, Color strokeColor, double x, double y, double size) {
        super(fillColor, strokeColor, x, y, size, size);
    }
}
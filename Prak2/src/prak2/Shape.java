package prak2;

public class Shape {
    private String color;
    private String type_shape;

    public Shape(String color, String type_shape)
    {
        this.color = color;
        this.type_shape = type_shape;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setType_shape(String type_shape)
    {
        this.type_shape = type_shape;
    }

    public String getColor()
    {
        return color;
    }

    public String getType_shape()
    {
        return type_shape;
    }

    public String toString()
    {
        return "Shape{color is " + color + ", type_shape is " + type_shape + "}";
    }
}

package prak2;

public class Ball {
    private String color;
    private String type_ball;

    public Ball(String color, String type_ball)
    {
        this.color = color;
        this.type_ball = type_ball;
    }

    public String getColor(){
        return color;
    }

    public String getType_ball()
    {
        return type_ball;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setType_ball(String type_ball)
    {
        this.type_ball = type_ball;
    }

    public String toString()
    {
        return "Ball is " + color + " color and for " + type_ball + " game.";
    }
}

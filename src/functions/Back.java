package functions;

import backEnd.Turtle;
public class Back extends TurtleFunction {
    private double myDistance;
    
    public Back (Turtle turtle, double distance) {
        super(turtle);
        myDistance = distance;
    }
    @Override
    public String execute(String input) {
        getTurtle().move(-myDistance);
        return "";
    }

}

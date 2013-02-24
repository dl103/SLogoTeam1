package backEnd;

import controller.Workspace;
import functions.Function;

public class Model {

    private Workspace myController;
    private Turtle myTurtle;
    private Interpreter myInterpreter;
    
    public Model(Workspace controller){
        myController = controller;
        myTurtle = new Turtle(myController);
        myInterpreter = new Interpreter(myTurtle, this);
    }
    
    /**
     * The model handles execute, processString can be called recursively to 
     * deal with situations such as repeat
     * 
     * @param s from workspace or recursive command
     * @return output that should be printed in the GUI
     * 
     */
    public double processString (String s) {
        Function function = myInterpreter.processString(s);
        return function.execute();
    }
}

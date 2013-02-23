package controller;

import java.util.Observable;
import java.util.Observer;
import backEnd.Model;
import frontEnd.Canvas;

public class Workspace implements Observer{

    private Canvas myView;
    private Model myModel;
    
    public Workspace(Canvas view){
        myView = view;
        myModel = new Model(this);
    }
    
    
    @Override
    public void update (Observable arg0, Object arg1) {
        // TODO Auto-generated method stub
        
    }

}

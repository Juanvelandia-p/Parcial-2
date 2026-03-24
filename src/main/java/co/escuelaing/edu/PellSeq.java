package co.escuelaing.edu;

import java.util.ArrayList;

public class PellSeq {
    private final String operation = "Secuencia de Pell";
    private int input;
    private ArrayList output;

    public PellSeq(){
        output = new ArrayList<>();
    }

    public void setInput(int i){
        input = i;
    }

    public void setOutput(ArrayList o){
        output = o;
    }
}

package co.escuelaing.edu;

public class ResponsePellSeq {
    private String operation;
    private int input;
    private String output;

    public ResponsePellSeq(String operation, int input, String output) {
        this.operation = operation;
        this.input = input;
        this.output = output;
    }

    public String getOperation() { return operation; }
    public int getInput() { return input; }
    public String getOutput() { return output; }
}

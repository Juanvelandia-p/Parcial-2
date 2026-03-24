package co.escuelaing.edu;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    public ArrayList output;

    @GetMapping("/pellseq")
    public PellSeq answerPellSeq(@RequestParam(value = "value") int value) {
        PellSeq answer = new PellSeq();
        output = new ArrayList<>();
        answer.setInput(value);
        pellSeqCalc(value);
        answer.setOutput(output);
        return answer;
    }

    
    public int pellSeqCalc(int value){
        output.add(0,value);
        if (value == 0) {
            return 0;
        }
        else if (value == 1) {
            return 1;
        }
        else{
            return 2*pellSeqCalc(value-1)+pellSeqCalc(value-2);
        }
    }
}

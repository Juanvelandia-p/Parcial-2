package co.escuelaing.edu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MathController {

    @GetMapping("/pellseq")
    public ResponsePellSeq answerPellSeq(@RequestParam int value) {
        List<Integer> sequence = computePellSequence(value);
        String output = sequence.stream()
                                .map(String::valueOf)
                                .collect(Collectors.joining(", "));
        return new ResponsePellSeq("Secuencia de Pell", value, output);
    }

    private List<Integer> computePellSequence(int n) {
        List<Integer> seq = new ArrayList<>();
        if (n >= 0) seq.add(0);
        if (n >= 1) seq.add(1);
        for (int i = 2; i <= n; i++) {
            int value = 2 * seq.get(i - 1) + seq.get(i - 2);
            seq.add(value);
        }
        return seq;
    }
}

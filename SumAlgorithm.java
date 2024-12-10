public class SumAlgorithm implements Algorithm {

    int sum;

    @Override
    public int[] run(int[] input) {
        int sum = 0;
        for(int num: input) {
            sum += num;
        }

        this.sum = sum;
        return input;
    }

    
}
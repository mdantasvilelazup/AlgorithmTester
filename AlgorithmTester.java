public class AlgorithmTester {

    public Algorithm algorithm;

    public AlgorithmTester(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public long test(int size) {
        int[] input = generateRandomInput(size);

        long start = System.nanoTime();
        algorithm.run(input);
        long end = System.nanoTime();
        
        long time = (end - start)/1000;
        System.out.println("Algorithm ran in " + time + " ms");

        return time;
    }

    public int[] generateRandomInput(int size) {
        int out[] = new int[size];

        for(int i = 0; i<size; i++) {
            out[i] = (int)(Math.random() * size);
        }

        return out;
    }

    public void print(int[] array) {
        System.out.print("[");
        for(int num: array) {
            System.out.print(num + ", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Algorithm sum = new SumAlgorithm();
        AlgorithmTester tester = new AlgorithmTester(sum);
        
        int[] array = tester.generateRandomInput(100);

        tester.print(array);
        tester.test(100);
    }


}
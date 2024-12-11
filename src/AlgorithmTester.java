package src;

public class AlgorithmTester {

	public MergeAndSortAlgorithm algorithm;

	public AlgorithmTester(MergeAndSortAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public long test(int size) {
		int[] input = generateRandomInput(size);

		long start = System.nanoTime();
		algorithm.run(input);
		long end = System.nanoTime();

		long time = (end - start) / 1000;
		System.out.println("src.Algorithm ran in " + time + " ms");

		return time;
	}

	public int[] generateRandomInput(int size) {
		int out[] = new int[size];

		for (int i = 0; i < size; i++) {
			out[i] = (int) (Math.random() * size);
		}

		return out;
	}

	public void print(int[] array) {
		System.out.print("[");
		for (int num : array) {
			System.out.print(num + ", ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		MergeAndSortAlgorithm algorithm = new MergeAndSortAlgorithm();
		//Algorithm sum = new SumAlgorithm();
		//AlgorithmTester tester = new AlgorithmTester(sum);
		AlgorithmTester tester2 = new AlgorithmTester(algorithm);
		int[] array = tester2.generateRandomInput(100);

		System.out.println("Após a ordenação...");

		tester2.print(array);
		tester2.test(100);
	}


}
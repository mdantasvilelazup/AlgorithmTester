package src;

public class AlgorithmTester {

	public MergeAndSortAlgorithm algorithm;

	public AlgorithmTester(MergeAndSortAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public long test(int size) {
		int[] input = generateRandomInput(size);
		System.out.println("Input aleatório gerado: ");
		print(input);
		System.out.println();

		long start = System.nanoTime();
		int[] result = algorithm.run(input);
		long end = System.nanoTime();

		System.out.println("Resultado do algoritmo: ");
		print(result);
		System.out.println();

		long time = (end - start) / 1000;
		System.out.println("Algoritmo executado em " + time + " ms");

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
		AlgorithmTester tester = new AlgorithmTester(algorithm);

		tester.test(100);
	}


}
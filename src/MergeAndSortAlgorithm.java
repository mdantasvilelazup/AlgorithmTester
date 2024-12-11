package src;

public class MergeAndSortAlgorithm implements Algorithm {
	@Override
	public int[] run(int[] input) {
		return MergeAndSort.sort(input, 0, input.length - 1);
	}
}

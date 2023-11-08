public class ArrayValueCalculator {
    public static int doCalc(String[][] elements) throws ArraySizeException, ArrayDataException {
        int sum = 0;

        if (elements.length != 4) {
            throw new ArraySizeException("Size of array no correct, it must be 4*4 !");
        }

        for (String[] row : elements) {
            if (row.length != 4) {
                throw new ArraySizeException("Size of array no correct, it must be 4*4 !");
            }
        }

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                try {
                    int res = Integer.parseInt(elements[i][j]);
                    sum += res;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Error in element with index " + "[" + i + " " + j + "]"
                            + " value " + elements[i][j]);
                }

            }

        }
        return sum;
    }
}

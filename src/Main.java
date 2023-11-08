public class Main {
    public static void main(String[] args) {
        String[][] mas = {
                {"1", "2", "3", "4"},
                {"5a", "6", "7","8"},
                {"9", "1", "2", "3"},
                {"4", "5", "6", "6"}
        };
        try {

            int result = ArrayValueCalculator.doCalc(mas);
            System.out.println("Result " + result);

        } catch (ArraySizeException | ArrayDataException e) {

            System.out.println(e.getMessage());
        }
    }
}

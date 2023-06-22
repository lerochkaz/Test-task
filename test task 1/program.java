
public class program {
    public static void main(String[] args) throws EqualValueException {
        Comparison comparison = new Comparison();
        System.out.println(comparison.printComparisonResult("вес", new Hippopotamus(), new Bicycle()));
        System.out.println(comparison.printComparisonResult("скорость", new Hippopotamus(), new Bicycle()));
    }

}


public class program {
    public static void main(String[] args) throws EqualValueException {
        Comparison comparison = new Comparison();
        Hippopotamus hippopotamus = new Hippopotamus();
        Bicycle bicycle = new Bicycle();
        hippopotamus.printAboutObject();
        bicycle.printAboutObject();
        System.out.println(comparison.resultComparison("вес", hippopotamus, bicycle));
        System.out.println(comparison.resultComparison("скорость", hippopotamus, bicycle));
    }

}

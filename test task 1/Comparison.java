import java.io.IOException;

public class Comparison {

    // Метод сравнения веса(приватный, буду его использовать в методе
    // resultComparison). Возвращает объект имеющий больший вес либо
    // выбрасывает
    // ошибку EqualValueException. Далее ошибку необходимо будет
    // обработать в try-catch по своему усмотрению (т.к она наследуется от
    // IOException)
    private static Comparable weightComparison(Comparable firstObject, Comparable secondObject)
            throws EqualValueException {
        int firstWeight = firstObject.getWeight();
        int secondWeight = secondObject.getWeight();
        if (firstWeight == secondWeight)
            throw new EqualValueException("Вес равен");
        if (firstWeight > secondWeight)
            return firstObject;
        return secondObject;
    }

    // Метод сравнения скорости(приватный, буду его использовать в методе
    // resultComparison). Возвращает объект имеющий большую скорость либо
    // выбрасывает
    // ошибку EqualValueException. Далее ошибку необходимо будет
    // обработать в try-catch по своему усмотрению (т.к она наследуется от
    // IOException)
    private static Comparable speedComparison(Comparable firstObject, Comparable secondObject)
            throws EqualValueException {
        int firstSpeed = firstObject.getSpeed();
        int secondSpeed = secondObject.getSpeed();
        if (firstSpeed == secondSpeed)
            throw new EqualValueException("Скорость равна");
        if (firstSpeed > secondSpeed)
            return firstObject;
        return secondObject;
    }

    // Метод который возвращает строку с результатом сравнения. В аргументы метода
    // передается строка с названием того, что мы хотим измерить. В данном
    // функционале предусмотрено только измерение веса и скорости, но можно
    // доработать и сделать сравнение по любым критериям например: цвету,
    // коэффициенту полезности, стоимости, затрат на содержание, цвету, сроку
    // жизни/пользования и так далее (на что хватит фантазии). А так же два объекта
    // для сравнения.
    public String resultComparison(String whatMeasurement, Comparable firstObject,
            Comparable secondObject) {
        String lowerCaseMeasurement = whatMeasurement.toLowerCase();
        String result = null;
        try {
            switch (lowerCaseMeasurement) {
                case "вес":
                    result = weightComparison(firstObject, secondObject).toString();
                    break;
                case "скорость":
                    result = speedComparison(firstObject, secondObject).toString();
                    break;
                default:
                    throw new IOException("Введен некорректный параметр: " + lowerCaseMeasurement);
            }
            return "Побеждает " + result + ". Он имеет " + lowerCaseMeasurement + " больше";
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}

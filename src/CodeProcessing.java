public class CodeProcessing {

    private double result = 0;
    private Sign sign = Sign.START;
    private final Calculations calculations;

    CodeProcessing(Calculations calculations) {
        this.calculations = calculations;
    }

    //Обработка числовых значений

    public void numProcessing(double input) {

        switch (sign) {
            case START:
                result = input;
                break;

            case ADD:
                result = calculations.addingNumbers(result, input);
                System.out.println(result);
                sign = Sign.START;
                break;

            case SUB:
                result = calculations.subtractingNumbers(result, input);
                System.out.println(result);
                sign = Sign.START;
                break;

            case MUL:
                result = calculations.multiplyingNumbers(result, input);
                System.out.println(result);
                sign = Sign.START;
                break;

            case DIV:
                result = calculations.dividingNumbers(result, input);
                System.out.println(result);
                sign = Sign.START;
                break;

        }
    }


    public void stringProcessing(String str) {
        switch (str) {
            case "c":
                result = 0;
                sign = Sign.START;

                System.out.println("Сбрасываю значения"+ " Result = " + result + "Sign = " + sign);

                break;
            case "s":
                Application.stopApplication();
                break;
            case "+":
                sign = Sign.ADD;
                break;
            case "-":
                sign = Sign.SUB;
                break;
            case "*":
                sign = Sign.MUL;
                break;
            case "/":
                sign = Sign.DIV;
                break;

            default:
                System.out.println("Incorrect input");
                break;
        }
    }
}

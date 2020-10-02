public class Calculator {
    public static void main(String[] args) {
        Calculations calculations = new Calculations();
        CodeProcessing codeProcessing = new CodeProcessing(calculations);
        Application app = new Application(codeProcessing);
        app.run();
    }
}

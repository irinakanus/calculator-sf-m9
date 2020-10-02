import java.util.Scanner;

public class Application {
    double a = 0;
    String str = "";
    static boolean runFlag = true;
    CodeProcessing code;

    Application(CodeProcessing codeProcessing) {
        this.code = codeProcessing;
    }

    public void run() {
        while (runFlag) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                code.numProcessing(scanner.nextDouble());
            } else {
                str = scanner.nextLine();
                code.stringProcessing(str);
            }
        }
    }

    public static void stopApplication(){
        runFlag = false;
    }
}

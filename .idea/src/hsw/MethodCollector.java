public class MethodCollector {

    /**
     * Die main-Methode ruft alle statischen
     * Methoden nacheinander auf.
     * @param args
     */
    public static void main(String[] args) {
        int methodCounter = 1;
        // Erste Methode
        System.out.println("Method " + methodCounter + ":" );
        aFirstMethod();
        methodCounter++;
        methodJonas();
        methodCounter++;
// hier kann die nächste Methode folgen.
    }


    private static void aFirstMethod() {
        System.out.println("MethodCollector.aFirstMethod: This method has been created by ");
    }

    private static void methodJonas() {
        System.out.println("MethodCollector.methodJonas: This method has been created by Jonas");
    }


}
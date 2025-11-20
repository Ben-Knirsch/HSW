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
// hier kann die nächste Methode folgen.

        aMsNonchalantMethod();
        methodCounter++;
    }


    private static void aFirstMethod() {
        System.out.println("MethodCollector.aFirstMethod: This method has been created by ");
    }

    public static void aMsNonchalantMethod() {
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║     Method by MsNonchalant    ║");
        System.out.println("╚═══════════════════════════════╝");
    }
}
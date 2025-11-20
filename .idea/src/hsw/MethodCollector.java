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
        aLastMethod();
        methodCounter++;
// hier kann die nächste Methode folgen.

        aNicoMethod();
        methodCounter++;
        ausgabe();
        aHeisobtMethod();
        methodCounter++;
    }


    private static void aFirstMethod() {
        System.out.println("MethodCollector.aFirstMethod: This method has been created by ");
    }

    private static void aNicoMethod() {
        System.out.println("MethodCollector.aFirstMethod: This method has been created by Nico");
    private static void ausgabe() {
        System.out.println("Hallo Welt!");
    private static void aHeisobtMethod() {
        System.out.println("MethodCollector.aHeisobtMethod: This method has been created by heisob");
    }


}
    private static void aLastMethod() {
        System.out.println("MethodCollector.aFirstMethod: This method has been created by BenH@sstEMails");
    }
}

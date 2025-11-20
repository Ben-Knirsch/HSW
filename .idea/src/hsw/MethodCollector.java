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
        eddyMethod();
        methodCounter++;
        methodJonas();
        methodCounter++;
// hier kann die nächste Methode folgen.
        marcelKeckerMethod();
        ausgabe();
        aHeisobtMethod();
        methodCounter++;
    }


    private static void aFirstMethod() {
        System.out.println("MethodCollector.aFirstMethod: This method has been created by ");
    }

    private static void methodJonas() {
        System.out.println("MethodCollector.methodJonas: This method has been created by Jonas");
    }
    private static void eddyMethod(){
        System.out.println("MethodCollector.eddyMethod: This method has been created by Eddy.");
    }
    private static void marcelKeckerMethod() {
        System.out.println("This method has been created by Marcel Kecker");
    }
    private static void ausgabe() {
        System.out.println("Hallo Welt!");
    } 
    private static void aVkMethod(){
        System.out.println("MethodCollector.aHeisobtMethod: This method has been created by Vk");
    }
    private static void aHeisobtMethod() {
        System.out.println("MethodCollector.aHeisobtMethod: This method has been created by heisob");
    }


}
    private static void aLastMethod() {
        System.out.println("MethodCollector.aFirstMethod: This method has been created by BenH@sstEMails");
    }
}

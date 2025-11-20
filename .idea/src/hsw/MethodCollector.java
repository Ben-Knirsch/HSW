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
        aVkMethod();
        danielsMethod();
        aLastMethod();
        methodCounter++;
        eddyMethod();
        methodCounter++;
        methodJonas();
        methodCounter++;
        methodByMarcel();
        methodCounter++;

// hier kann die nächste Methode folgen.
        toot();
        Leo();
        marcelKeckerMethod();
        ausgabe();
        aHeisobtMethod();
        methodCounter++;
        henrysMethod();
    }

    private static void Leo()
    {
        System.out.println("LEO WAR HIER !!!!");
    }
    private static void aFirstMethod() {
         System.out.println("MethodCollector.aFirstMethod: This method has been created by ");
    }
    private static void aVkMethod(){
        System.out.println("MethodCollector.aHeisobtMethod: This method has been created by Vk");
    }
    private static void danielsMethod() {
        System.out.println("MethodCollector.danielsMethod: This method has been created by Daniel");
    }
    private static void methodByMarcel() {
        System.out.println("Test Methode von Marcel");
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
    private static void tooot() {
        System.out.println("This method has been created by tot");
    }
    private static void henrysMethod() {
        System.out.println("This method has been created by Henry");
    }
    private static void ausgabe() {
        System.out.println("Hallo Welt!");
    }
    private static void aHeisobtMethod() {
        System.out.println("MethodCollector.aHeisobtMethod: This method has been created by heisob");
    }   
    private static void aLastMethod() {
        System.out.println("MethodCollector.aFirstMethod: This method has been created by BenH@sstEMails");
    }
}

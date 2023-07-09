public class App {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    private double calcularSalario() {
        double result = 0;

        if (esCandidato()) {
            //Calcular salario
            return result;
        }

        return 0;
    }

    public boolean esCandidato() {
        /* 
        if (seniority < 1) {
            return false;
        }

        if (education < 1) {
            return false;
        }

        if (incidents > 10) {
            return false;
        }

        if (!certification) {
            return false;
        }*/

        boolean result = seniority < 1 || education < 1 || incidents > 10 || !certification;

        return !result;
    }

    public static void main(String[] args) throws Exception {
       
    }
}

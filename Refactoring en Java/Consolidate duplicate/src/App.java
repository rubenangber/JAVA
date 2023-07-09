public class App {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {
        double result = 0;

        if(isEligibleExtraSalary()) {
            result = 500;
            //sendMenssage(); Metodo que se repite en la condicion
        } else {
            result = 0;
            //sendMenssage(); Metodo que se repite en la condicion
        }
        sendMenssage();
        return result;
    }

    private void sendMenssage() {
        //Send email
        //Connect smtp

        System.out.println("Sendin message...");
    }

    private boolean isEligibleExtraSalary() {
        return true;
    }

    public static void main(String[] args) throws Exception {

    }
}

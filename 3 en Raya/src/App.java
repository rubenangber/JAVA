import java.util.Random;
import java.util.Scanner;

public class App {
    static int numbers[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        clearConsole();

        menu();
        int opc;
        do {
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    game();
                    menu();
                break;
                case 2:
                    clearConsole();
                    System.out.println("Saliendo");
                break;
                default:
                    System.out.println("Opcion no valida");
                break;
            }
        } while (opc != 2);
        sc.close();
    }

    public static void menu() {
        System.out.println("1) Jugar");
        System.out.println("2) Salir");
        System.out.printf("Introduzca opcion >> ");
    }

    public static void game() {
        restetNumbers();
        Random rand = new Random();
        int turn = rand.nextInt(2);
        boolean b = false;

        switch (turn) {
            case 0:
                do {
                    printBoard();
                
                    int opc;
                    boolean ok = false;
                    
                    if(isDraw()) {
                        do { 
                            System.out.printf("Introduzca la posicion >> ");
                            opc = sc.nextInt();
                        
                            if(numbers[opc - 1] == 0) {
                                numbers[opc - 1] = 1;
                                ok = true;
                            } else {
                                System.out.println("Posicion ocupada");
                            }
                        } while(!ok);
                    
                        if(checkMyVictory()) {
                            clearConsole();
                            printBoard();
                            System.out.printf("\n\nHas ganado\n");
                            b = true;
                        } else {
                            clearConsole();
                            if(isDraw()) {
                                iaTurn();
                                if(checkIAVictory()) {
                                    clearConsole();
                                    printBoard();
                                    System.out.printf("\n\nHas perdido\n");
                                    b = true;
                                }
                            } else {
                                System.out.printf("\n\nEmpate\n");
                                b = true;
                            }
                        }
                    } else {
                        System.out.printf("\n\nEmpate\n");
                        b = true;
                    }
                } while (!b);
            break;
        
            case 1:
                do {
                    int opc;
                    boolean ok = false;

                    clearConsole();
                    if(isDraw()) {
                        iaTurn();

                        if(checkIAVictory()) {
                            clearConsole();
                            printBoard();
                            System.out.printf("\n\nHas perdido\n");
                            b = true;
                        } else {
                            printBoard();
                            if(isDraw()) {
                                do { 
                                    System.out.printf("Introduzca la posicion >> ");
                                    opc = sc.nextInt();
                                
                                    if(numbers[opc - 1] == 0) {
                                        numbers[opc - 1] = 1;
                                        ok = true;
                                    } else {
                                        System.out.println("Posicion ocupada");
                                    }
                                } while(!ok);
        
                                if(checkMyVictory()) {
                                    clearConsole();
                                    printBoard();
                                    System.out.printf("\n\nHas ganado\n");
                                    b = true;
                                }
                            } else {
                                System.out.printf("\n\nEmpate\n");
                                b = true;
                            }
                        }
                    } else {
                        System.out.printf("\n\nEmpate\n");
                        b = true;
                    }
                    
                } while (!b);
            break;
        }
    }

    public static boolean isDraw() {
        boolean draw = false;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0) {
                draw = true;
            } 
        }

        return draw;
    }

    public static void restetNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;
        }
    }

    public static boolean checkMyVictory() {
        if(numbers[0] == 1 && numbers[1] == 1 && numbers[2] == 1) {
            return true;
        } else if(numbers[0] == 1 && numbers[3] == 1 && numbers[6] == 1) {
            return true;
        } else if(numbers[0] == 1 && numbers[4] == 1 && numbers[8] == 1) {
            return true;
        } else if(numbers[1] == 1 && numbers[4] == 1 && numbers[7] == 1) {
            return true;
        } else if(numbers[2] == 1 && numbers[5] == 1 && numbers[8] == 1) {
            return true;
        } else if(numbers[2] == 1 && numbers[4] == 1 && numbers[6] == 1) {
            return true;
        } else if(numbers[3] == 1 && numbers[4] == 1 && numbers[5] == 1) {
            return true;
        } else if(numbers[6] == 1 && numbers[7] == 1 && numbers[8] == 1) {
            return true;
        }
        return false;
    }

    public static boolean checkIAVictory() {
        if(numbers[0] == 2 && numbers[1] == 2 && numbers[2] == 2) {
            return true;
        } else if(numbers[0] == 2 && numbers[3] == 2 && numbers[6] == 2) {
            return true;
        } else if(numbers[0] == 2 && numbers[4] == 2 && numbers[8] == 2) {
            return true;
        } else if(numbers[1] == 2 && numbers[4] == 2 && numbers[7] == 2) {
            return true;
        } else if(numbers[2] == 2 && numbers[5] == 2 && numbers[8] == 2) {
            return true;
        } else if(numbers[2] == 2 && numbers[4] == 2 && numbers[6] == 2) {
            return true;
        } else if(numbers[3] == 2 && numbers[4] == 2 && numbers[5] == 2) {
            return true;
        } else if(numbers[6] == 2 && numbers[7] == 2 && numbers[8] == 2) {
            return true;
        }
        return false;
    }

    public static void iaTurn() {
        Random rand = new Random();
        int pos;

        do {
            pos = rand.nextInt(9);
        } while (numbers[pos] != 0);

        numbers[pos] = 2;
    }

    public static void printBoard() {
        for(int i = 0; i < 9; i++) {
            switch (numbers[i]) {
                case 0:
                    System.out.printf("   ");
                break;
                case 1:
                    System.out.printf(" X ");
                break;
                case 2:
                    System.out.printf(" O ");
                break;
            }

            if(i == 0 || i == 1 || i == 3 || i == 4 || i == 6 || i == 7) {
                System.out.printf("|");
            }
            if(i == 2) {
                System.out.printf("\t 1 | 2 | 3 ");
            }

            if(i == 5) {
                System.out.printf("\t 4 | 5 | 6 ");
            }

            if(i == 8) {
                System.out.printf("\t 7 | 8 | 9 \n");
            }

            if(i == 2 || i == 5) {
                System.out.printf("\n---+---+---\t---+---+---\n");
            }
        }
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }
}
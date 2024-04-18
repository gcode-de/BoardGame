import java.util.Scanner;

public class PlayerCharacter {
    public static int[] positionXY = {0,0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPositionXY();
        System.out.println("Verwende 'w', 'a', 's', 'd' zum Bewegen, 'q' zum Beenden.");

        while (true) {
            System.out.print("Nächster Zug: ");
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                char keystroke = input.charAt(0);
                if (keystroke == 'q') {
                    break;
                }
                move(keystroke);
            }
        }

        scanner.close();
        System.out.println("Spiel beendet.");
    }

    public static void printPositionXY() {
        for (int i = -5; i <= 5 ; i++) {
            for (int j = -5; j <= 5; j++) {
                if (i == positionXY[1] && j == positionXY[0]) {
                    System.out.print(" 👤 ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    public static int getX() {
        return positionXY[0];
    }

    public static int getY() {
        return positionXY[1];
    }

    public static int[] move(char keystroke) {
        int[] movement = {0, 0};

        switch(keystroke){
            case 'w':
                movement[1] = -1;
                break;
            case 'a':
                movement[0] = -1;
                break;
            case 's':
                movement[1] = 1;
                break;
            case 'd':
                movement[0] = 1;
                break;
            default:
                System.out.println("Keine Änderung");
                break;
        }
        positionXY[0] = positionXY[0] + movement[0];
        positionXY[1] = positionXY[1] + movement[1];
        printPositionXY();
        return movement;
    }

}
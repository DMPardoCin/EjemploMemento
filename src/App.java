import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Mario mario = new Mario(1, 3, "None");
        Scanner lector = new Scanner(System.in);
        CheckpointMgr manager = new CheckpointMgr();
        boolean exit = false;
        System.out.println("Inicia juego");
        System.out.println(mario.toString());
        manager.save(mario.saveCheckpoint());

        while (!exit) {

            System.out.println("Ingrese a que nivel avanzo Mario: ");
            int level = lector.nextInt();
            lector.nextLine();
            mario.setLevel(level);

            System.out.println("Ingrese cuantas vidas le quedan a Mario: ");
            int lives = lector.nextInt();
            lector.nextLine();
            mario.setLives(lives);

            System.out.println("Ingrese que poder adquirio Mario: ");
            String power = lector.nextLine();
            mario.setPower(power);

            System.out.println(mario.toString());
            System.out.println("¿Desea guardar partia? y/n");
            String rta = lector.nextLine();

            if (rta.equals("y")) {
                manager.save(mario.saveCheckpoint());
                System.out.println("Partida guardada");
                System.out.println(mario.toString());
            }

            System.out.println("¿Desea cargar partida? y/n");
            rta = lector.nextLine();

            if (rta.equals("y")) {
                System.out.println("¿Desea cargar la utlima partida? y/n");
                rta = lector.nextLine();
                if (rta.equals("y")) {
                    mario.restoreCheckpoint(manager.restore());
                    System.out.println("Partida cargada");
                    System.out.println(mario.toString());
                } else {
                    System.out.println("¿Que partida desea cargar?");
                    for (int i = 0; i < manager.getCheckpoints().size(); i++) {
                        System.out.println("Slot " + manager.getCheckpoints().indexOf(manager.getCheckpoints().get(i)));
                    }
                    int slot = lector.nextInt();
                    lector.nextLine();
                    mario.restoreCheckpoint(manager.restore(slot));
                    System.out.println("Partida cargada");
                    System.out.println(mario.toString());
                }
            }

            System.out.println("¿Desea salir?");
            String rtaExit = lector.nextLine();
            if (rtaExit.equals("y")) {
                exit = true;
            }
        }

    }
}

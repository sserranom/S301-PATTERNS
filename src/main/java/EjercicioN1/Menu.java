package EjercicioN1;

import java.util.Scanner;

public class Menu {
    private final Undo undoManage = Undo.getInstance();
    private final Scanner input = new Scanner(System.in);

    public static void showInfoamation(){
        System.out.println("\n                COMANDOS DISPONIBLES:");
        System.out.println("*********************************************************");
        System.out.println("* insert [elemento] : Inserta un elemento a la Lista    *");
        System.out.println("* delete [elemento] : Elimina un elemento de la lista   *");
        System.out.println("* show : Muestra todos los elementos de la lista        *");
        System.out.println("* undo : Deshace la ultima accion realizada             *");
        System.out.println("* history : mustras el historial de comandos utilizados *");
        System.out.println("* exit : Sale del programa                              *");
        System.out.println("* help : Muestra la informacion de los comandos         *");
        System.out.println("*********************************************************\n");
    }

    public void start() {

        Menu.showInfoamation();

        while (true) {
            System.out.print("> ");
            String command = input.nextLine().trim();


            try {
                String[] parts = command.split(" ", 2);
                String action = parts[0].toLowerCase();
                switch (action) {
                    case "exit":
                        input.close();
                        System.out.println("Fin del programa");
                        return;

                    case "insert":
                        if (parts.length < 2 || parts[1].trim().isEmpty()) {
                            throw new UndoException("Debes especificar un elemento válido");
                        }
                        undoManage.insertElement(parts[1].trim());
                        break;

                    case "delete":
                        if (parts.length < 2 || parts[1].trim().isEmpty()) {
                            throw new UndoException("Debes especificar un elemento a eliminar");
                        }
                        undoManage.deleteElement(parts[1].trim());
                        break;

                    case "show":
                        undoManage.showCollection();
                        break;

                    case "undo":
                        undoManage.undoLast();
                        System.out.println("Se ha deshecho la última acción.");
                        break;

                    case "history":
                        undoManage.showHistoryCommand();
                        break;

                    case "help":
                        showInfoamation();

                    default:
                        System.out.println("Ingresa un comando válido");
                }
            } catch (UndoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

package N1Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Undo {
    private static Undo instance;
    private List<String> collection;
    private Stack<String> undoHistory;
    private List<String> commandHistory;


    private Undo() {
        collection = new ArrayList<>();
        undoHistory = new Stack<>();
        commandHistory = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void insertElement(String element) throws UndoException{
        if (element.isEmpty()){
            throw new UndoException("Debes insertar un elemento válido");
        }
        collection.add(element);
        undoHistory.push(element);
        commandHistory.add("insert " + element);
    }

    public void deleteElement(String element) throws  UndoException{
        if (element.isEmpty()){
            throw new UndoException("Debes especificar un elemento a eliminar");
        }
        if (collection.contains(element)) {
            collection.remove(element);
            commandHistory.add("delete " + element);
        } else {
            throw new UndoException("el elemento " + element + " no existe en la lista");
        }
    }

    public void undoLast() throws UndoException {
        if (undoHistory.isEmpty()) {
            throw new UndoException("No hay nada que deshacer");
        }

        for (int i = commandHistory.size()-1; i >= 0; i--){
            String lastAction = commandHistory.get(i);

            if (lastAction.startsWith("insert")) {
                String element = undoHistory.pop();
                collection.remove(element);
                commandHistory.add("undo insert " + element);
                return;
            } else if (lastAction.startsWith("delete")) {
                String element = lastAction.substring(7);
                collection.add(element);
                commandHistory.add("undo delete " + element);
                return;
            }
        }
            //String lastAction = commandHistory.get(commandHistory.size() - 1);
        throw new UndoException("No hay nada que deshacer");
    }

    public void showCollection() {
        System.out.println("Elementos en la lista: " + collection);
        commandHistory.add("show");
    }

    public void showHistoryCommand() {
        for (String commands : commandHistory) {
            System.out.println(commands);
        }
    }

}

package practice;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        list.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (list.size() <= index) {
            list.add(todo);
            return;
        }
        list.add(index, todo);
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (list.size() <= index) {
            return;
        }
        list.set(index, todo);
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (list.size() <= index) {
            return;
        }
        list.remove(index);
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return list;
    }

}
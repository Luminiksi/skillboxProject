package setAndMap;

import java.util.Comparator;

public class TaskComparator implements Comparator<TaskNotComp> {
    @Override
    public int compare(TaskNotComp task1, TaskNotComp task2) {
        /*return task1.getTime().compareTo(task2.getTime());*/
        /*getName для использования ceiling, т.к. ищет по этому сравнению*/
        return task1.getName().compareTo(task2.getName());
    }
}

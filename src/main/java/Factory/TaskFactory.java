package Factory;

import Model.TaskDocument;
import Service.ServiceGenerator;
import Service.ServiceList;

/**
 * Класс - фабрика заданий
 */
public class TaskFactory implements DocumentFactory<TaskDocument> {

    @Override
    public TaskDocument createDocument() {
        return TaskDocument.newTaskBuilder()
                .setDateTask(ServiceGenerator.randomDate())
                .setController("Контролер")
                .setPeriodOfTask(ServiceGenerator.randomDate())
                .setExecutor("j")
                .setStatusControl("Текущий статус")
                .setType("Задача")
                .setId(ServiceGenerator.randomInt())
                .setName(ServiceList.listName).toString()
                .setText("генерация текста=" +ServiceGenerator.randomInt())
                .setNumber(ServiceGenerator.randomInt())
                .setAuthor(ServiceList.workerList).toString()
                .setDate(ServiceGenerator.randomDate())
                .build();
    }
}
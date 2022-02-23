package Factory;

import Model.TaskDocument;
import Service.ServiceGenerator;
import Service.ServiceList;

 /**
 * Класс для создания документа Задачи
 *
 * @return объект - документ задачи
 */
public class TaskFactory implements DocumentFactory<TaskDocument> {

   /**
     * метод генерации документа Задачи
     *
     * @return получение документа Задачи
     */
    @Override
    public TaskDocument createDocument() {
        return TaskDocument.newTaskBuilder()
                .setDateTask(ServiceGenerator.randomDate())
                .setController("Контролер")
                .setPeriodOfTask(ServiceGenerator.randomDate())
                .setExecutor("Исполнитель")
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
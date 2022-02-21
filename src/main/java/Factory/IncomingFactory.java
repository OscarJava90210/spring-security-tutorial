package Factory;
import Model.IncomingDocument;
import Service.ServiceGenerator;
import Service.ServiceList;
import static Service.ServiceGenerator.randomDate;

/**
 * Класс - фабрика входящих документов
 */
public class IncomingFactory implements DocumentFactory< IncomingDocument > {
    @Override
    public IncomingDocument createDocument() {
        return IncomingDocument.newIncomingBuilder()
                        .setIncDate(randomDate())
                        .setIncNum(ServiceGenerator.randomInt())
                        .setSender("Отправитель")
                        .setAddressee("Адресат")
                        .setType("Входящий")
                        .setId(ServiceGenerator.randomInt())
                        .setName(ServiceList.listName).toString())
                        .setText("генерация текста=" + ServiceGenerator.randomInt())
                        .setNumber(ServiceGenerator.randomInt())
                        .setAuthor(ServiceList.listName).toString()
                        .setDate(randomDate())
                        .build();
    }
}

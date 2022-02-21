package Factory;

import Model.OutgoingDocument;

/**
 * Класс - фабрика исходящих документов
 */
public class OutgoingFactory implements DocumentFactory<OutgoingDocument> {
    @Override
    public OutgoingDocument createDocument() {
        return OutgoingDocument.newOutgoingBuilder()
                .setDestination("Место назначения")
                .setDeliveryMethod("Почта")
                .build();
    }
}

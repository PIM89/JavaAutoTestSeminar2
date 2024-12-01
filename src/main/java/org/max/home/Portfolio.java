package org.max.home;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Портфолио - контейнер, не имеет стоимости но состоит из других элементов
 */
public class Portfolio implements IElement {

    public List<IElement> elements = new ArrayList<>();

    @Override
    public Long sum() {
        AtomicReference<Long> result = new AtomicReference<>(0L);
        elements.forEach(e -> {
            result.set(result.get() + e.sum());
        });

        return result.get();
    }

    public void add(IElement element) {
        elements.add(element);
    }
}

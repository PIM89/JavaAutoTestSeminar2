package org.max.demo.pattern.adapter;

import java.time.LocalDate;

/**
 * Интерфейс обработчика XML
 */
public interface IXml {

    void openXML();

    Integer countXMLRow();

    String findObjectInXML(String searchString);

    Integer getSizeXML();

    LocalDate getCreateDate();
}

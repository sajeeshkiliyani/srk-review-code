package com.ars.srk.errorhandler;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SchemaErrorHandler implements ErrorHandler {

private List<Object> allErrors = new ArrayList<>();

public List<Object> getAllErrors() {
    return allErrors;
}

public void setAllErrors(List<Object> allErrors) {
    this.allErrors = allErrors;
}

@Override
public void error(SAXParseException arg0) throws SAXException {
    System.out.println(arg0.getMessage());
    allErrors.add(arg0);

}

@Override
public void fatalError(SAXParseException arg0) throws SAXException {
    System.out.println(arg0.getMessage());
    allErrors.add(arg0);
}

@Override
public void warning(SAXParseException arg0) throws SAXException {
    System.out.println(arg0.getMessage());
    allErrors.add(arg0);
}

}
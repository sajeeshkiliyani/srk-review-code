package com.ars.srk.journeyroute.custom.transformer;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

import com.ars.srk.gateway.ESBServicesType;
import com.ars.srk.gateway.MessageType;;;


public class InboundMetadataTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		

		try {			
			com.ars.srk.gateway.MessageType msg=(MessageType)src;	
			
           
			ESBServicesType	esbService=new ESBServicesType();
            esbService.setDateTimeIn(getXMLGregorianCalendarNow());
            //esbService.setDateTimeOut(null);
            esbService.setServiceName("JourneyRouteMangament");
            esbService.setStatus("IN_PROGRESS");
            msg.getHeader().setESBServices(esbService);
           
            return msg;
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	XMLGregorianCalendar getXMLGregorianCalendarNow() throws DatatypeConfigurationException
    {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        return now;
    }
	
	
}

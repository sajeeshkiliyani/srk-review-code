package com.ars.srk.journeyroute.custom.transformer;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

import com.ars.srk.gateway.ESBServicesType;
import com.ars.srk.gateway.MessageType;
import com.ars.srk.gateway.RecipientType;
import com.ars.srk.gateway.RecipientsType;
import com.ars.srk.gateway.ToType;


public class OutboundMetadataTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		

		try {			
			com.ars.srk.gateway.MessageType msg=(MessageType)src;	
           
			ESBServicesType	esbService=msg.getHeader().getESBServices();            
            esbService.setDateTimeOut(getXMLGregorianCalendarNow());
            esbService.setServiceName("JourneyRouteMangament");
            esbService.setStatus("SUCCESS");
            msg.getHeader().setESBServices(esbService);
            
            //recipient 1
            RecipientType recipient1=new RecipientType();
            recipient1.setEndpoint("srk.user."+msg.getHeader().getUserSession().getSessionId());
            recipient1.setType("queue");
            
            //recipient 2
            RecipientType recipient2=new RecipientType();
            recipient2.setEndpoint("srk.topic.journey");
            recipient2.setType("topic");
            
            RecipientsType recipients=new RecipientsType();
            List<RecipientType> rList=new ArrayList<RecipientType>();
            rList.add(recipient1);
            rList.add(recipient2);
            recipients.setRecipient(rList);
            
            ToType to= new ToType();
            to.setRecipients(recipients);
            msg.getHeader().setTo(to);

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

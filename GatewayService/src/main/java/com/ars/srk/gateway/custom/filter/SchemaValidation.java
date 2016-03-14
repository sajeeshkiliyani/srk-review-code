package com.ars.srk.gateway.custom.filter;

import java.io.IOException;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMResult;

import org.mule.api.MuleMessage;
import org.mule.api.transport.PropertyScope;
import org.mule.module.xml.filters.SchemaValidationFilter;
import org.xml.sax.SAXException;

public class SchemaValidation extends SchemaValidationFilter {

    public final static String SAX_ERROR_PROPERTIES = "SAX_ERROR_PROPERTIES";
    public final static boolean RETURN_RESULT = false;
    public final static String SCHEMA_LOCATION = "xsd/MuleMessageModel.xsd";

    public SchemaValidation(){
        super();
        super.setReturnResult(false);
        super.setSchemaLocations(SCHEMA_LOCATION);
        super.setResourceResolver(new com.ars.srk.resolver.schemaResourceResolver());
        super.setErrorHandler(new com.ars.srk.errorhandler.SchemaErrorHandler());

    }


    /**
     * Accepts the message if schema validation passes.
     * 
     * @param message The message.
     * @return Whether the message passes schema validation.
     */
    @Override
    public boolean accept(MuleMessage message)
    {
        Source source;
        try
        {
            source = loadSource(message);
        }
        catch (Exception e)
        {
            if (e instanceof RuntimeException)
            {
                throw (RuntimeException) e;
            }

            if (logger.isInfoEnabled())
            {
                logger.info("SchemaValidationFilter rejected a message because there was a problem interpreting the payload as XML.", e);
            }
            return false;
        }

        if (source == null)
        {
            if (logger.isInfoEnabled())
            {
                logger.info("SchemaValidationFilter rejected a message because the XML source was null.");
            }
            return false;
        }


        DOMResult result = null;

        try
        {
            if (super.isReturnResult()) 
            {
                result = new DOMResult();
                createValidator().validate(source, result);
            }
            else 
            {
                createValidator().validate(source);
            }
        }
        catch (SAXException e)
        {
            message.setProperty(SAX_ERROR_PROPERTIES, e.getMessage(), PropertyScope.OUTBOUND);
            if (logger.isDebugEnabled())
            {
                logger.debug(
                    "SchemaValidationFilter rejected a message because it apparently failed to validate against the schema.",
                    e);
            }
            return false;
        }
        catch (IOException e)
        {
            if (logger.isInfoEnabled())
            {
                logger.info(
                    "SchemaValidationFilter rejected a message because there was a problem reading the XML.",
                    e);
            }
            return false;
        }
        finally 
        {
            if (result != null && result.getNode() != null)
            {
                message.setPayload(result.getNode());
            }
        }

        if (logger.isDebugEnabled())
        {
            logger.debug("SchemaValidationFilter accepted the message.");
        }

        return true;
    }

}

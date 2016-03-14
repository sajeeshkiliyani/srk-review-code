package com.ars.srk.resolver;
import java.io.IOException;
import java.io.InputStream;

import org.apache.xerces.dom.DOMInputImpl;
import org.mule.util.IOUtils;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

public class schemaResourceResolver implements LSResourceResolver {

	@Override
	public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {

		try {
			InputStream resource = IOUtils.getResourceAsStream(systemId, getClass());
			return new DOMInputImpl(publicId, systemId, baseURI, resource, null);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
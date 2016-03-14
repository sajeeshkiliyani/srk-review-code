<!--

   transforming the envelope in to payload with body

-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" 
	version="2.0" exclude-result-prefixes="xs">
	<xsl:output indent="yes" />
<xsl:template match="/"> 
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Header/>
   <soapenv:Body>
      <xsl:copy-of select="."/>
   </soapenv:Body>
</soapenv:Envelope>
</xsl:template>
</xsl:stylesheet>

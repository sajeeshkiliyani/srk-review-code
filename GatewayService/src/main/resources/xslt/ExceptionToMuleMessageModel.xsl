<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" 
    xmlns:mule="http://www.srk.org/MuleMessageModel/" 
	version="2.0" exclude-result-prefixes="xs">
	<xsl:output indent="yes" />
	
   <!-- Getting values from Mule variables -->
   <xsl:param name="muleMessageModel"/>
   <xsl:param name="exceptionType"/>
   
   
<xsl:template match="/EXCEPTION"> 
<mule:Message xmlns:mule="http://www.srk.org/MuleMessageModel/" xmlns:srk="http://www.srk.org/exception/">

<xsl:copy-of select="$muleMessageModel/Header" copy-namespaces="no" />
  <Body>
	<xsl:choose>
	<xsl:when test="$exceptionType='validation'">
		<srk:Exception>
	      <srk:ExceptionCode>SRK_GENERAL_001</srk:ExceptionCode>
	      <srk:ExceptionMessage>message is invalid</srk:ExceptionMessage>
	      <srk:Details><xsl:copy-of select="MESSAGE/text()"/></srk:Details>
	    </srk:Exception>
	</xsl:when>
	
	<xsl:otherwise>
		<srk:Exception>
	      <srk:ExceptionCode>SRK_GENERAL_002</srk:ExceptionCode>
	      <srk:ExceptionMessage>An Exception occurred</srk:ExceptionMessage>
	      <srk:Details><xsl:copy-of select="MESSAGE/text()"/></srk:Details>
	    </srk:Exception>
	</xsl:otherwise>
	</xsl:choose>
  </Body>

</mule:Message>
</xsl:template>
</xsl:stylesheet>
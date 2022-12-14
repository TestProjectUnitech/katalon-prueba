<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Token MIBA</name>
   <tag></tag>
   <elementGuidId>54a7357d-046f-4493-bdeb-43c8faf65610</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;application/x-www-form-urlencoded&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;grant_type&quot;,
      &quot;value&quot;: &quot;client_credentials&quot;
    },
    {
      &quot;name&quot;: &quot;client_id&quot;,
      &quot;value&quot;: &quot;${clientIdProcess}&quot;
    },
    {
      &quot;name&quot;: &quot;client_secret&quot;,
      &quot;value&quot;: &quot;${clientSecretProcess}&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>x-www-form-urlencoded</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/x-www-form-urlencoded</value>
      <webElementGuid>490debdb-5a15-44a3-b894-64b93e83540e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://${urlIdmServer}/auth/realms/${realmIdProcess}/protocol/openid-connect/token</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.urlIdmServer</defaultValue>
      <description></description>
      <id>3337657b-5173-475d-9b66-e5e910e230fe</id>
      <masked>false</masked>
      <name>urlIdmServer</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.realmIdProcess</defaultValue>
      <description></description>
      <id>9f0b87da-d807-4a09-8b5b-db212f699fa4</id>
      <masked>false</masked>
      <name>realmIdProcess</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.clientIdProcess</defaultValue>
      <description></description>
      <id>d6b07259-a230-4730-958f-f638f467ebca</id>
      <masked>false</masked>
      <name>clientIdProcess</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.client_secret</defaultValue>
      <description></description>
      <id>932c7f54-9130-4aba-91e6-0017a794d139</id>
      <masked>false</masked>
      <name>clientSecretProcess</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>


/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.cyberpolice.authcallback;
        
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://cyberpolice.org/authCallBack".equals(namespaceURI) &&
                  "commit".equals(typeName)){
                   
                            return  org.cyberpolice.authcallback.Commit.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://cyberpolice.org/authCallBack".equals(namespaceURI) &&
                  "commitResponse".equals(typeName)){
                   
                            return  org.cyberpolice.authcallback.CommitResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
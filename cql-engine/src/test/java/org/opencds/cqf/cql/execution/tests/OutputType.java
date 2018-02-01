//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.14 at 03:32:24 PM MST 
//


package org.hl7.fhirpath.tests;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="code"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="integer"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OutputType", namespace = "http://hl7.org/fhirpath/tests")
@XmlEnum
public enum OutputType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("code")
    CODE("code"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("string")
    STRING("string");
    private final String value;

    OutputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputType fromValue(String v) {
        for (OutputType c: OutputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

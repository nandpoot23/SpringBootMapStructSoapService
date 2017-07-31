package com.sample.soap.xml.dm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for queryEmpConfigs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryEmpConfigs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://dm.xml.soap.sample.com/}empConfigIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryEmpConfigs", propOrder = {
    "arg0"
})
@XmlRootElement(name = "queryEmpConfigs")
public class QueryEmpConfigs {

    protected EmpConfigIdentifier arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link EmpConfigIdentifier }
     *     
     */
    public EmpConfigIdentifier getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpConfigIdentifier }
     *     
     */
    public void setArg0(EmpConfigIdentifier value) {
        this.arg0 = value;
    }

}

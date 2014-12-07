//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.18 at 01:11:17 AM IST 
//


package com.prapps.chess.server.uci.tcp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adminPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="servers" type="{}server" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fromMail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mailPass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="toMail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adminPort",
    "servers"
})
@XmlRootElement(name = "serverConfig")
public class ServerConfig {

    protected int adminPort;
    @XmlElement(required = true)
    protected List<Server> servers;
    @XmlAttribute(name = "protocol")
    protected String protocol;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "fromMail")
    protected String fromMail;
    @XmlAttribute(name = "mailPass")
    protected String mailPass;
    @XmlAttribute(name = "toMail")
    protected String toMail;

    /**
     * Gets the value of the adminPort property.
     * 
     */
    public int getAdminPort() {
        return adminPort;
    }

    /**
     * Sets the value of the adminPort property.
     * 
     */
    public void setAdminPort(int value) {
        this.adminPort = value;
    }

    /**
     * Gets the value of the servers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Server }
     * 
     * 
     */
    public List<Server> getServers() {
        if (servers == null) {
            servers = new ArrayList<Server>();
        }
        return this.servers;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the fromMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromMail() {
        return fromMail;
    }

    /**
     * Sets the value of the fromMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromMail(String value) {
        this.fromMail = value;
    }

    /**
     * Gets the value of the mailPass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailPass() {
        return mailPass;
    }

    /**
     * Sets the value of the mailPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailPass(String value) {
        this.mailPass = value;
    }

    /**
     * Gets the value of the toMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToMail() {
        return toMail;
    }

    /**
     * Sets the value of the toMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToMail(String value) {
        this.toMail = value;
    }

}

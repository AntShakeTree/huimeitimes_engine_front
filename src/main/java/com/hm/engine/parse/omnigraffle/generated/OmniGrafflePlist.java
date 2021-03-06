//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.10 at 07:27:30 PM CST 
//


package com.hm.engine.parse.omnigraffle.generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrayOrDataOrDateOrDictOrRealOrIntegerOrStringOrTrueOrFalse"
})
@XmlRootElement(name = "plist")
public class OmniGrafflePlist {

    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected java.lang.String version;
    @XmlElements({
        @XmlElement(name = "array", required = true, type = OmniGraffleArray.class),
        @XmlElement(name = "data", required = true, type = OmniGraffleData.class),
        @XmlElement(name = "date", required = true, type = OmniGraffleDate.class),
        @XmlElement(name = "dict", required = true, type = OmniGraffleDict.class),
        @XmlElement(name = "real", required = true, type = OmniGraffleReal.class),
        @XmlElement(name = "integer", required = true, type = OmniGraffleInteger.class),
        @XmlElement(name = "string", required = true, type = OmniGraffleString.class),
        @XmlElement(name = "true", required = true, type = OmniGraffleTrue.class),
        @XmlElement(name = "false", required = true, type = OmniGraffleFalse.class)
    })
    protected List<Object> arrayOrDataOrDateOrDictOrRealOrIntegerOrStringOrTrueOrFalse;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVersion(java.lang.String value) {
        this.version = value;
    }

    /**
     * Gets the value of the arrayOrDataOrDateOrDictOrRealOrIntegerOrStringOrTrueOrFalse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOrDataOrDateOrDictOrRealOrIntegerOrStringOrTrueOrFalse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOrDataOrDateOrDictOrRealOrIntegerOrStringOrTrueOrFalse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OmniGraffleArray }
     * {@link OmniGraffleData }
     * {@link OmniGraffleDate }
     * {@link OmniGraffleDict }
     * {@link OmniGraffleReal }
     * {@link OmniGraffleInteger }
     * {@link generated.String }
     * {@link OmniGraffleTrue }
     * {@link OmniGraffleFalse }
     * 
     * 
     */
    public List<Object> getArrayOrDataOrDateOrDictOrRealOrIntegerOrStringOrTrueOrFalse() {
        if (arrayOrDataOrDateOrDictOrRealOrIntegerOrStringOrTrueOrFalse == null) {
            arrayOrDataOrDateOrDictOrRealOrIntegerOrStringOrTrueOrFalse = new ArrayList<Object>();
        }
        return this.arrayOrDataOrDateOrDictOrRealOrIntegerOrStringOrTrueOrFalse;
    }

}

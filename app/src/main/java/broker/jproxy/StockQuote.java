
package broker.jproxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StockQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Change" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Open" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MarketCap" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PreviousClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PreviousChange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Low52Week" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="High52Week" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockQuote", namespace = "http://stockservice.contoso.com/wse/samples/2003/06", propOrder = {
    "symbol",
    "last",
    "date",
    "change",
    "open",
    "high",
    "low",
    "volume",
    "marketCap",
    "previousClose",
    "previousChange",
    "low52Week",
    "high52Week",
    "name"
})
public class StockQuote {

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Last")
    protected double last;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Change")
    protected double change;
    @XmlElement(name = "Open")
    protected double open;
    @XmlElement(name = "High")
    protected double high;
    @XmlElement(name = "Low")
    protected double low;
    @XmlElement(name = "Volume")
    protected long volume;
    @XmlElement(name = "MarketCap")
    protected long marketCap;
    @XmlElement(name = "PreviousClose")
    protected double previousClose;
    @XmlElement(name = "PreviousChange")
    protected double previousChange;
    @XmlElement(name = "Low52Week")
    protected double low52Week;
    @XmlElement(name = "High52Week")
    protected double high52Week;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the last property.
     * 
     */
    public double getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     */
    public void setLast(double value) {
        this.last = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the change property.
     * 
     */
    public double getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     */
    public void setChange(double value) {
        this.change = value;
    }

    /**
     * Gets the value of the open property.
     * 
     */
    public double getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     */
    public void setOpen(double value) {
        this.open = value;
    }

    /**
     * Gets the value of the high property.
     * 
     */
    public double getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     */
    public void setHigh(double value) {
        this.high = value;
    }

    /**
     * Gets the value of the low property.
     * 
     */
    public double getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     */
    public void setLow(double value) {
        this.low = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public long getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(long value) {
        this.volume = value;
    }

    /**
     * Gets the value of the marketCap property.
     * 
     */
    public long getMarketCap() {
        return marketCap;
    }

    /**
     * Sets the value of the marketCap property.
     * 
     */
    public void setMarketCap(long value) {
        this.marketCap = value;
    }

    /**
     * Gets the value of the previousClose property.
     * 
     */
    public double getPreviousClose() {
        return previousClose;
    }

    /**
     * Sets the value of the previousClose property.
     * 
     */
    public void setPreviousClose(double value) {
        this.previousClose = value;
    }

    /**
     * Gets the value of the previousChange property.
     * 
     */
    public double getPreviousChange() {
        return previousChange;
    }

    /**
     * Sets the value of the previousChange property.
     * 
     */
    public void setPreviousChange(double value) {
        this.previousChange = value;
    }

    /**
     * Gets the value of the low52Week property.
     * 
     */
    public double getLow52Week() {
        return low52Week;
    }

    /**
     * Sets the value of the low52Week property.
     * 
     */
    public void setLow52Week(double value) {
        this.low52Week = value;
    }

    /**
     * Gets the value of the high52Week property.
     * 
     */
    public double getHigh52Week() {
        return high52Week;
    }

    /**
     * Sets the value of the high52Week property.
     * 
     */
    public void setHigh52Week(double value) {
        this.high52Week = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}

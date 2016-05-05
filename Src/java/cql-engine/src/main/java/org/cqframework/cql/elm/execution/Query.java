//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 08:52:42 PM MDT 
//


package org.cqframework.cql.elm.execution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.NotImplementedException;
import org.cqframework.cql.execution.Context;
import org.cqframework.cql.execution.Variable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import static org.cqframework.cql.runtime.Value.ensureIterable;


/**
 * The Query operator represents a clause-based query. The result of the query is determined by the type of sources included, as well as the clauses used in the query.
 * 
 * <p>Java class for Query complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Query"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source" type="{urn:hl7-org:elm:r1}AliasedQuerySource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="let" type="{urn:hl7-org:elm:r1}LetClause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relationship" type="{urn:hl7-org:elm:r1}RelationshipClause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="where" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/&gt;
 *         &lt;element name="return" type="{urn:hl7-org:elm:r1}ReturnClause" minOccurs="0"/&gt;
 *         &lt;element name="sort" type="{urn:hl7-org:elm:r1}SortClause" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Query", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "source",
    "let",
    "relationship",
    "where",
    "_return",
    "sort"
})
public class Query
    extends Expression
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected List<AliasedQuerySource> source;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected List<LetClause> let;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected List<RelationshipClause> relationship;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected Expression where;
    @XmlElement(name = "return", namespace = "urn:hl7-org:elm:r1")
    protected ReturnClause _return;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected SortClause sort;

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasedQuerySource }
     * 
     * 
     */
    public List<AliasedQuerySource> getSource() {
        if (source == null) {
            source = new ArrayList<AliasedQuerySource>();
        }
        return this.source;
    }

    /**
     * Gets the value of the let property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the let property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LetClause }
     * 
     * 
     */
    public List<LetClause> getLet() {
        if (let == null) {
            let = new ArrayList<LetClause>();
        }
        return this.let;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipClause }
     * 
     * 
     */
    public List<RelationshipClause> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<RelationshipClause>();
        }
        return this.relationship;
    }

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setWhere(Expression value) {
        this.where = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnClause }
     *     
     */
    public ReturnClause getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnClause }
     *     
     */
    public void setReturn(ReturnClause value) {
        this._return = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SortClause }
     *     
     */
    public SortClause getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortClause }
     *     
     */
    public void setSort(SortClause value) {
        this.sort = value;
    }

    public Query withSource(AliasedQuerySource... values) {
        if (values!= null) {
            for (AliasedQuerySource value: values) {
                getSource().add(value);
            }
        }
        return this;
    }

    public Query withSource(Collection<AliasedQuerySource> values) {
        if (values!= null) {
            getSource().addAll(values);
        }
        return this;
    }

    public Query withLet(LetClause... values) {
        if (values!= null) {
            for (LetClause value: values) {
                getLet().add(value);
            }
        }
        return this;
    }

    public Query withLet(Collection<LetClause> values) {
        if (values!= null) {
            getLet().addAll(values);
        }
        return this;
    }

    public Query withRelationship(RelationshipClause... values) {
        if (values!= null) {
            for (RelationshipClause value: values) {
                getRelationship().add(value);
            }
        }
        return this;
    }

    public Query withRelationship(Collection<RelationshipClause> values) {
        if (values!= null) {
            getRelationship().addAll(values);
        }
        return this;
    }

    public Query withWhere(Expression value) {
        setWhere(value);
        return this;
    }

    public Query withReturn(ReturnClause value) {
        setReturn(value);
        return this;
    }

    public Query withSort(SortClause value) {
        setSort(value);
        return this;
    }

    @Override
    public Query withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public Query withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public Query withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Query)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Query that = ((Query) object);
        {
            List<AliasedQuerySource> lhsSource;
            lhsSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            List<AliasedQuerySource> rhsSource;
            rhsSource = (((that.source!= null)&&(!that.source.isEmpty()))?that.getSource():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            List<LetClause> lhsLet;
            lhsLet = (((this.let!= null)&&(!this.let.isEmpty()))?this.getLet():null);
            List<LetClause> rhsLet;
            rhsLet = (((that.let!= null)&&(!that.let.isEmpty()))?that.getLet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "let", lhsLet), LocatorUtils.property(thatLocator, "let", rhsLet), lhsLet, rhsLet)) {
                return false;
            }
        }
        {
            List<RelationshipClause> lhsRelationship;
            lhsRelationship = (((this.relationship!= null)&&(!this.relationship.isEmpty()))?this.getRelationship():null);
            List<RelationshipClause> rhsRelationship;
            rhsRelationship = (((that.relationship!= null)&&(!that.relationship.isEmpty()))?that.getRelationship():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationship", lhsRelationship), LocatorUtils.property(thatLocator, "relationship", rhsRelationship), lhsRelationship, rhsRelationship)) {
                return false;
            }
        }
        {
            Expression lhsWhere;
            lhsWhere = this.getWhere();
            Expression rhsWhere;
            rhsWhere = that.getWhere();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "where", lhsWhere), LocatorUtils.property(thatLocator, "where", rhsWhere), lhsWhere, rhsWhere)) {
                return false;
            }
        }
        {
            ReturnClause lhsReturn;
            lhsReturn = this.getReturn();
            ReturnClause rhsReturn;
            rhsReturn = that.getReturn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_return", lhsReturn), LocatorUtils.property(thatLocator, "_return", rhsReturn), lhsReturn, rhsReturn)) {
                return false;
            }
        }
        {
            SortClause lhsSort;
            lhsSort = this.getSort();
            SortClause rhsSort;
            rhsSort = that.getSort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sort", lhsSort), LocatorUtils.property(thatLocator, "sort", rhsSort), lhsSort, rhsSort)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<AliasedQuerySource> theSource;
            theSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            List<LetClause> theLet;
            theLet = (((this.let!= null)&&(!this.let.isEmpty()))?this.getLet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "let", theLet), currentHashCode, theLet);
        }
        {
            List<RelationshipClause> theRelationship;
            theRelationship = (((this.relationship!= null)&&(!this.relationship.isEmpty()))?this.getRelationship():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationship", theRelationship), currentHashCode, theRelationship);
        }
        {
            Expression theWhere;
            theWhere = this.getWhere();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "where", theWhere), currentHashCode, theWhere);
        }
        {
            ReturnClause theReturn;
            theReturn = this.getReturn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_return", theReturn), currentHashCode, theReturn);
        }
        {
            SortClause theSort;
            theSort = this.getSort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sort", theSort), currentHashCode, theSort);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<AliasedQuerySource> theSource;
            theSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            List<LetClause> theLet;
            theLet = (((this.let!= null)&&(!this.let.isEmpty()))?this.getLet():null);
            strategy.appendField(locator, this, "let", buffer, theLet);
        }
        {
            List<RelationshipClause> theRelationship;
            theRelationship = (((this.relationship!= null)&&(!this.relationship.isEmpty()))?this.getRelationship():null);
            strategy.appendField(locator, this, "relationship", buffer, theRelationship);
        }
        {
            Expression theWhere;
            theWhere = this.getWhere();
            strategy.appendField(locator, this, "where", buffer, theWhere);
        }
        {
            ReturnClause theReturn;
            theReturn = this.getReturn();
            strategy.appendField(locator, this, "_return", buffer, theReturn);
        }
        {
            SortClause theSort;
            theSort = this.getSort();
            strategy.appendField(locator, this, "sort", buffer, theSort);
        }
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        // Single-source query with where clause only at this point
        if (this.getSource().size() != 1) {
            throw new NotImplementedException("Multi-source queries are not currently implemented.");
        }

        if (this.getLet().size() != 0) {
            throw new NotImplementedException("Let clauses within queries are not currently implemented.");
        }

        if (this.getSort() != null) {
            throw new NotImplementedException("Sort clause within a query is not currently implemented.");
        }

        AliasedQuerySource source = this.getSource().get(0);
        Object sourceObject = source.getExpression().evaluate(context);
        boolean sourceIsList = sourceObject instanceof Iterable;
        Iterable<Object> sourceData = ensureIterable(sourceObject);
        List<Object> result = new ArrayList<Object>();

        for (Object element : sourceData) {
            context.push(new Variable().withName(source.getAlias()).withValue(element));
            try {
                boolean shouldInclude = true;

                // TODO: This is the most naive possible implementation here, but it should perform okay with 1) caching and 2) small data sets
                for (RelationshipClause relationship : getRelationship()) {
                    boolean hasSatisfyingData = false;
                    Iterable<Object> relatedSourceData = ensureIterable(relationship.getExpression().evaluate(context));
                    for (Object relatedElement : relatedSourceData) {
                        context.push(new Variable().withName(relationship.getAlias()).withValue(relatedElement));
                        try {
                            Object satisfiesRelatedCondition = relationship.getSuchThat().evaluate(context);
                            if (relationship instanceof With) {
                                if (satisfiesRelatedCondition instanceof Boolean && (Boolean) satisfiesRelatedCondition) {
                                    hasSatisfyingData = true;
                                    break; // Once we have detected satisfying data, no need to continue testing
                                }
                            }
                        }
                        finally {
                            context.pop();
                        }
                    }

                    if ((relationship instanceof With && !hasSatisfyingData) || (relationship instanceof Without && hasSatisfyingData)) {
                        shouldInclude = false;
                        break; // Once we have determined the row should not be included, no need to continue testing other related information
                    }
                }

                if (shouldInclude && getWhere() != null) {
                    Object satisfiesCondition = this.getWhere().evaluate(context);
                    if (!(satisfiesCondition instanceof Boolean && (Boolean)satisfiesCondition)) {
                        shouldInclude = false;
                    }
                }

                if (shouldInclude) {
                    if (this.getReturn() != null) {
                        Object returnValue = this.getReturn().getExpression().evaluate(context);
                        result.add(returnValue);
                    }
                    else {
                        result.add(element);
                    }
                }
            }
            finally {
                context.pop();
            }
        }

        if (this.getReturn() != null && this.getReturn().isDistinct()) {
            result = Distinct.distinct(result);
        }

        if (sourceIsList) {
            return result;
        }
        else {
            return result.size() == 1 ? result.get(0) : null;
        }
    }
}

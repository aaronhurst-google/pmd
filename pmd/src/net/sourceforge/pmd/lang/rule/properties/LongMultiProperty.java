/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.rule.properties;

/**
 * Defines a datatype that supports the Long property values.
 * 
 * @author Brian Remedios
 */
public class LongMultiProperty extends AbstractNumericProperty<Long[]> {

	/**
	 * Constructor for LongProperty.
	 * @param theName String
	 * @param theDescription String
	 * @param min Long
	 * @param max Long
	 * @param theDefault Long
	 * @param theUIOrder float
	 */
	public LongMultiProperty(String theName, String theDescription, Long min, Long max, Long[] theDefault, float theUIOrder) {
		super(theName, theDescription, min, max, theDefault, theUIOrder);
		
		isMultiValue(false);
	}
	
	/**
	 * Method type.
	 * @return Class
	 * @see net.sourceforge.pmd.PropertyDescriptor#type()
	 */
	public Class<Long[]> type() {
		return Long[].class;
	}

	/**
	 * Method createFrom.
	 * @param value String
	 * @return Object
	 */
	protected Object createFrom(String value) {
		return Long.valueOf(value);
	}

	/**
	 * Returns an array of the correct type for the receiver.
	 * 
	 * @param size int
	 * @return Object[]
	 */
	protected Object[] arrayFor(int size) {
		return new Long[size];
	}
}

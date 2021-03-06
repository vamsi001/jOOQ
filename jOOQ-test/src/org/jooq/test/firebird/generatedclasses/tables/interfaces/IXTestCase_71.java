/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_71")
public interface IXTestCase_71 extends java.io.Serializable {

	/**
	 * Setter for <code>X_TEST_CASE_71.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>X_TEST_CASE_71.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId();

	/**
	 * Setter for <code>X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	public void setTestCase_64_69Id(java.lang.Short value);

	/**
	 * Getter for <code>X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	@javax.persistence.Column(name = "TEST_CASE_64_69_ID", length = 2)
	public java.lang.Short getTestCase_64_69Id();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IXTestCase_71
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.IXTestCase_71 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IXTestCase_71
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.IXTestCase_71> E into(E into);
}

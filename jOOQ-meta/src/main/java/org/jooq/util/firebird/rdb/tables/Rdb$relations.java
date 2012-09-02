/**
 * This class is generated by jOOQ
 */
package org.jooq.util.firebird.rdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class Rdb$relations extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 377581647;

	/**
	 * The singleton instance of RDB$RELATIONS
	 */
	public static final org.jooq.util.firebird.rdb.tables.Rdb$relations RDB$RELATIONS = new org.jooq.util.firebird.rdb.tables.Rdb$relations();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>RDB$RELATIONS.RDB$VIEW_BLR</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> RDB$VIEW_BLR = createField("RDB$VIEW_BLR", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$VIEW_SOURCE</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$VIEW_SOURCE = createField("RDB$VIEW_SOURCE", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$DESCRIPTION</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DESCRIPTION = createField("RDB$DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$RELATION_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$RELATION_ID = createField("RDB$RELATION_ID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$SYSTEM_FLAG</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$SYSTEM_FLAG = createField("RDB$SYSTEM_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$DBKEY_LENGTH</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$DBKEY_LENGTH = createField("RDB$DBKEY_LENGTH", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$FORMAT</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FORMAT = createField("RDB$FORMAT", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$FIELD_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FIELD_ID = createField("RDB$FIELD_ID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$RELATION_NAME</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$RELATION_NAME = createField("RDB$RELATION_NAME", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$SECURITY_CLASS</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$SECURITY_CLASS = createField("RDB$SECURITY_CLASS", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$EXTERNAL_FILE</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$EXTERNAL_FILE = createField("RDB$EXTERNAL_FILE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$RUNTIME</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> RDB$RUNTIME = createField("RDB$RUNTIME", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$EXTERNAL_DESCRIPTION</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> RDB$EXTERNAL_DESCRIPTION = createField("RDB$EXTERNAL_DESCRIPTION", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$OWNER_NAME</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$OWNER_NAME = createField("RDB$OWNER_NAME", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$DEFAULT_CLASS</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DEFAULT_CLASS = createField("RDB$DEFAULT_CLASS", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$FLAGS</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FLAGS = createField("RDB$FLAGS", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>RDB$RELATIONS.RDB$RELATION_TYPE</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$RELATION_TYPE = createField("RDB$RELATION_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this);

	public Rdb$relations() {
		super("RDB$RELATIONS");
	}

	public Rdb$relations(java.lang.String alias) {
		super(alias, null, org.jooq.util.firebird.rdb.tables.Rdb$relations.RDB$RELATIONS);
	}

	@Override
	public org.jooq.util.firebird.rdb.tables.Rdb$relations as(java.lang.String alias) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$relations(alias);
	}
}
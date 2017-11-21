/*
 * This file is generated by jOOQ.
*/
package main.java.data.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import main.java.data.Indexes;
import main.java.data.Keys;
import main.java.data.Public;
import main.java.data.tables.records.UserGroupLinksRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserGroupLinks extends TableImpl<UserGroupLinksRecord> {

    private static final long serialVersionUID = -46921445;

    /**
     * The reference instance of <code>public.user_group_links</code>
     */
    public static final UserGroupLinks USER_GROUP_LINKS = new UserGroupLinks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserGroupLinksRecord> getRecordType() {
        return UserGroupLinksRecord.class;
    }

    /**
     * The column <code>public.user_group_links.id</code>.
     */
    public final TableField<UserGroupLinksRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('user_group_links_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.user_group_links.user_id</code>.
     */
    public final TableField<UserGroupLinksRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.user_group_links.group_id</code>.
     */
    public final TableField<UserGroupLinksRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.user_group_links.is_admin</code>.
     */
    public final TableField<UserGroupLinksRecord, Boolean> IS_ADMIN = createField("is_admin", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.user_group_links.timestamp_joined</code>.
     */
    public final TableField<UserGroupLinksRecord, Timestamp> TIMESTAMP_JOINED = createField("timestamp_joined", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>public.user_group_links</code> table reference
     */
    public UserGroupLinks() {
        this(DSL.name("user_group_links"), null);
    }

    /**
     * Create an aliased <code>public.user_group_links</code> table reference
     */
    public UserGroupLinks(String alias) {
        this(DSL.name(alias), USER_GROUP_LINKS);
    }

    /**
     * Create an aliased <code>public.user_group_links</code> table reference
     */
    public UserGroupLinks(Name alias) {
        this(alias, USER_GROUP_LINKS);
    }

    private UserGroupLinks(Name alias, Table<UserGroupLinksRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserGroupLinks(Name alias, Table<UserGroupLinksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_GROUP_LINKS_ID_UINDEX, Indexes.USER_GROUP_LINKS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserGroupLinksRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_GROUP_LINKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserGroupLinksRecord> getPrimaryKey() {
        return Keys.USER_GROUP_LINKS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserGroupLinksRecord>> getKeys() {
        return Arrays.<UniqueKey<UserGroupLinksRecord>>asList(Keys.USER_GROUP_LINKS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserGroupLinksRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserGroupLinksRecord, ?>>asList(Keys.USER_GROUP_LINKS__USER_GROUP_LINKS_USERS_ID_FK, Keys.USER_GROUP_LINKS__USER_GROUP_LINKS_GROUPS_ID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupLinks as(String alias) {
        return new UserGroupLinks(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupLinks as(Name alias) {
        return new UserGroupLinks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGroupLinks rename(String name) {
        return new UserGroupLinks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserGroupLinks rename(Name name) {
        return new UserGroupLinks(name, null);
    }
}

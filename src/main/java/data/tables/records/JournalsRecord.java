/*
 * This file is generated by jOOQ.
*/
package main.java.data.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import main.java.data.tables.Journals;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JournalsRecord extends UpdatableRecordImpl<JournalsRecord> implements Record4<Integer, String, OffsetDateTime, Integer> {

    private static final long serialVersionUID = -621724686;

    /**
     * Setter for <code>public.journals.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.journals.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.journals.entry</code>.
     */
    public void setEntry(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.journals.entry</code>.
     */
    public String getEntry() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.journals.timestamp</code>.
     */
    public void setTimestamp(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.journals.timestamp</code>.
     */
    public OffsetDateTime getTimestamp() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>public.journals.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.journals.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, OffsetDateTime, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, OffsetDateTime, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Journals.JOURNALS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Journals.JOURNALS.ENTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field3() {
        return Journals.JOURNALS.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Journals.JOURNALS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEntry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component3() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEntry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value3() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalsRecord value2(String value) {
        setEntry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalsRecord value3(OffsetDateTime value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalsRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JournalsRecord values(Integer value1, String value2, OffsetDateTime value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JournalsRecord
     */
    public JournalsRecord() {
        super(Journals.JOURNALS);
    }

    /**
     * Create a detached, initialised JournalsRecord
     */
    public JournalsRecord(Integer id, String entry, OffsetDateTime timestamp, Integer userId) {
        super(Journals.JOURNALS);

        set(0, id);
        set(1, entry);
        set(2, timestamp);
        set(3, userId);
    }
}

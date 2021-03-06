/*
 * This file is generated by jOOQ.
*/
package xyz.cetacea.data;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.groups_id_seq</code>
     */
    public static final Sequence<Long> GROUPS_ID_SEQ = new SequenceImpl<Long>("groups_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.journals_id_seq</code>
     */
    public static final Sequence<Long> JOURNALS_ID_SEQ = new SequenceImpl<Long>("journals_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.user_group_links_id_seq</code>
     */
    public static final Sequence<Long> USER_GROUP_LINKS_ID_SEQ = new SequenceImpl<Long>("user_group_links_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.users_id_seq</code>
     */
    public static final Sequence<Long> USERS_ID_SEQ = new SequenceImpl<Long>("users_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}

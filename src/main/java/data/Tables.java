/*
 * This file is generated by jOOQ.
*/
package main.java.data;


import javax.annotation.Generated;

import main.java.data.tables.Groups;
import main.java.data.tables.Journals;
import main.java.data.tables.UserGroupLinks;
import main.java.data.tables.Users;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.groups</code>.
     */
    public static final Groups GROUPS = main.java.data.tables.Groups.GROUPS;

    /**
     * The table <code>public.journals</code>.
     */
    public static final Journals JOURNALS = main.java.data.tables.Journals.JOURNALS;

    /**
     * The table <code>public.user_group_links</code>.
     */
    public static final UserGroupLinks USER_GROUP_LINKS = main.java.data.tables.UserGroupLinks.USER_GROUP_LINKS;

    /**
     * The table <code>public.users</code>.
     */
    public static final Users USERS = main.java.data.tables.Users.USERS;
}
/*
 * This file is generated by jOOQ.
 */
package com.jzy.order.db.tables;


import com.jzy.order.db.Indexes;
import com.jzy.order.db.Keys;
import com.jzy.order.db.Order;
import com.jzy.order.db.tables.records.CommentRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Comment extends TableImpl<CommentRecord> {

    private static final long serialVersionUID = 1099545694;

    /**
     * The reference instance of <code>order.comment</code>
     */
    public static final Comment COMMENT = new Comment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentRecord> getRecordType() {
        return CommentRecord.class;
    }

    /**
     * The column <code>order.comment.id</code>.
     */
    public final TableField<CommentRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>order.comment.order_id</code>.
     */
    public final TableField<CommentRecord, String> ORDER_ID = createField(DSL.name("order_id"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>order.comment.shop_id</code>.
     */
    public final TableField<CommentRecord, Long> SHOP_ID = createField(DSL.name("shop_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>order.comment.uid</code>.
     */
    public final TableField<CommentRecord, String> UID = createField(DSL.name("uid"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>order.comment.all_score</code>.
     */
    public final TableField<CommentRecord, Integer> ALL_SCORE = createField(DSL.name("all_score"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>order.comment.brief_comment</code>.
     */
    public final TableField<CommentRecord, String> BRIEF_COMMENT = createField(DSL.name("brief_comment"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>order.comment.ctime</code>.
     */
    public final TableField<CommentRecord, Timestamp> CTIME = createField(DSL.name("ctime"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>order.comment.mtime</code>.
     */
    public final TableField<CommentRecord, Timestamp> MTIME = createField(DSL.name("mtime"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>order.comment</code> table reference
     */
    public Comment() {
        this(DSL.name("comment"), null);
    }

    /**
     * Create an aliased <code>order.comment</code> table reference
     */
    public Comment(String alias) {
        this(DSL.name(alias), COMMENT);
    }

    /**
     * Create an aliased <code>order.comment</code> table reference
     */
    public Comment(Name alias) {
        this(alias, COMMENT);
    }

    private Comment(Name alias, Table<CommentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Comment(Name alias, Table<CommentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Comment(Table<O> child, ForeignKey<O, CommentRecord> key) {
        super(child, key, COMMENT);
    }

    @Override
    public Schema getSchema() {
        return Order.ORDER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COMMENT_PRIMARY, Indexes.COMMENT_SHOP_ID_UID, Indexes.COMMENT_UK_ORDER_ID);
    }

    @Override
    public Identity<CommentRecord, Long> getIdentity() {
        return Keys.IDENTITY_COMMENT;
    }

    @Override
    public UniqueKey<CommentRecord> getPrimaryKey() {
        return Keys.KEY_COMMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<CommentRecord>> getKeys() {
        return Arrays.<UniqueKey<CommentRecord>>asList(Keys.KEY_COMMENT_PRIMARY, Keys.KEY_COMMENT_UK_ORDER_ID);
    }

    @Override
    public Comment as(String alias) {
        return new Comment(DSL.name(alias), this);
    }

    @Override
    public Comment as(Name alias) {
        return new Comment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Comment rename(String name) {
        return new Comment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Comment rename(Name name) {
        return new Comment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Long, String, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}

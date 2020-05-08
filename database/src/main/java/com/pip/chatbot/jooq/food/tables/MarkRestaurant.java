/*
 * This file is generated by jOOQ.
 */
package com.pip.chatbot.jooq.food.tables;


import com.pip.chatbot.jooq.food.Food;
import com.pip.chatbot.jooq.food.Keys;
import com.pip.chatbot.jooq.food.tables.records.MarkRestaurantRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MarkRestaurant extends TableImpl<MarkRestaurantRecord> {

    private static final long serialVersionUID = 1063612276;

    /**
     * The reference instance of <code>food.mark_restaurant</code>
     */
    public static final MarkRestaurant MARK_RESTAURANT = new MarkRestaurant();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MarkRestaurantRecord> getRecordType() {
        return MarkRestaurantRecord.class;
    }

    /**
     * The column <code>food.mark_restaurant.id</code>.
     */
    public final TableField<MarkRestaurantRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('food.mark_restaurant_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>food.mark_restaurant.restaurant_id</code>.
     */
    public final TableField<MarkRestaurantRecord, Integer> RESTAURANT_ID = createField(DSL.name("restaurant_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>food.mark_restaurant.mark</code>.
     */
    public final TableField<MarkRestaurantRecord, Float> MARK = createField(DSL.name("mark"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>food.mark_restaurant</code> table reference
     */
    public MarkRestaurant() {
        this(DSL.name("mark_restaurant"), null);
    }

    /**
     * Create an aliased <code>food.mark_restaurant</code> table reference
     */
    public MarkRestaurant(String alias) {
        this(DSL.name(alias), MARK_RESTAURANT);
    }

    /**
     * Create an aliased <code>food.mark_restaurant</code> table reference
     */
    public MarkRestaurant(Name alias) {
        this(alias, MARK_RESTAURANT);
    }

    private MarkRestaurant(Name alias, Table<MarkRestaurantRecord> aliased) {
        this(alias, aliased, null);
    }

    private MarkRestaurant(Name alias, Table<MarkRestaurantRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> MarkRestaurant(Table<O> child, ForeignKey<O, MarkRestaurantRecord> key) {
        super(child, key, MARK_RESTAURANT);
    }

    @Override
    public Schema getSchema() {
        return Food.FOOD;
    }

    @Override
    public Identity<MarkRestaurantRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MARK_RESTAURANT;
    }

    @Override
    public UniqueKey<MarkRestaurantRecord> getPrimaryKey() {
        return Keys.MARK_RESTAURANT_PKEY;
    }

    @Override
    public List<UniqueKey<MarkRestaurantRecord>> getKeys() {
        return Arrays.<UniqueKey<MarkRestaurantRecord>>asList(Keys.MARK_RESTAURANT_PKEY);
    }

    @Override
    public List<ForeignKey<MarkRestaurantRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MarkRestaurantRecord, ?>>asList(Keys.MARK_RESTAURANT__MARK_RESTAURANT_RESTAURANT_ID_FKEY);
    }

    public Restaurant restaurant() {
        return new Restaurant(this, Keys.MARK_RESTAURANT__MARK_RESTAURANT_RESTAURANT_ID_FKEY);
    }

    @Override
    public MarkRestaurant as(String alias) {
        return new MarkRestaurant(DSL.name(alias), this);
    }

    @Override
    public MarkRestaurant as(Name alias) {
        return new MarkRestaurant(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MarkRestaurant rename(String name) {
        return new MarkRestaurant(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MarkRestaurant rename(Name name) {
        return new MarkRestaurant(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Float> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

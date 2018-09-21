package com.ptconsultancy.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = 384942779L;

    public static final QCustomer customer = new QCustomer("customer");

    public final NumberPath<Long> custId = createNumber("custId", Long.class);

    public final StringPath forename = createString("forename");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SimplePath<com.ptconsultancy.domain.datamodels.Address> primaryAddress = createSimple("primaryAddress", com.ptconsultancy.domain.datamodels.Address.class);

    public final StringPath surname = createString("surname");

    public QCustomer(String variable) {
        super(Customer.class, forVariable(variable));
    }

    public QCustomer(Path<? extends Customer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomer(PathMetadata metadata) {
        super(Customer.class, metadata);
    }

}


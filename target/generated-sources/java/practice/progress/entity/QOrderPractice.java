package practice.progress.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOrderPractice is a Querydsl query type for OrderPractice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderPractice extends EntityPathBase<OrderPractice> {

    private static final long serialVersionUID = 797617004L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderPractice orderPractice = new QOrderPractice("orderPractice");

    public final example.capter7.global.QBaseEntity _super = new example.capter7.global.QBaseEntity(this);

    public final QDeliveryPractice delivery;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMemberPractice member;

    //inherited
    public final StringPath name = _super.name;

    public final ListPath<OrderItemPractice, QOrderItemPractice> orderItemList = this.<OrderItemPractice, QOrderItemPractice>createList("orderItemList", OrderItemPractice.class, QOrderItemPractice.class, PathInits.DIRECT2);

    public QOrderPractice(String variable) {
        this(OrderPractice.class, forVariable(variable), INITS);
    }

    public QOrderPractice(Path<? extends OrderPractice> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderPractice(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderPractice(PathMetadata<?> metadata, PathInits inits) {
        this(OrderPractice.class, metadata, inits);
    }

    public QOrderPractice(Class<? extends OrderPractice> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.delivery = inits.isInitialized("delivery") ? new QDeliveryPractice(forProperty("delivery"), inits.get("delivery")) : null;
        this.member = inits.isInitialized("member") ? new QMemberPractice(forProperty("member"), inits.get("member")) : null;
    }

}


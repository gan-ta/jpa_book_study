package practice.progress.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOrderItemPractice is a Querydsl query type for OrderItemPractice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderItemPractice extends EntityPathBase<OrderItemPractice> {

    private static final long serialVersionUID = -1760737505L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderItemPractice orderItemPractice = new QOrderItemPractice("orderItemPractice");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QItemPractice item;

    public final QOrderPractice order;

    public final NumberPath<Integer> orderprice = createNumber("orderprice", Integer.class);

    public QOrderItemPractice(String variable) {
        this(OrderItemPractice.class, forVariable(variable), INITS);
    }

    public QOrderItemPractice(Path<? extends OrderItemPractice> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderItemPractice(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderItemPractice(PathMetadata<?> metadata, PathInits inits) {
        this(OrderItemPractice.class, metadata, inits);
    }

    public QOrderItemPractice(Class<? extends OrderItemPractice> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItemPractice(forProperty("item")) : null;
        this.order = inits.isInitialized("order") ? new QOrderPractice(forProperty("order"), inits.get("order")) : null;
    }

}


package practice.progress.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QDeliveryPractice is a Querydsl query type for DeliveryPractice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDeliveryPractice extends EntityPathBase<DeliveryPractice> {

    private static final long serialVersionUID = 277251500L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeliveryPractice deliveryPractice = new QDeliveryPractice("deliveryPractice");

    public final practice.progress.global.QAddressPractice address;

    public final EnumPath<DeliveryStatus> deliveryStatus = createEnum("deliveryStatus", DeliveryStatus.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QOrderPractice order;

    public QDeliveryPractice(String variable) {
        this(DeliveryPractice.class, forVariable(variable), INITS);
    }

    public QDeliveryPractice(Path<? extends DeliveryPractice> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeliveryPractice(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeliveryPractice(PathMetadata<?> metadata, PathInits inits) {
        this(DeliveryPractice.class, metadata, inits);
    }

    public QDeliveryPractice(Class<? extends DeliveryPractice> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new practice.progress.global.QAddressPractice(forProperty("address")) : null;
        this.order = inits.isInitialized("order") ? new QOrderPractice(forProperty("order"), inits.get("order")) : null;
    }

}


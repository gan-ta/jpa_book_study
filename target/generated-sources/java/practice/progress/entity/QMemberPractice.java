package practice.progress.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMemberPractice is a Querydsl query type for MemberPractice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMemberPractice extends EntityPathBase<MemberPractice> {

    private static final long serialVersionUID = 1684169106L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberPractice memberPractice = new QMemberPractice("memberPractice");

    public final practice.progress.global.QBaseEntity _super = new practice.progress.global.QBaseEntity(this);

    public final practice.progress.global.QAddressPractice address;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final ListPath<OrderPractice, QOrderPractice> orders = this.<OrderPractice, QOrderPractice>createList("orders", OrderPractice.class, QOrderPractice.class, PathInits.DIRECT2);

    public QMemberPractice(String variable) {
        this(MemberPractice.class, forVariable(variable), INITS);
    }

    public QMemberPractice(Path<? extends MemberPractice> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMemberPractice(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMemberPractice(PathMetadata<?> metadata, PathInits inits) {
        this(MemberPractice.class, metadata, inits);
    }

    public QMemberPractice(Class<? extends MemberPractice> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new practice.progress.global.QAddressPractice(forProperty("address")) : null;
    }

}


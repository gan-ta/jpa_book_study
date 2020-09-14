package example.capter9.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMember9 is a Querydsl query type for Member9
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMember9 extends EntityPathBase<Member9> {

    private static final long serialVersionUID = -66708964L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember9 member9 = new QMember9("member9");

    public final ListPath<example.capter9.global.Address9, example.capter9.global.QAddress9> addressHistory = this.<example.capter9.global.Address9, example.capter9.global.QAddress9>createList("addressHistory", example.capter9.global.Address9.class, example.capter9.global.QAddress9.class, PathInits.DIRECT2);

    public final SetPath<String, StringPath> favoriteFoods = this.<String, StringPath>createSet("favoriteFoods", String.class, StringPath.class, PathInits.DIRECT2);

    public final example.capter9.global.QAddress9 homeAddress;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QMember9(String variable) {
        this(Member9.class, forVariable(variable), INITS);
    }

    public QMember9(Path<? extends Member9> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMember9(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMember9(PathMetadata<?> metadata, PathInits inits) {
        this(Member9.class, metadata, inits);
    }

    public QMember9(Class<? extends Member9> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.homeAddress = inits.isInitialized("homeAddress") ? new example.capter9.global.QAddress9(forProperty("homeAddress")) : null;
    }

}


package example.capter9.global;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPhoneNumber9 is a Querydsl query type for PhoneNumber9
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QPhoneNumber9 extends BeanPath<PhoneNumber9> {

    private static final long serialVersionUID = 60028389L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPhoneNumber9 phoneNumber9 = new QPhoneNumber9("phoneNumber9");

    public final StringPath areaCode = createString("areaCode");

    public final StringPath localNumber = createString("localNumber");

    public final example.capter9.entity.QPhoneServiceProvider9 provider;

    public QPhoneNumber9(String variable) {
        this(PhoneNumber9.class, forVariable(variable), INITS);
    }

    public QPhoneNumber9(Path<? extends PhoneNumber9> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPhoneNumber9(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPhoneNumber9(PathMetadata<?> metadata, PathInits inits) {
        this(PhoneNumber9.class, metadata, inits);
    }

    public QPhoneNumber9(Class<? extends PhoneNumber9> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.provider = inits.isInitialized("provider") ? new example.capter9.entity.QPhoneServiceProvider9(forProperty("provider")) : null;
    }

}


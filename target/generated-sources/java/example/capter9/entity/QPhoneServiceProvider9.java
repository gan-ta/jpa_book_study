package example.capter9.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPhoneServiceProvider9 is a Querydsl query type for PhoneServiceProvider9
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPhoneServiceProvider9 extends EntityPathBase<PhoneServiceProvider9> {

    private static final long serialVersionUID = 1601672510L;

    public static final QPhoneServiceProvider9 phoneServiceProvider9 = new QPhoneServiceProvider9("phoneServiceProvider9");

    public final StringPath name = createString("name");

    public QPhoneServiceProvider9(String variable) {
        super(PhoneServiceProvider9.class, forVariable(variable));
    }

    public QPhoneServiceProvider9(Path<? extends PhoneServiceProvider9> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhoneServiceProvider9(PathMetadata<?> metadata) {
        super(PhoneServiceProvider9.class, metadata);
    }

}


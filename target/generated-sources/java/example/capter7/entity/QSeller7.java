package example.capter7.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSeller7 is a Querydsl query type for Seller7
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSeller7 extends EntityPathBase<Seller7> {

    private static final long serialVersionUID = 1983788567L;

    public static final QSeller7 seller7 = new QSeller7("seller7");

    public final example.capter7.global.QBaseEntity _super = new example.capter7.global.QBaseEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public final StringPath shopName = createString("shopName");

    public QSeller7(String variable) {
        super(Seller7.class, forVariable(variable));
    }

    public QSeller7(Path<? extends Seller7> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSeller7(PathMetadata<?> metadata) {
        super(Seller7.class, metadata);
    }

}


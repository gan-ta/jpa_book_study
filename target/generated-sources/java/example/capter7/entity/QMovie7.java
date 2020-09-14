package example.capter7.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMovie7 is a Querydsl query type for Movie7
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMovie7 extends EntityPathBase<Movie7> {

    private static final long serialVersionUID = -2037914200L;

    public static final QMovie7 movie7 = new QMovie7("movie7");

    public final example.capter7.global.QItem7 _super = new example.capter7.global.QItem7(this);

    public final StringPath actor = createString("actor");

    public final StringPath director = createString("director");

    //inherited
    public final NumberPath<Long> Id = _super.Id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final NumberPath<Integer> price = _super.price;

    public QMovie7(String variable) {
        super(Movie7.class, forVariable(variable));
    }

    public QMovie7(Path<? extends Movie7> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovie7(PathMetadata<?> metadata) {
        super(Movie7.class, metadata);
    }

}


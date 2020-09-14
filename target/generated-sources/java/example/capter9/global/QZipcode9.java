package example.capter9.global;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QZipcode9 is a Querydsl query type for Zipcode9
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QZipcode9 extends BeanPath<Zipcode9> {

    private static final long serialVersionUID = 1087566862L;

    public static final QZipcode9 zipcode9 = new QZipcode9("zipcode9");

    public final StringPath plusFour = createString("plusFour");

    public final StringPath zip = createString("zip");

    public QZipcode9(String variable) {
        super(Zipcode9.class, forVariable(variable));
    }

    public QZipcode9(Path<? extends Zipcode9> path) {
        super(path.getType(), path.getMetadata());
    }

    public QZipcode9(PathMetadata<?> metadata) {
        super(Zipcode9.class, metadata);
    }

}


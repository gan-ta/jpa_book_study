package example.capter7.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAlbum7 is a Querydsl query type for Album7
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAlbum7 extends EntityPathBase<Album7> {

    private static final long serialVersionUID = 1910148681L;

    public static final QAlbum7 album7 = new QAlbum7("album7");

    public final example.capter7.global.QItem7 _super = new example.capter7.global.QItem7(this);

    public final StringPath artist = createString("artist");

    //inherited
    public final NumberPath<Long> Id = _super.Id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final NumberPath<Integer> price = _super.price;

    public QAlbum7(String variable) {
        super(Album7.class, forVariable(variable));
    }

    public QAlbum7(Path<? extends Album7> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlbum7(PathMetadata<?> metadata) {
        super(Album7.class, metadata);
    }

}


package practice.progress.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAlbumPractice is a Querydsl query type for AlbumPractice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAlbumPractice extends EntityPathBase<AlbumPractice> {

    private static final long serialVersionUID = 732819853L;

    public static final QAlbumPractice albumPractice = new QAlbumPractice("albumPractice");

    public final QItemPractice _super = new QItemPractice(this);

    public final StringPath artist = createString("artist");

    //inherited
    public final ListPath<CategoryPractice, QCategoryPractice> categoties = _super.categoties;

    public final StringPath etc = createString("etc");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final NumberPath<Integer> price = _super.price;

    //inherited
    public final NumberPath<Integer> stockQuantity = _super.stockQuantity;

    public QAlbumPractice(String variable) {
        super(AlbumPractice.class, forVariable(variable));
    }

    public QAlbumPractice(Path<? extends AlbumPractice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlbumPractice(PathMetadata<?> metadata) {
        super(AlbumPractice.class, metadata);
    }

}


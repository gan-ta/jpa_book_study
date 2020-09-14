package practice.progress.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMoviePractice is a Querydsl query type for MoviePractice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMoviePractice extends EntityPathBase<MoviePractice> {

    private static final long serialVersionUID = -47161010L;

    public static final QMoviePractice moviePractice = new QMoviePractice("moviePractice");

    public final QItemPractice _super = new QItemPractice(this);

    public final StringPath actor = createString("actor");

    //inherited
    public final ListPath<CategoryPractice, QCategoryPractice> categoties = _super.categoties;

    public final StringPath director = createString("director");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final NumberPath<Integer> price = _super.price;

    //inherited
    public final NumberPath<Integer> stockQuantity = _super.stockQuantity;

    public QMoviePractice(String variable) {
        super(MoviePractice.class, forVariable(variable));
    }

    public QMoviePractice(Path<? extends MoviePractice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMoviePractice(PathMetadata<?> metadata) {
        super(MoviePractice.class, metadata);
    }

}


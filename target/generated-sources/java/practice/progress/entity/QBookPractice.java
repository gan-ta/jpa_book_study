package practice.progress.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBookPractice is a Querydsl query type for BookPractice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBookPractice extends EntityPathBase<BookPractice> {

    private static final long serialVersionUID = -732129759L;

    public static final QBookPractice bookPractice = new QBookPractice("bookPractice");

    public final QItemPractice _super = new QItemPractice(this);

    public final StringPath author = createString("author");

    //inherited
    public final ListPath<CategoryPractice, QCategoryPractice> categoties = _super.categoties;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath isbn = createString("isbn");

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final NumberPath<Integer> price = _super.price;

    //inherited
    public final NumberPath<Integer> stockQuantity = _super.stockQuantity;

    public QBookPractice(String variable) {
        super(BookPractice.class, forVariable(variable));
    }

    public QBookPractice(Path<? extends BookPractice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBookPractice(PathMetadata<?> metadata) {
        super(BookPractice.class, metadata);
    }

}


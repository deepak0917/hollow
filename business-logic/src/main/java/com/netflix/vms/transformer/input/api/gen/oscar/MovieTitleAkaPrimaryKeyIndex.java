package com.netflix.vms.transformer.input.api.gen.oscar;

import com.netflix.hollow.api.consumer.HollowConsumer;
import com.netflix.hollow.api.consumer.index.AbstractHollowUniqueKeyIndex;
import com.netflix.hollow.api.consumer.index.HollowUniqueKeyIndex;
import com.netflix.hollow.core.schema.HollowObjectSchema;

/**
 * @deprecated see {@link com.netflix.hollow.api.consumer.index.UniqueKeyIndex} which can be built as follows:
 * <pre>{@code
 *     UniqueKeyIndex<MovieTitleAka, K> uki = UniqueKeyIndex.from(consumer, MovieTitleAka.class)
 *         .usingBean(k);
 *     MovieTitleAka m = uki.findMatch(k);
 * }</pre>
 * where {@code K} is a class declaring key field paths members, annotated with
 * {@link com.netflix.hollow.api.consumer.index.FieldPath}, and {@code k} is an instance of
 * {@code K} that is the key to find the unique {@code MovieTitleAka} object.
 */
@Deprecated
@SuppressWarnings("all")
public class MovieTitleAkaPrimaryKeyIndex extends AbstractHollowUniqueKeyIndex<OscarAPI, MovieTitleAka> implements HollowUniqueKeyIndex<MovieTitleAka> {

    public MovieTitleAkaPrimaryKeyIndex(HollowConsumer consumer) {
        this(consumer, true);
    }

    public MovieTitleAkaPrimaryKeyIndex(HollowConsumer consumer, boolean isListenToDataRefresh) {
        this(consumer, isListenToDataRefresh, ((HollowObjectSchema)consumer.getStateEngine().getNonNullSchema("MovieTitleAka")).getPrimaryKey().getFieldPaths());
    }

    public MovieTitleAkaPrimaryKeyIndex(HollowConsumer consumer, String... fieldPaths) {
        this(consumer, true, fieldPaths);
    }

    public MovieTitleAkaPrimaryKeyIndex(HollowConsumer consumer, boolean isListenToDataRefresh, String... fieldPaths) {
        super(consumer, "MovieTitleAka", isListenToDataRefresh, fieldPaths);
    }

    @Override
    public MovieTitleAka findMatch(Object... keys) {
        int ordinal = idx.getMatchingOrdinal(keys);
        if(ordinal == -1)
            return null;
        return api.getMovieTitleAka(ordinal);
    }

}
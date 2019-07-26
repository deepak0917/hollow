package com.netflix.vms.transformer.input.api.gen.oscar;

import com.netflix.hollow.api.consumer.HollowConsumer;
import com.netflix.hollow.api.consumer.data.AbstractHollowDataAccessor;
import com.netflix.hollow.core.index.key.PrimaryKey;
import com.netflix.hollow.core.read.engine.HollowReadStateEngine;

@SuppressWarnings("all")
public class SourceRequestDefaultFulfillmentDataAccessor extends AbstractHollowDataAccessor<SourceRequestDefaultFulfillment> {

    public static final String TYPE = "SourceRequestDefaultFulfillment";
    private OscarAPI api;

    public SourceRequestDefaultFulfillmentDataAccessor(HollowConsumer consumer) {
        super(consumer, TYPE);
        this.api = (OscarAPI)consumer.getAPI();
    }

    public SourceRequestDefaultFulfillmentDataAccessor(HollowReadStateEngine rStateEngine, OscarAPI api) {
        super(rStateEngine, TYPE);
        this.api = api;
    }

    public SourceRequestDefaultFulfillmentDataAccessor(HollowReadStateEngine rStateEngine, OscarAPI api, String ... fieldPaths) {
        super(rStateEngine, TYPE, fieldPaths);
        this.api = api;
    }

    public SourceRequestDefaultFulfillmentDataAccessor(HollowReadStateEngine rStateEngine, OscarAPI api, PrimaryKey primaryKey) {
        super(rStateEngine, TYPE, primaryKey);
        this.api = api;
    }

    @Override public SourceRequestDefaultFulfillment getRecord(int ordinal){
        return api.getSourceRequestDefaultFulfillment(ordinal);
    }

}
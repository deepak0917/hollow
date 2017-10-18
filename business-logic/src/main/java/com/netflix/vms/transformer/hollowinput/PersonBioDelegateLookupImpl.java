package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;

@SuppressWarnings("all")
public class PersonBioDelegateLookupImpl extends HollowObjectAbstractDelegate implements PersonBioDelegate {

    private final PersonBioTypeAPI typeAPI;

    public PersonBioDelegateLookupImpl(PersonBioTypeAPI typeAPI) {
        this.typeAPI = typeAPI;
    }

    public int getSpousesOrdinal(int ordinal) {
        return typeAPI.getSpousesOrdinal(ordinal);
    }

    public int getPartnersOrdinal(int ordinal) {
        return typeAPI.getPartnersOrdinal(ordinal);
    }

    public int getRelationshipsOrdinal(int ordinal) {
        return typeAPI.getRelationshipsOrdinal(ordinal);
    }

    public int getCurrentRelationshipOrdinal(int ordinal) {
        return typeAPI.getCurrentRelationshipOrdinal(ordinal);
    }

    public long getPersonId(int ordinal) {
        return typeAPI.getPersonId(ordinal);
    }

    public Long getPersonIdBoxed(int ordinal) {
        return typeAPI.getPersonIdBoxed(ordinal);
    }

    public int getBirthDateOrdinal(int ordinal) {
        return typeAPI.getBirthDateOrdinal(ordinal);
    }

    public int getDeathDateOrdinal(int ordinal) {
        return typeAPI.getDeathDateOrdinal(ordinal);
    }

    public int getMovieIdsOrdinal(int ordinal) {
        return typeAPI.getMovieIdsOrdinal(ordinal);
    }

    public PersonBioTypeAPI getTypeAPI() {
        return typeAPI;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

}
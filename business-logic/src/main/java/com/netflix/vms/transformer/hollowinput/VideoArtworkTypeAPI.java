package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.custom.HollowObjectTypeAPI;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;

@SuppressWarnings("all")
public class VideoArtworkTypeAPI extends HollowObjectTypeAPI {

    private final VideoArtworkDelegateLookupImpl delegateLookupImpl;

    VideoArtworkTypeAPI(VMSHollowInputAPI api, HollowObjectTypeDataAccess typeDataAccess) {
        super(api, typeDataAccess, new String[] {
            "movieId",
            "sourceFileId",
            "seqNum",
            "derivatives",
            "locales",
            "attributes",
            "ordinalPriority",
            "fileImageType",
            "phaseTags",
            "isSmoky",
            "rolloutExclusive"
        });
        this.delegateLookupImpl = new VideoArtworkDelegateLookupImpl(this);
    }

    public long getMovieId(int ordinal) {
        if(fieldIndex[0] == -1)
            return missingDataHandler().handleLong("VideoArtwork", ordinal, "movieId");
        return getTypeDataAccess().readLong(ordinal, fieldIndex[0]);
    }

    public Long getMovieIdBoxed(int ordinal) {
        long l;
        if(fieldIndex[0] == -1) {
            l = missingDataHandler().handleLong("VideoArtwork", ordinal, "movieId");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[0]);
            l = getTypeDataAccess().readLong(ordinal, fieldIndex[0]);
        }
        if(l == Long.MIN_VALUE)
            return null;
        return Long.valueOf(l);
    }



    public int getSourceFileIdOrdinal(int ordinal) {
        if(fieldIndex[1] == -1)
            return missingDataHandler().handleReferencedOrdinal("VideoArtwork", ordinal, "sourceFileId");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[1]);
    }

    public StringTypeAPI getSourceFileIdTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public long getSeqNum(int ordinal) {
        if(fieldIndex[2] == -1)
            return missingDataHandler().handleLong("VideoArtwork", ordinal, "seqNum");
        return getTypeDataAccess().readLong(ordinal, fieldIndex[2]);
    }

    public Long getSeqNumBoxed(int ordinal) {
        long l;
        if(fieldIndex[2] == -1) {
            l = missingDataHandler().handleLong("VideoArtwork", ordinal, "seqNum");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[2]);
            l = getTypeDataAccess().readLong(ordinal, fieldIndex[2]);
        }
        if(l == Long.MIN_VALUE)
            return null;
        return Long.valueOf(l);
    }



    public int getDerivativesOrdinal(int ordinal) {
        if(fieldIndex[3] == -1)
            return missingDataHandler().handleReferencedOrdinal("VideoArtwork", ordinal, "derivatives");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[3]);
    }

    public ArtworkDerivativeSetTypeAPI getDerivativesTypeAPI() {
        return getAPI().getArtworkDerivativeSetTypeAPI();
    }

    public int getLocalesOrdinal(int ordinal) {
        if(fieldIndex[4] == -1)
            return missingDataHandler().handleReferencedOrdinal("VideoArtwork", ordinal, "locales");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[4]);
    }

    public ArtworkLocaleListTypeAPI getLocalesTypeAPI() {
        return getAPI().getArtworkLocaleListTypeAPI();
    }

    public int getAttributesOrdinal(int ordinal) {
        if(fieldIndex[5] == -1)
            return missingDataHandler().handleReferencedOrdinal("VideoArtwork", ordinal, "attributes");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[5]);
    }

    public ArtworkAttributesTypeAPI getAttributesTypeAPI() {
        return getAPI().getArtworkAttributesTypeAPI();
    }

    public long getOrdinalPriority(int ordinal) {
        if(fieldIndex[6] == -1)
            return missingDataHandler().handleLong("VideoArtwork", ordinal, "ordinalPriority");
        return getTypeDataAccess().readLong(ordinal, fieldIndex[6]);
    }

    public Long getOrdinalPriorityBoxed(int ordinal) {
        long l;
        if(fieldIndex[6] == -1) {
            l = missingDataHandler().handleLong("VideoArtwork", ordinal, "ordinalPriority");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[6]);
            l = getTypeDataAccess().readLong(ordinal, fieldIndex[6]);
        }
        if(l == Long.MIN_VALUE)
            return null;
        return Long.valueOf(l);
    }



    public int getFileImageTypeOrdinal(int ordinal) {
        if(fieldIndex[7] == -1)
            return missingDataHandler().handleReferencedOrdinal("VideoArtwork", ordinal, "fileImageType");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[7]);
    }

    public StringTypeAPI getFileImageTypeTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getPhaseTagsOrdinal(int ordinal) {
        if(fieldIndex[8] == -1)
            return missingDataHandler().handleReferencedOrdinal("VideoArtwork", ordinal, "phaseTags");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[8]);
    }

    public PhaseTagListTypeAPI getPhaseTagsTypeAPI() {
        return getAPI().getPhaseTagListTypeAPI();
    }

    public boolean getIsSmoky(int ordinal) {
        if(fieldIndex[9] == -1)
            return missingDataHandler().handleBoolean("VideoArtwork", ordinal, "isSmoky") == Boolean.TRUE;
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[9]) == Boolean.TRUE;
    }

    public Boolean getIsSmokyBoxed(int ordinal) {
        if(fieldIndex[9] == -1)
            return missingDataHandler().handleBoolean("VideoArtwork", ordinal, "isSmoky");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[9]);
    }



    public boolean getRolloutExclusive(int ordinal) {
        if(fieldIndex[10] == -1)
            return missingDataHandler().handleBoolean("VideoArtwork", ordinal, "rolloutExclusive") == Boolean.TRUE;
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[10]) == Boolean.TRUE;
    }

    public Boolean getRolloutExclusiveBoxed(int ordinal) {
        if(fieldIndex[10] == -1)
            return missingDataHandler().handleBoolean("VideoArtwork", ordinal, "rolloutExclusive");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[10]);
    }



    public VideoArtworkDelegateLookupImpl getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

    @Override
    public VMSHollowInputAPI getAPI() {
        return (VMSHollowInputAPI) api;
    }

}
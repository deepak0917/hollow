package com.netflix.vms.transformer.hollowoutput;

import com.netflix.hollow.core.write.objectmapper.HollowPrimaryKey;
import java.util.Map;

@HollowPrimaryKey(fields={"contractId", "videoId"})
public class LanguageRights implements Cloneable {

    public int contractId = java.lang.Integer.MIN_VALUE;
    public Video videoId = null;
    public Map<ISOCountry, Map<Integer, LanguageRestrictions>> languageRestrictionsMap = null;
    public Map<Strings, Map<Integer, LanguageRestrictions>> fallbackRestrictionsMap = null;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof LanguageRights))
            return false;

        LanguageRights o = (LanguageRights) other;
        if(o.contractId != contractId) return false;
        if(o.videoId == null) {
            if(videoId != null) return false;
        } else if(!o.videoId.equals(videoId)) return false;
        if(o.languageRestrictionsMap == null) {
            if(languageRestrictionsMap != null) return false;
        } else if(!o.languageRestrictionsMap.equals(languageRestrictionsMap)) return false;
        if(o.fallbackRestrictionsMap == null) {
            if(fallbackRestrictionsMap != null) return false;
        } else if(!o.fallbackRestrictionsMap.equals(fallbackRestrictionsMap)) return false;
        return true;
    }

    public int hashCode() {
        int hashCode = 1;
        hashCode = hashCode * 31 + contractId;
        hashCode = hashCode * 31 + (videoId == null ? 1237 : videoId.hashCode());
        hashCode = hashCode * 31 + (languageRestrictionsMap == null ? 1237 : languageRestrictionsMap.hashCode());
        hashCode = hashCode * 31 + (fallbackRestrictionsMap == null ? 1237 : fallbackRestrictionsMap.hashCode());
        return hashCode;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("LanguageRights{");
        builder.append("contractId=").append(contractId);
        builder.append(",videoId=").append(videoId);
        builder.append(",languageRestrictionsMap=").append(languageRestrictionsMap);
        builder.append(",fallbackRestrictionsMap=").append(fallbackRestrictionsMap);
        builder.append("}");
        return builder.toString();
    }

    public LanguageRights clone() {
        try {
            LanguageRights clone = (LanguageRights)super.clone();
            clone.__assigned_ordinal = -1;
            return clone;
        } catch (CloneNotSupportedException cnse) { throw new RuntimeException(cnse); }
    }

    @SuppressWarnings("unused")
    private long __assigned_ordinal = -1;
}
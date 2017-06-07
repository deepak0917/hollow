package com.netflix.vms.transformer.hollowoutput;


public class TargetDimensions implements Cloneable {

    public int heightInPixels = java.lang.Integer.MIN_VALUE;
    public int widthInPixels = java.lang.Integer.MIN_VALUE;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof TargetDimensions))
            return false;

        TargetDimensions o = (TargetDimensions) other;
        if(o.heightInPixels != heightInPixels) return false;
        if(o.widthInPixels != widthInPixels) return false;
        return true;
    }

    public int hashCode() {
        int hashCode = 1;
        hashCode = hashCode * 31 + heightInPixels;
        hashCode = hashCode * 31 + widthInPixels;
        return hashCode;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("TargetDimensions{");
        builder.append("heightInPixels=").append(heightInPixels);
        builder.append(",widthInPixels=").append(widthInPixels);
        builder.append("}");
        return builder.toString();
    }

    public TargetDimensions clone() {
        try {
            TargetDimensions clone = (TargetDimensions)super.clone();
            clone.__assigned_ordinal = -1;
            return clone;
        } catch (CloneNotSupportedException cnse) { throw new RuntimeException(cnse); }
    }

    @SuppressWarnings("unused")
    private long __assigned_ordinal = -1;
}

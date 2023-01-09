package ru.osmanov.courtcounter;

import android.os.Parcel;
import android.os.Parcelable;

public class Counter implements Parcelable {
    private int countA;
    private int countB;

    public Counter() {
        countA = 0;
        countB = 0;
    }

    protected Counter(Parcel in) {
        countA = in.readInt();
        countB = in.readInt();
    }

    public static final Creator<Counter> CREATOR = new Creator<Counter>() {
        @Override
        public Counter createFromParcel(Parcel in) {
            return new Counter(in);
        }

        @Override
        public Counter[] newArray(int size) {
            return new Counter[size];
        }
    };

    public int getCountA() {
        return countA;
    }

    public int getCountB() {
        return countB;
    }

    public void setCountA(int countA) {
        this.countA = countA;
    }

    public void setCountB(int countB) {
        this.countB = countB;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(countA);
        parcel.writeInt(countB);
    }
}

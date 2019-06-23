package com.faisalridwan.com.marveldata;

import android.os.Parcel;
import android.os.Parcelable;


public class Marvel implements Parcelable {
    private String hero, nama, aktor,photo, deskripsi;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hero);
        dest.writeString(this.nama);
        dest.writeString(this.aktor);
        dest.writeString(this.photo);
        dest.writeString(this.deskripsi);
    }

    public Marvel() {
    }

    protected Marvel(Parcel in) {
        this.hero = in.readString();
        this.nama = in.readString();
        this.aktor = in.readString();
        this.photo = in.readString();
        this.deskripsi = in.readString();
    }

    public static final Creator<Marvel> CREATOR = new Creator<Marvel>() {
        @Override
        public Marvel createFromParcel(Parcel source) {
            return new Marvel(source);
        }

        @Override
        public Marvel[] newArray(int size) {
            return new Marvel[size];
        }
    };

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAktor() {
        return aktor;
    }

    public void setAktor(String aktor) {
        this.aktor = aktor;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}

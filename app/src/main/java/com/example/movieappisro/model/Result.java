package com.example.movieappisro.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result implements Parcelable {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("results")
    @Expose
    private List<Movie> results = null;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    public final static Parcelable.Creator<Result> CREATOR = new Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel parcel) {
            return new Result(parcel);
        }

        @Override
        public Result[] newArray(int i) {
            return new Result[0];
        }
    };

    public Result() {

    }

    public Result(Parcel in ) {
        this.page = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.results,(com.example.movieappisro.model.Movie.class.getClassLoader()));
        this.totalPages =((Integer) in.readValue((Integer.class.getClassLoader())));
        this.totalResults = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(page);
        parcel.writeValue(totalResults);
        parcel.writeValue(totalPages);
        parcel.writeValue(results);
    }
}
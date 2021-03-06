package com.thaichicken.cinemabooking.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movie", schema = "public", catalog = "pis-db")
public class MovieEntity {
    private int movieId;
    private String name;
    private String description;
    private Integer length;
    private Integer productionYear;
    private String type;
    private String director;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movieGenerator")
    @SequenceGenerator(name = "movieGenerator", sequenceName = "movie_id_seq", allocationSize = 1)
    @Column(name = "movie_id", nullable = false)
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", length = 2000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "length")
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Basic
    @Column(name = "production_year")
    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    @Basic
    @Column(name = "type", length = 50)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "director", length = 100)
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieEntity that = (MovieEntity) o;

        if (movieId != that.movieId) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(description, that.description)) return false;
        if (!Objects.equals(length, that.length)) return false;
        if (!Objects.equals(productionYear, that.productionYear))
            return false;
        if (!Objects.equals(type, that.type)) return false;
        return Objects.equals(director, that.director);
    }

    @Override
    public int hashCode() {
        int result = movieId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (productionYear != null ? productionYear.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        return result;
    }
}

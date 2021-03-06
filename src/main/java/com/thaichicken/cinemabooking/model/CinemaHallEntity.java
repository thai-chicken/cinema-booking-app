package com.thaichicken.cinemabooking.model;

import javax.persistence.*;

@Entity
@Table(name = "cinema_hall", schema = "public", catalog = "pis-db")
public class CinemaHallEntity {
    private int cinemaHallNumber;
    private int nRows;
    private int nSeatsInRows;

    public CinemaHallEntity() {
    }

    public CinemaHallEntity(int cinemaHallNumber, int capacity, int nRows, int nSeatsInRows) {
        this.cinemaHallNumber = cinemaHallNumber;
        this.nRows = nRows;
        this.nSeatsInRows = nSeatsInRows;
    }

    @Id
    @Column(name = "cinema_hall_number", nullable = false)
    public int getCinemaHallNumber() {
        return cinemaHallNumber;
    }

    public void setCinemaHallNumber(int cinemaHallNumber) {
        this.cinemaHallNumber = cinemaHallNumber;
    }

    @Basic
    @Column(name = "n_rows", nullable = false)
    public int getnRows() {
        return nRows;
    }

    public void setnRows(int nRows) {
        this.nRows = nRows;
    }

    @Basic
    @Column(name = "n_seats_in_rows", nullable = false)
    public int getnSeatsInRows() {
        return nSeatsInRows;
    }

    public void setnSeatsInRows(int nSeatsInRows) {
        this.nSeatsInRows = nSeatsInRows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CinemaHallEntity that = (CinemaHallEntity) o;

        if (cinemaHallNumber != that.cinemaHallNumber) return false;
        if (nRows != that.nRows) return false;
        return nSeatsInRows == that.nSeatsInRows;
    }

    @Override
    public int hashCode() {
        int result = cinemaHallNumber;
        result = 31 * result + nRows;
        result = 31 * result + nSeatsInRows;
        return result;
    }
}

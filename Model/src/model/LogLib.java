
package model;

import java.sql.Date;

public class LogLib {
    private String UserID, BookID;
    private Date NgayDat, NgayMuon, NgayPTra, NgayTra;
    private String MaNV;
    private int LogID;

    public LogLib() {
    }

    public LogLib(String UserID, String BookID, Date NgayDat, Date NgayMuon, Date NgayPTra, Date NgayTra, String MaNV, int LogID) {
        this.UserID = UserID;
        this.BookID = BookID;
        this.NgayDat = NgayDat;
        this.NgayMuon = NgayMuon;
        this.NgayPTra = NgayPTra;
        this.NgayTra = NgayTra;
        this.MaNV = MaNV;
        this.LogID = LogID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public Date getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(Date NgayDat) {
        this.NgayDat = NgayDat;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayPTra() {
        return NgayPTra;
    }

    public void setNgayPTra(Date NgayPTra) {
        this.NgayPTra = NgayPTra;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getLogID() {
        return LogID;
    }

    public void setLogID(int LogID) {
        this.LogID = LogID;
    }
    
    
}

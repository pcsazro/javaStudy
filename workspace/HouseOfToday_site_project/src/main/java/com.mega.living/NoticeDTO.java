package com.mega.living;

public class NoticeDTO {
	int nid;
	String ntitle;
	String ncontent;
	String date;
	String mid;
	int count;
	String fileName;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "NoticeDTO [nid=" + nid + ", ntitle=" + ntitle + ", ncontent=" + ncontent + ", date=" + date + ", mid="
				+ mid + ", count=" + count + ", fileName=" + fileName + "]";
	}
	
	
	
}

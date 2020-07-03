package com.mega.living;

public class noticeDTO {
	private int nid;
	public String ntitle;
	public String ncontent;
	public String date;
	private int mid;
	public int count;
	
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
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "noticeDTO [nid=" + nid + ", ntitle=" + ntitle + ", ncontent=" + ncontent + ", date=" + date + ", mid="
				+ mid + ", count=" + count + "]";
	}
	
}

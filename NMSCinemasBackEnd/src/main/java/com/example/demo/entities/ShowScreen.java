package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShowScreen 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    private String movieName;
    
    private String imgName;
    
    private String language;
    
    private String date;
    
    private String time;
    
    private String price;
    
    private String A1;
    
    private String A2;
    
    private String A3;
    
    private String A4;
    
    private String A5;
    
    private String A6;
    
    private String A7;
    
    private String A8;
    
    //B
    private String B1;
    
    private String B2;
    
    private String B3;
    
    private String B4;
    
    private String B5;
    
    private String B6;
    
    private String B7;
    
    private String B8;
   
    //C
    private String C1;
    
    private String C2;
    
    private String C3;
    
    private String C4;
    
    private String C5;
    
    private String C6;
    
    private String C7;
    
    private String C8;
    
    
    //D
    private String D1;
    
    private String D2;
    
    private String D3;
    
    private String D4;
    
    private String D5;
    
    private String D6;
    
    private String D7;
    
    private String D8;
    
    
    //E
    private String E1;
    
    private String E2;
    
    private String E3;
    
    private String E4;
    
    private String E5;
    
    private String E6;
    
    private String E7;
    
    private String E8;
    
    
    //F
    private String F1;
    
    private String F2;
    
    private String F3;
    
    private String F4;
    
    private String F5;
    
    private String F6;
    
    private String F7;
    
    private String F8;

	public ShowScreen() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public ShowScreen(int id, String movieName,String imgName, String language, String date, String time, String price, String a1, String a2, String a3,
			String a4, String a5, String a6, String a7, String a8, String b1, String b2, String b3, String b4,
			String b5, String b6, String b7, String b8, String c1, String c2, String c3, String c4, String c5,
			String c6, String c7, String c8, String d1, String d2, String d3, String d4, String d5, String d6,
			String d7, String d8, String e1, String e2, String e3, String e4, String e5, String e6, String e7,
			String e8, String f1, String f2, String f3, String f4, String f5, String f6, String f7, String f8) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.imgName=imgName;
		this.language = language;
		this.date = date;
		this.time = time;
		this.price = price;
		
		A1 = a1;
		A2 = a2;
		A3 = a3;
		A4 = a4;
		A5 = a5;
		A6 = a6;
		A7 = a7;
		A8 = a8;
		B1 = b1;
		B2 = b2;
		B3 = b3;
		B4 = b4;
		B5 = b5;
		B6 = b6;
		B7 = b7;
		B8 = b8;
		C1 = c1;
		C2 = c2;
		C3 = c3;
		C4 = c4;
		C5 = c5;
		C6 = c6;
		C7 = c7;
		C8 = c8;
		D1 = d1;
		D2 = d2;
		D3 = d3;
		D4 = d4;
		D5 = d5;
		D6 = d6;
		D7 = d7;
		D8 = d8;
		E1 = e1;
		E2 = e2;
		E3 = e3;
		E4 = e4;
		E5 = e5;
		E6 = e6;
		E7 = e7;
		E8 = e8;
		F1 = f1;
		F2 = f2;
		F3 = f3;
		F4 = f4;
		F5 = f5;
		F6 = f6;
		F7 = f7;
		F8 = f8;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	
	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getA1() {
		return A1;
	}

	public void setA1(String a1) {
		A1 = a1;
	}

	public String getA2() {
		return A2;
	}

	public void setA2(String a2) {
		A2 = a2;
	}

	public String getA3() {
		return A3;
	}

	public void setA3(String a3) {
		A3 = a3;
	}

	public String getA4() {
		return A4;
	}

	public void setA4(String a4) {
		A4 = a4;
	}

	public String getA5() {
		return A5;
	}

	public void setA5(String a5) {
		A5 = a5;
	}

	public String getA6() {
		return A6;
	}

	public void setA6(String a6) {
		A6 = a6;
	}

	public String getA7() {
		return A7;
	}

	public void setA7(String a7) {
		A7 = a7;
	}

	public String getA8() {
		return A8;
	}

	public void setA8(String a8) {
		A8 = a8;
	}

	public String getB1() {
		return B1;
	}

	public void setB1(String b1) {
		B1 = b1;
	}

	public String getB2() {
		return B2;
	}

	public void setB2(String b2) {
		B2 = b2;
	}

	public String getB3() {
		return B3;
	}

	public void setB3(String b3) {
		B3 = b3;
	}

	public String getB4() {
		return B4;
	}

	public void setB4(String b4) {
		B4 = b4;
	}

	public String getB5() {
		return B5;
	}

	public void setB5(String b5) {
		B5 = b5;
	}

	public String getB6() {
		return B6;
	}

	public void setB6(String b6) {
		B6 = b6;
	}

	public String getB7() {
		return B7;
	}

	public void setB7(String b7) {
		B7 = b7;
	}

	public String getB8() {
		return B8;
	}

	public void setB8(String b8) {
		B8 = b8;
	}

	public String getC1() {
		return C1;
	}

	public void setC1(String c1) {
		C1 = c1;
	}

	public String getC2() {
		return C2;
	}

	public void setC2(String c2) {
		C2 = c2;
	}

	public String getC3() {
		return C3;
	}

	public void setC3(String c3) {
		C3 = c3;
	}

	public String getC4() {
		return C4;
	}

	public void setC4(String c4) {
		C4 = c4;
	}

	public String getC5() {
		return C5;
	}

	public void setC5(String c5) {
		C5 = c5;
	}

	public String getC6() {
		return C6;
	}

	public void setC6(String c6) {
		C6 = c6;
	}

	public String getC7() {
		return C7;
	}

	public void setC7(String c7) {
		C7 = c7;
	}

	public String getC8() {
		return C8;
	}

	public void setC8(String c8) {
		C8 = c8;
	}

	public String getD1() {
		return D1;
	}

	public void setD1(String d1) {
		D1 = d1;
	}

	public String getD2() {
		return D2;
	}

	public void setD2(String d2) {
		D2 = d2;
	}

	public String getD3() {
		return D3;
	}

	public void setD3(String d3) {
		D3 = d3;
	}

	public String getD4() {
		return D4;
	}

	public void setD4(String d4) {
		D4 = d4;
	}

	public String getD5() {
		return D5;
	}

	public void setD5(String d5) {
		D5 = d5;
	}

	public String getD6() {
		return D6;
	}

	public void setD6(String d6) {
		D6 = d6;
	}

	public String getD7() {
		return D7;
	}

	public void setD7(String d7) {
		D7 = d7;
	}

	public String getD8() {
		return D8;
	}

	public void setD8(String d8) {
		D8 = d8;
	}

	public String getE1() {
		return E1;
	}

	public void setE1(String e1) {
		E1 = e1;
	}

	public String getE2() {
		return E2;
	}

	public void setE2(String e2) {
		E2 = e2;
	}

	public String getE3() {
		return E3;
	}

	public void setE3(String e3) {
		E3 = e3;
	}

	public String getE4() {
		return E4;
	}

	public void setE4(String e4) {
		E4 = e4;
	}

	public String getE5() {
		return E5;
	}

	public void setE5(String e5) {
		E5 = e5;
	}

	public String getE6() {
		return E6;
	}

	public void setE6(String e6) {
		E6 = e6;
	}

	public String getE7() {
		return E7;
	}

	public void setE7(String e7) {
		E7 = e7;
	}

	public String getE8() {
		return E8;
	}

	public void setE8(String e8) {
		E8 = e8;
	}

	public String getF1() {
		return F1;
	}

	public void setF1(String f1) {
		F1 = f1;
	}

	public String getF2() {
		return F2;
	}

	public void setF2(String f2) {
		F2 = f2;
	}

	public String getF3() {
		return F3;
	}

	public void setF3(String f3) {
		F3 = f3;
	}

	public String getF4() {
		return F4;
	}

	public void setF4(String f4) {
		F4 = f4;
	}

	public String getF5() {
		return F5;
	}

	public void setF5(String f5) {
		F5 = f5;
	}

	public String getF6() {
		return F6;
	}

	public void setF6(String f6) {
		F6 = f6;
	}

	public String getF7() {
		return F7;
	}

	public void setF7(String f7) {
		F7 = f7;
	}

	public String getF8() {
		return F8;
	}

	public void setF8(String f8) {
		F8 = f8;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "ShowScreen [id=" + id + ", movieName=" + movieName + ", language=" + language + ", date=" + date
				+ ", time=" + time + ", price=" + price + ", A1=" + A1 + ", A2=" + A2 + ", A3=" + A3 + ", A4=" + A4
				+ ", A5=" + A5 + ", A6=" + A6 + ", A7=" + A7 + ", A8=" + A8 + ", B1=" + B1 + ", B2=" + B2 + ", B3=" + B3
				+ ", B4=" + B4 + ", B5=" + B5 + ", B6=" + B6 + ", B7=" + B7 + ", B8=" + B8 + ", C1=" + C1 + ", C2=" + C2
				+ ", C3=" + C3 + ", C4=" + C4 + ", C5=" + C5 + ", C6=" + C6 + ", C7=" + C7 + ", C8=" + C8 + ", D1=" + D1
				+ ", D2=" + D2 + ", D3=" + D3 + ", D4=" + D4 + ", D5=" + D5 + ", D6=" + D6 + ", D7=" + D7 + ", D8=" + D8
				+ ", E1=" + E1 + ", E2=" + E2 + ", E3=" + E3 + ", E4=" + E4 + ", E5=" + E5 + ", E6=" + E6 + ", E7=" + E7
				+ ", E8=" + E8 + ", F1=" + F1 + ", F2=" + F2 + ", F3=" + F3 + ", F4=" + F4 + ", F5=" + F5 + ", F6=" + F6
				+ ", F7=" + F7 + ", F8=" + F8 + "]";
	}
    
		
	}



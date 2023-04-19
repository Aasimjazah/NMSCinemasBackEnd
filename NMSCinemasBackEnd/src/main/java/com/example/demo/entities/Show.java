package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Show 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    private String movieName;
    
    private String language;
    
    private String day;
    
    private String time;
    
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

	private Show(int id, String movieName, String language, String day, String time, String a1, String a2, String a3,
			String a4, String a5, String a6, String a7, String a8, String b1, String b2, String b3, String b4,
			String b5, String b6, String b7, String b8, String c1, String c2, String c3, String c4, String c5,
			String c6, String c7, String c8, String d1, String d2, String d3, String d4, String d5, String d6,
			String d7, String d8, String e1, String e2, String e3, String e4, String e5, String e6, String e7,
			String e8, String f1, String f2, String f3, String f4, String f5, String f6, String f7, String f8) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.language = language;
		this.day = day;
		this.time = time;
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

	private Show() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Show [id=" + id + ", movieName=" + movieName + ", language=" + language + ", day=" + day + ", time="
				+ time + ", A1=" + A1 + ", A2=" + A2 + ", A3=" + A3 + ", A4=" + A4 + ", A5=" + A5 + ", A6=" + A6
				+ ", A7=" + A7 + ", A8=" + A8 + ", B1=" + B1 + ", B2=" + B2 + ", B3=" + B3 + ", B4=" + B4 + ", B5=" + B5
				+ ", B6=" + B6 + ", B7=" + B7 + ", B8=" + B8 + ", C1=" + C1 + ", C2=" + C2 + ", C3=" + C3 + ", C4=" + C4
				+ ", C5=" + C5 + ", C6=" + C6 + ", C7=" + C7 + ", C8=" + C8 + ", D1=" + D1 + ", D2=" + D2 + ", D3=" + D3
				+ ", D4=" + D4 + ", D5=" + D5 + ", D6=" + D6 + ", D7=" + D7 + ", D8=" + D8 + ", E1=" + E1 + ", E2=" + E2
				+ ", E3=" + E3 + ", E4=" + E4 + ", E5=" + E5 + ", E6=" + E6 + ", E7=" + E7 + ", E8=" + E8 + ", F1=" + F1
				+ ", F2=" + F2 + ", F3=" + F3 + ", F4=" + F4 + ", F5=" + F5 + ", F6=" + F6 + ", F7=" + F7 + ", F8=" + F8
				+ "]";
	}

    
    
		
		
	}



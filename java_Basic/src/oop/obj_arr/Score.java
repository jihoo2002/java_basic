package oop.obj_arr;

public class Score {
	
	private String name;
	private int lang;
	private int eng;
	private int math;
	private double avg;
	private int total;
	
	public Score() {
		
	}
	
	public Score(String name, int lang, int eng, int math, int total, double avg) {
		super();
		this.name = name;
		this.lang = lang;
		this.eng = eng;
		this.math = math;
		this.avg =avg;
		this.total = total; //this.total은 위에 필드값 가르킴
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLang() {
		return lang;
	}

	public void setLang(int lang) {
		this.lang = lang;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void ScoreInfo() {
		System.out.printf(" 이름:%s   국어점수:%d   영어점수:%d   수학점수:%d\n 총점:%d\n 평균: %.2f\n",
				this.name, this.lang, this.eng, this.math, this.total, this.avg);
	}
	
}

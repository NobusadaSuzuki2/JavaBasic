package practice14.common;

public class JavaCourse implements Course{

	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */
	
	public String getCourseName() {
		return "【Eラーニング】Java";
	}
	public String[] getCourseUnit() {
		final String[] TANGEN = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return TANGEN;
	}

	
	
	
	
	
	
	
	
	
	
}
	
	/*
	private String courseName;
	private String[] courseUnit;
	
	
	public String getCourseName() {
		
		return this.courseName;
	}
	public String[] getCourseUnit() {
		return this.courseUnit;
	}
	 
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setCourseUnit(String[] tangen) {
		this.courseUnit = tangen;
	}
	*/
	


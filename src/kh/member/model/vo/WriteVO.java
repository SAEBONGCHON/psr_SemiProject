package kh.member.model.vo;

public class WriteVO {
	//TB_WRITE
//    W_NUM NUMBER NOT NULL PRIMARY KEY,
//    USERID VARCHAR2(30CHAR)	NOT NULL,
//    W_DATE	DATE NOT NULL,
//    W_TITLE	VARCHAR2(100)	NOT NULL,
//    W_CONTENT VARCHAR2(2000CHAR)	NOT NULL,
//    W_KEYWORD VARCHAR2(100CHAR),	
//    W_TRANS	VARCHAR2(2000CHAR)	NOT NULL,
//    W_IDEA	VARCHAR2(2000CHAR)	NOT NULL,
//    W_QUESTION	VARCHAR2(2000CHAR)	NOT NULL

//	1	  user1 	23/02/16	제목	내용	키워드	필사	나의생각	질문하기
	
    private int W_NUM; 
    private String USERID;
    private String W_DATE;	
    private String W_TITLE;
    private String W_CONTENT;
    private String W_KEYWORD;	
    private String W_TRANS;	
    private String W_IDEA;	
    private String W_QUESTION;
    
    
    
	@Override
	public String toString() {
		return "WriteVO [W_NUM=" + W_NUM + ", USERID=" + USERID + ", W_DATE=" + W_DATE + ", W_TITLE=" + W_TITLE
				+ ", W_CONTENT=" + W_CONTENT + ", W_KEYWORD=" + W_KEYWORD + ", W_TRANS=" + W_TRANS + ", W_IDEA="
				+ W_IDEA + ", W_QUESTION=" + W_QUESTION + "]";
	}
	
	
	public WriteVO(int w_NUM, String uSERID, String w_DATE, String w_TITLE, String w_CONTENT, String w_KEYWORD,
			String w_TRANS, String w_IDEA, String w_QUESTION) {
		super();
		W_NUM = w_NUM;
		USERID = uSERID;
		W_DATE = w_DATE;
		W_TITLE = w_TITLE;
		W_CONTENT = w_CONTENT;
		W_KEYWORD = w_KEYWORD;
		W_TRANS = w_TRANS;
		W_IDEA = w_IDEA;
		W_QUESTION = w_QUESTION;
	}


	public WriteVO() {
		super();
	}


	public int getW_NUM() {
		return W_NUM;
	}
	public void setW_NUM(int w_NUM) {
		W_NUM = w_NUM;
	}
	public String getUSERID() {
		return USERID;
	}
	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}
	public String getW_DATE() {
		return W_DATE;
	}
	public void setW_DATE(String w_DATE) {
		W_DATE = w_DATE;
	}
	public String getW_TITLE() {
		return W_TITLE;
	}
	public void setW_TITLE(String w_TITLE) {
		W_TITLE = w_TITLE;
	}
	public String getW_CONTENT() {
		return W_CONTENT;
	}
	public void setW_CONTENT(String w_CONTENT) {
		W_CONTENT = w_CONTENT;
	}
	public String getW_KEYWORD() {
		return W_KEYWORD;
	}
	public void setW_KEYWORD(String w_KEYWORD) {
		W_KEYWORD = w_KEYWORD;
	}
	public String getW_TRANS() {
		return W_TRANS;
	}
	public void setW_TRANS(String w_TRANS) {
		W_TRANS = w_TRANS;
	}
	public String getW_IDEA() {
		return W_IDEA;
	}
	public void setW_IDEA(String w_IDEA) {
		W_IDEA = w_IDEA;
	}
	public String getW_QUESTION() {
		return W_QUESTION;
	}
	public void setW_QUESTION(String w_QUESTION) {
		W_QUESTION = w_QUESTION;
	}
    
    
	
}

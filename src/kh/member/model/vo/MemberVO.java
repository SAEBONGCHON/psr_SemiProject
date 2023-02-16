package kh.member.model.vo;

public class MemberVO {
	//TB_USER
//	USERID PASSWD NICKNAME  EMAIL
//	user1	user1	바바비	user1@naver.com
//	user2	user2	비빔밥	user2@naver.com
	private String userid;
	private String passwd;
	private String nickname;
	private String email;
	
	
	
	public MemberVO(String userid, String passwd, String nickname, String email) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.nickname = nickname;
		this.email = email;
	}
	public MemberVO() {}
	@Override
	public String toString() {
		return "memberVO [userid=" + userid + ", passwd=" + passwd + ", nickname=" + nickname + ", email=" + email
				+ "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
